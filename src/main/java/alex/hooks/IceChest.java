package alex.hooks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import java.util.Iterator;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceChest extends BlockContainer {

    private final Random random = new Random();
    public final int chestType;

    protected IceChest(int par1, int par2) {
        super(par1, Material.ice);
        this.chestType = par2;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        this.setTextureName("Hooks".toLowerCase() + ":deadCow");
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        if(par1IBlockAccess.getBlockId(par2, par3, par4 - 1) == this.blockID) {
            this.setBlockBounds(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
        } else if(par1IBlockAccess.getBlockId(par2, par3, par4 + 1) == this.blockID) {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
        } else if(par1IBlockAccess.getBlockId(par2 - 1, par3, par4) == this.blockID) {
            this.setBlockBounds(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        } else if(par1IBlockAccess.getBlockId(par2 + 1, par3, par4) == this.blockID) {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
        } else {
            this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        }

    }

    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.unifyAdjacentChests(par1World, par2, par3, par4);
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);

        if(l == this.blockID) {
            this.unifyAdjacentChests(par1World, par2, par3, par4 - 1);
        }
        if(i1 == this.blockID) {
            this.unifyAdjacentChests(par1World, par2, par3, par4 + 1);
        }
        if(j1 == this.blockID) {
            this.unifyAdjacentChests(par1World, par2 - 1, par3, par4);
        }
        if(k1 == this.blockID) {
            this.unifyAdjacentChests(par1World, par2 + 1, par3, par4);
        }
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);
        byte b0 = 0;
        int l1 = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        if(l1 == 0) {
            b0 = 2;
        }

        if(l1 == 1) {
            b0 = 5;
        }

        if(l1 == 2) {
            b0 = 3;
        }

        if(l1 == 3) {
            b0 = 4;
        }

        if(l != this.blockID && i1 != this.blockID && j1 != this.blockID && k1 != this.blockID) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
        } else {
            if((l == this.blockID || i1 == this.blockID) && (b0 == 4 || b0 == 5)) {
                if(l == this.blockID) {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4 - 1, b0, 3);
                } else {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4 + 1, b0, 3);
                }

                par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
            }

            if((j1 == this.blockID || k1 == this.blockID) && (b0 == 2 || b0 == 3)) {
                if(j1 == this.blockID) {
                    par1World.setBlockMetadataWithNotify(par2 - 1, par3, par4, b0, 3);
                } else {
                    par1World.setBlockMetadataWithNotify(par2 + 1, par3, par4, b0, 3);
                }

                par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
            }
        }

        if(par6ItemStack.hasDisplayName()) {
            ((IceChestEntity)par1World.getBlockTileEntity(par2, par3, par4)).setChestGuiName(par6ItemStack.getDisplayName());
        }

    }

    public void unifyAdjacentChests(World par1World, int par2, int par3, int par4) {
        if(!par1World.isRemote) {
            int l = par1World.getBlockId(par2, par3, par4 - 1);
            int i1 = par1World.getBlockId(par2, par3, par4 + 1);
            int j1 = par1World.getBlockId(par2 - 1, par3, par4);
            int k1 = par1World.getBlockId(par2 + 1, par3, par4);
            boolean flag = true;
            int l1;
            int i2;
            boolean flag1;
            byte b0;
            int j2;
            if(l != this.blockID && i1 != this.blockID) {
                if(j1 != this.blockID && k1 != this.blockID) {
                    b0 = 3;
                    if(Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1]) {
                        b0 = 3;
                    }

                    if(Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l]) {
                        b0 = 2;
                    }

                    if(Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1]) {
                        b0 = 5;
                    }

                    if(Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1]) {
                        b0 = 4;
                    }
                } else {
                    l1 = par1World.getBlockId(j1 == this.blockID?par2 - 1:par2 + 1, par3, par4 - 1);
                    i2 = par1World.getBlockId(j1 == this.blockID?par2 - 1:par2 + 1, par3, par4 + 1);
                    b0 = 3;
                    flag1 = true;
                    if(j1 == this.blockID) {
                        j2 = par1World.getBlockMetadata(par2 - 1, par3, par4);
                    } else {
                        j2 = par1World.getBlockMetadata(par2 + 1, par3, par4);
                    }

                    if(j2 == 2) {
                        b0 = 2;
                    }

                    if((Block.opaqueCubeLookup[l] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[i2]) {
                        b0 = 3;
                    }

                    if((Block.opaqueCubeLookup[i1] || Block.opaqueCubeLookup[i2]) && !Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[l1]) {
                        b0 = 2;
                    }
                }
            } else {
                l1 = par1World.getBlockId(par2 - 1, par3, l == this.blockID?par4 - 1:par4 + 1);
                i2 = par1World.getBlockId(par2 + 1, par3, l == this.blockID?par4 - 1:par4 + 1);
                b0 = 5;
                flag1 = true;
                if(l == this.blockID) {
                    j2 = par1World.getBlockMetadata(par2, par3, par4 - 1);
                } else {
                    j2 = par1World.getBlockMetadata(par2, par3, par4 + 1);
                }

                if(j2 == 4) {
                    b0 = 4;
                }

                if((Block.opaqueCubeLookup[j1] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[i2]) {
                    b0 = 5;
                }

                if((Block.opaqueCubeLookup[k1] || Block.opaqueCubeLookup[i2]) && !Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[l1]) {
                    b0 = 4;
                }
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
        }

    }

    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
        int l = 0;
        if(par1World.getBlockId(par2 - 1, par3, par4) == this.blockID) {
            ++l;
        }

        if(par1World.getBlockId(par2 + 1, par3, par4) == this.blockID) {
            ++l;
        }

        if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID) {
            ++l;
        }

        if(par1World.getBlockId(par2, par3, par4 + 1) == this.blockID) {
            ++l;
        }

        return l > 1?false:(this.isThereANeighborChest(par1World, par2 - 1, par3, par4)?false:(this.isThereANeighborChest(par1World, par2 + 1, par3, par4)?false:(this.isThereANeighborChest(par1World, par2, par3, par4 - 1)?false:!this.isThereANeighborChest(par1World, par2, par3, par4 + 1))));
    }

    private boolean isThereANeighborChest(World par1World, int par2, int par3, int par4) {
        return par1World.getBlockId(par2, par3, par4) != this.blockID?false:(par1World.getBlockId(par2 - 1, par3, par4) == this.blockID?true:(par1World.getBlockId(par2 + 1, par3, par4) == this.blockID?true:(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID?true:par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)));
    }

    @Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        IceChestEntity IceChestEntity = (IceChestEntity)par1World.getBlockTileEntity(par2, par3, par4);
        if(IceChestEntity != null) {
            IceChestEntity.updateContainingBlockInfo();
        }
    }

    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
        IceChestEntity IceChestEntity = (IceChestEntity)par1World.getBlockTileEntity(par2, par3, par4);
        if(IceChestEntity != null) {
            for(int j1 = 0; j1 < IceChestEntity.getSizeInventory(); ++j1) {
                ItemStack itemstack = IceChestEntity.getStackInSlot(j1);
                if(itemstack != null) {
                    float f = this.random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.random.nextFloat() * 0.8F + 0.1F;

                    EntityItem entityitem;
                    for(float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; par1World.spawnEntityInWorld(entityitem)) {
                        int k1 = this.random.nextInt(21) + 10;
                        if(k1 > itemstack.stackSize) {
                            k1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= k1;
                        entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                        if(itemstack.hasTagCompound()) {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            par1World.func_96440_m(par2, par3, par4, par5);
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
        if (par1World.isRemote) return true;
        IInventory iinventory = this.getInventory(par1World, par2, par3, par4);
        if (iinventory != null) {
            par5EntityPlayer.displayGUIChest(iinventory);
        }
        return true;
    }

    public IInventory getInventory(World par1World, int par2, int par3, int par4) {
        TileEntity tileEntity = par1World.getBlockTileEntity(par2, par3, par4);

        IInventory object = null;
        if(tileEntity == null) {
            return null;
        } else if(par1World.isBlockSolidOnSide(par2, par3 + 1, par4, ForgeDirection.DOWN)) {
            return null;
        } else if(isOcelotBlockingChest(par1World, par2, par3, par4)) {
            return null;
        } else if(par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4))) {
            return null;
        } else if(par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4))) {
            return null;
        } else if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1))) {
            return null;
        } else if(par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1))) {
            return null;
        } else {
            if(par1World.getBlockId(par2 - 1, par3, par4) == this.blockID) {
                object = new InventoryLargeChest("container.chestDouble", (IceChestEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory)tileEntity);
            }
            if(par1World.getBlockId(par2 + 1, par3, par4) == this.blockID) {
                object = new InventoryLargeChest("container.chestDouble", (IInventory)tileEntity, (IceChestEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if(par1World.getBlockId(par2, par3, par4 - 1) == this.blockID) {
                object = new InventoryLargeChest("container.chestDouble", (IceChestEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory)tileEntity);
            }

            if(par1World.getBlockId(par2, par3, par4 + 1) == this.blockID) {
                object = new InventoryLargeChest("container.chestDouble", (IInventory)tileEntity, (IceChestEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            return (IInventory)object;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World par1World) {
        return new IceChestEntity();
    }

    @Override
    public boolean canProvidePower() {
        return this.chestType == 1;
    }

    @Override
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        if(!this.canProvidePower()) {
            return 0;
        } else {
            int i1 = ((IceChestEntity)par1IBlockAccess.getBlockTileEntity(par2, par3, par4)).numUsingPlayers;
            return MathHelper.clamp_int(i1, 0, 15);
        }
    }

    @Override
    public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return par5 == 1 ? isProvidingWeakPower(par1IBlockAccess, par2, par3, par4, par5):0;
    }

    public static boolean isOcelotBlockingChest(World par0World, int par1, int par2, int par3) {
        Iterator iterator = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().getAABB((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();

        while(iterator.hasNext()) {
            EntityOcelot entityocelot1 = (EntityOcelot)iterator.next();
            if(entityocelot1.isSitting()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean hasComparatorInputOverride() {
        return true;
    }

    @Override
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5) {
        return Container.calcRedstoneFromInventory(getInventory(par1World, par2, par3, par4));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        this.blockIcon = icon.registerIcon("Hooks:iceChest");
    }

}
