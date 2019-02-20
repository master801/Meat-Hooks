package alex.hooks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Filet extends Item {

    public Filet(int id) {
        super(id);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setUnlocalizedName("filet");
        this.setTextureName("Hooks".toLowerCase() + ":filet");
        this.setMaxDamage(15);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        int blockId = world.getBlockId(x, y, z);
        int metaData = world.getBlockMetadata(x, y, z);
        if(blockId == Hooks.hookedCow.blockID) {
            world.destroyBlock(x, y, z, true);
            world.destroyBlock(x, y - 1, z, false);
            world.destroyBlock(x, y - 2, z, false);
            world.setBlock(x, y, z, Hooks.skinnedCow.blockID, metaData, 2);
            world.setBlock(x, y - 1, z, Hooks.Y3MInv.blockID, metaData, 2);
            world.setBlock(x, y - 2, z, Hooks.Y3BInv.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        } else if(blockId == Hooks.hookedPig.blockID) {
            world.destroyBlock(x, y, z, true);
            world.destroyBlock(x, y - 1, z, false);
            world.setBlock(x, y, z, Hooks.skinnedPig.blockID, metaData, 2);
            world.setBlock(x, y - 1, z, Hooks.Y2Inv.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        } else if(blockId == Hooks.hookedChicken.blockID) {
            world.destroyBlock(x, y, z, true);
            world.destroyBlock(x, y - 1, z, false);
            world.setBlock(x, y, z, Hooks.skinnedChicken.blockID, metaData, 2);
            world.setBlock(x, y - 1, z, Hooks.Y2Inv.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        } else if(blockId == Hooks.Y2Inv.blockID) {
            if(world.getBlockId(x, y + 1, z) == Hooks.hookedChicken.blockID) {
                world.destroyBlock(x, y, z, false);
                world.destroyBlock(x, y + 1, z, true);
                world.setBlock(x, y + 1, z, Hooks.skinnedChicken.blockID, metaData, 2);
                world.setBlock(x, y, z, Hooks.Y2Inv.blockID, metaData, 2);
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }

            if(world.getBlockId(x, y + 1, z) == Hooks.hookedPig.blockID) {
                world.destroyBlock(x, y + 1, z, true);
                world.setBlock(x, y + 1, z, Hooks.skinnedPig.blockID, metaData, 2);
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
        } else if(blockId == Hooks.Y3MInv.blockID) {
            if(world.getBlockId(x, y + 1, z) == Hooks.hookedCow.blockID) {
                world.destroyBlock(x, y + 1, z, true);
                world.setBlock(x, y + 1, z, Hooks.skinnedCow.blockID, metaData, 2);
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
        } else {
            if(blockId != Hooks.Y3BInv.blockID) {
                return false;
            }

            if(world.getBlockId(x, y + 2, z) == Hooks.hookedCow.blockID) {
                world.destroyBlock(x, y + 2, z, true);
                world.setBlock(x, y + 2, z, Hooks.skinnedCow.blockID, metaData, 2);
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
        }

        if(itemStack.getItemDamage() >= itemStack.getMaxDamage()) {
            --itemStack.stackSize;
        }

        return true;
    }

    public int c() {
        return 3;
    }
}
