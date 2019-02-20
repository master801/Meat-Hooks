package alex.hooks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceChestEntity extends TileEntity implements IInventory {

    private ItemStack[] chestContents = new ItemStack[36];
    public boolean adjacentChestChecked;
    public IceChestEntity adjacentChestZNeg;
    public IceChestEntity adjacentChestXPos;
    public IceChestEntity adjacentChestXNeg;
    public IceChestEntity adjacentChestZPosition;
    public float lidAngle;
    public float prevLidAngle;
    public int numUsingPlayers;
    private int ticksSinceSync;
    private int cachedChestType;
    private String customName;


    public IceChestEntity() {
        this.cachedChestType = -1;
    }

    @SideOnly(Side.CLIENT)
    public IceChestEntity(int par1) {
        this.cachedChestType = par1;
    }

    @Override
    public int getSizeInventory() {
        return 27;
    }

    @Override
    public ItemStack getStackInSlot(int par1) {
        return this.chestContents[par1];
    }

    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if(this.chestContents[par1] != null) {
            ItemStack itemstack;
            if(this.chestContents[par1].stackSize <= par2) {
                itemstack = this.chestContents[par1];
                this.chestContents[par1] = null;
                this.onInventoryChanged();
                return itemstack;
            } else {
                itemstack = this.chestContents[par1].splitStack(par2);
                if(this.chestContents[par1].stackSize == 0) {
                    this.chestContents[par1] = null;
                }

                this.onInventoryChanged();
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if(this.chestContents[par1] != null) {
            ItemStack itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
        this.chestContents[par1] = par2ItemStack;
        if(par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }

        this.onInventoryChanged();
    }

    @Override
    public String getInvName() {
        return isInvNameLocalized() ? customName : "container.chest";
    }

    @Override
    public boolean isInvNameLocalized() {
        return customName != null && customName.length() > 0;
    }

    public void setChestGuiName(String par1Str) {
        this.customName = par1Str;
    }

    @Override
    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.chestContents = new ItemStack[this.getSizeInventory()];
        if(par1NBTTagCompound.hasKey("CustomName")) {
            this.customName = par1NBTTagCompound.getString("CustomName");
        }

        for(int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 255;
            if(j >= 0 && j < this.chestContents.length) {
                this.chestContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

    }

    @Override
    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = new NBTTagList();

        for(int i = 0; i < this.chestContents.length; ++i) {
            if(this.chestContents[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.chestContents[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);
        if(this.isInvNameLocalized()) {
            par1NBTTagCompound.setString("CustomName", this.customName);
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
        return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && par1EntityPlayer.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64.0D;
    }

    @Override
    public void updateContainingBlockInfo() {
        super.updateContainingBlockInfo();
        this.adjacentChestChecked = false;
    }

    private void func_90009_a(IceChestEntity par1IceChestEntity, int par2) {
        if(par1IceChestEntity.isInvalid()) {
            this.adjacentChestChecked = false;
        } else if(this.adjacentChestChecked) {
            switch(par2) {
                case 0:
                    if(this.adjacentChestZPosition != par1IceChestEntity) {
                        this.adjacentChestChecked = false;
                    }
                    break;
                case 1:
                    if(this.adjacentChestXNeg != par1IceChestEntity) {
                        this.adjacentChestChecked = false;
                    }
                    break;
                case 2:
                    if(this.adjacentChestZNeg != par1IceChestEntity) {
                        this.adjacentChestChecked = false;
                    }
                    break;
                case 3:
                    if(this.adjacentChestXPos != par1IceChestEntity) {
                        this.adjacentChestChecked = false;
                    }
            }
        }

    }

    public void checkForAdjacentChests() {
        if(!this.adjacentChestChecked) {
            this.adjacentChestChecked = true;
            this.adjacentChestZNeg = null;
            this.adjacentChestXPos = null;
            this.adjacentChestXNeg = null;
            this.adjacentChestZPosition = null;
            if(this.func_94044_a(this.xCoord - 1, this.yCoord, this.zCoord)) {
                this.adjacentChestXNeg = (IceChestEntity)this.worldObj.getBlockTileEntity(this.xCoord - 1, this.yCoord, this.zCoord);
            }

            if(this.func_94044_a(this.xCoord + 1, this.yCoord, this.zCoord)) {
                this.adjacentChestXPos = (IceChestEntity)this.worldObj.getBlockTileEntity(this.xCoord + 1, this.yCoord, this.zCoord);
            }

            if(this.func_94044_a(this.xCoord, this.yCoord, this.zCoord - 1)) {
                this.adjacentChestZNeg = (IceChestEntity)this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord - 1);
            }

            if(this.func_94044_a(this.xCoord, this.yCoord, this.zCoord + 1)) {
                this.adjacentChestZPosition = (IceChestEntity)this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord + 1);
            }

            if(this.adjacentChestZNeg != null) {
                this.adjacentChestZNeg.func_90009_a(this, 0);
            }

            if(this.adjacentChestZPosition != null) {
                this.adjacentChestZPosition.func_90009_a(this, 2);
            }

            if(this.adjacentChestXPos != null) {
                this.adjacentChestXPos.func_90009_a(this, 1);
            }

            if(this.adjacentChestXNeg != null) {
                this.adjacentChestXNeg.func_90009_a(this, 3);
            }
        }

    }

    private boolean func_94044_a(int par1, int par2, int par3) {
        Block block = Block.blocksList[this.worldObj.getBlockId(par1, par2, par3)];
        return block instanceof IceChest && ((IceChest)block).chestType == getChestType();
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        this.checkForAdjacentChests();
        ++this.ticksSinceSync;
        float f;
        if(!this.worldObj.isRemote && this.numUsingPlayers != 0 && (this.ticksSinceSync + this.xCoord + this.yCoord + this.zCoord) % 200 == 0) {
            this.numUsingPlayers = 0;
            f = 5.0F;
            List<EntityPlayer> d0 = worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getAABBPool().getAABB((double)((float)this.xCoord - f), (double)((float)this.yCoord - f), (double)((float)this.zCoord - f), (double)((float)(this.xCoord + 1) + f), (double)((float)(this.yCoord + 1) + f), (double)((float)(this.zCoord + 1) + f)));

            for(EntityPlayer entityPlayer : d0) {
                if(entityPlayer.openContainer instanceof ContainerChest) {
                    IInventory f2 = ((ContainerChest)entityPlayer.openContainer).getLowerChestInventory();
                    if(f2 == this || f2 instanceof InventoryLargeChest && ((InventoryLargeChest)f2).isPartOfLargeChest(this)) {
                        ++this.numUsingPlayers;
                    }
                }
            }
        }

        this.prevLidAngle = this.lidAngle;
        f = 0.1F;
        double var8;
        if(this.numUsingPlayers > 0 && this.lidAngle == 0.0F && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null) {
            double var9 = (double)this.xCoord + 0.5D;
            var8 = (double)this.zCoord + 0.5D;
            if(this.adjacentChestZPosition != null) {
                var8 += 0.5D;
            }

            if(this.adjacentChestXPos != null) {
                var9 += 0.5D;
            }

            this.worldObj.playSoundEffect(var9, (double)this.yCoord + 0.5D, var8, "random.chestopen", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
        }

        if(this.numUsingPlayers == 0 && this.lidAngle > 0.0F || this.numUsingPlayers > 0 && this.lidAngle < 1.0F) {
            float var10 = this.lidAngle;
            if(this.numUsingPlayers > 0) {
                this.lidAngle += f;
            } else {
                this.lidAngle -= f;
            }

            if(this.lidAngle > 1.0F) {
                this.lidAngle = 1.0F;
            }

            float var11 = 0.5F;
            if(this.lidAngle < var11 && var10 >= var11 && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null) {
                var8 = (double)this.xCoord + 0.5D;
                double d2 = (double)this.zCoord + 0.5D;
                if(this.adjacentChestZPosition != null) {
                    d2 += 0.5D;
                }

                if(this.adjacentChestXPos != null) {
                    var8 += 0.5D;
                }

                this.worldObj.playSoundEffect(var8, (double)this.yCoord + 0.5D, d2, "random.chestclosed", 0.5F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
            }

            if(this.lidAngle < 0.0F) {
                this.lidAngle = 0.0F;
            }
        }

    }

    @Override
    public boolean receiveClientEvent(int par1, int par2) {
        if(par1 == 1) {
            this.numUsingPlayers = par2;
            return true;
        } else {
            return super.receiveClientEvent(par1, par2);
        }
    }

    @Override
    public void openChest() {
        if(this.numUsingPlayers < 0) {
            this.numUsingPlayers = 0;
        }

        ++this.numUsingPlayers;
        this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID, 1, this.numUsingPlayers);
        this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID);
        this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType().blockID);
    }

    @Override
    public void closeChest() {
        if(this.getBlockType() != null && this.getBlockType() instanceof IceChest) {
            --this.numUsingPlayers;
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID, 1, this.numUsingPlayers);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType().blockID);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType().blockID);
        }

    }

    @Override
    public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack) {
        return true;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.updateContainingBlockInfo();
        this.checkForAdjacentChests();
    }

    public int getChestType() {
        if(this.cachedChestType == -1) {
            if(this.worldObj == null || !(this.getBlockType() instanceof IceChest)) {
                return 0;
            }

            this.cachedChestType = ((IceChest)this.getBlockType()).chestType;
        }
        return this.cachedChestType;
    }

}
