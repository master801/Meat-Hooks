package alex.hooks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Cleaver extends Item {

   public Cleaver(int id) {
      super(id);
      this.setMaxStackSize(1);
      this.setCreativeTab(CreativeTabs.tabTools);
      this.setUnlocalizedName("cleaver");
      this.setTextureName("Hooks".toLowerCase() + ":cleaver");
      this.setMaxDamage(15);
   }

   @Override
   public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.getBlockId(x, y, z);
      int metaData = world.getBlockMetadata(x, y, z);
      if(blockId == Hooks.skinnedCow.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.destroyBlock(x, y - 2, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.skinnedPig.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.skinnedChicken.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.Y2Inv.blockID) {
         if(world.getBlockId(x, y + 1, z) == Hooks.skinnedChicken.blockID || world.getBlockId(x, y + 1, z) == Hooks.skinnedPig.blockID || world.getBlockId(x, y + 1, z) == Hooks.rottenChicken.blockID || world.getBlockId(x, y + 1, z) == Hooks.rottenPig.blockID) {
            world.destroyBlock(x, y, z, false);
            world.destroyBlock(x, y + 1, z, true);
            world.setBlock(x, y + 1, z, Hooks.hook.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
         }
      } else if(blockId == Hooks.Y3MInv.blockID) {
         if(world.getBlockId(x, y + 1, z) == Hooks.skinnedCow.blockID || world.getBlockId(x, y + 1, z) == Hooks.rottenCow.blockID) {
            world.destroyBlock(x, y, z, false);
            world.destroyBlock(x, y - 1, z, false);
            world.destroyBlock(x, y + 1, z, true);
            world.setBlock(x, y + 1, z, Hooks.hook.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
         }
      } else if(blockId == Hooks.Y3BInv.blockID) {
         if(world.getBlockId(x, y + 2, z) == Hooks.skinnedCow.blockID || world.getBlockId(x, y + 2, z) == Hooks.rottenCow.blockID) {
            world.destroyBlock(x, y, z, false);
            world.destroyBlock(x, y + 1, z, false);
            world.destroyBlock(x, y + 2, z, true);
            world.setBlock(x, y + 2, z, Hooks.hook.blockID, metaData, 2);
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
         }
      } else if(blockId == Hooks.rottenCow.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.destroyBlock(x, y - 2, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.rottenPig.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.rottenChicken.blockID) {
         world.destroyBlock(x, y, z, true);
         world.destroyBlock(x, y - 1, z, false);
         world.setBlock(x, y, z, Hooks.hook.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.cookedChicken.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.cookedPig.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.cookedCow.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.burntChicken.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.burntPig.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else if(blockId == Hooks.burntCow.blockID) {
         world.destroyBlock(x, y, z, true);
         world.setBlock(x, y, z, Hooks.spitStick.blockID, metaData, 2);
         itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      } else {
         if(blockId != Hooks.x2Inv.blockID) {
            return false;
         }

         switch(metaData) {
         case 0:
            if(world.getBlockId(x, y, z + 1) == Hooks.cookedChicken.blockID || world.getBlockId(x, y, z + 1) == Hooks.cookedCow.blockID || world.getBlockId(x, y, z + 1) == Hooks.cookedPig.blockID || world.getBlockId(x, y, z + 1) == Hooks.burntChicken.blockID || world.getBlockId(x, y, z + 1) == Hooks.burntCow.blockID || world.getBlockId(x, y, z + 1) == Hooks.burntPig.blockID) {
               world.destroyBlock(x, y, z + 1, true);
               world.setBlock(x, y, z + 1, Hooks.spitStick.blockID, 0, 2);
               itemStack.setItemDamage(itemStack.getItemDamage() + 1);
               break;
            }
         case 1:
            if(world.getBlockId(x - 1, y, z) == Hooks.cookedChicken.blockID || world.getBlockId(x - 1, y, z) == Hooks.cookedCow.blockID || world.getBlockId(x - 1, y, z) == Hooks.cookedPig.blockID || world.getBlockId(x - 1, y, z) == Hooks.burntChicken.blockID || world.getBlockId(x - 1, y, z) == Hooks.burntCow.blockID || world.getBlockId(x - 1, y, z) == Hooks.burntPig.blockID) {
               world.destroyBlock(x - 1, y, z, true);
               world.setBlock(x - 1, y, z, Hooks.spitStick.blockID, 1, 2);
               itemStack.setItemDamage(itemStack.getItemDamage() + 1);
               break;
            }
         case 2:
            if(world.getBlockId(x, y, z - 1) == Hooks.cookedChicken.blockID || world.getBlockId(x, y, z - 1) == Hooks.cookedCow.blockID || world.getBlockId(x, y, z - 1) == Hooks.cookedPig.blockID || world.getBlockId(x, y, z - 1) == Hooks.burntChicken.blockID || world.getBlockId(x, y, z - 1) == Hooks.burntCow.blockID || world.getBlockId(x, y, z - 1) == Hooks.burntPig.blockID) {
               world.destroyBlock(x, y, z - 1, true);
               world.setBlock(x, y, z - 1, Hooks.spitStick.blockID, 2, 2);
               itemStack.setItemDamage(itemStack.getItemDamage() + 1);
               break;
            }
         case 3:
            label87: {
               if(world.getBlockId(x + 1, y, z) != Hooks.cookedChicken.blockID && world.getBlockId(x + 1, y, z) != Hooks.cookedCow.blockID && world.getBlockId(x + 1, y, z) != Hooks.cookedPig.blockID) {
                  x = 1;
                  if(world.getBlockId(1, y, z) != Hooks.burntChicken.blockID && world.getBlockId(x + 1, y, z) != Hooks.burntCow.blockID && world.getBlockId(x + 1, y, z) != Hooks.burntPig.blockID) {
                     break label87;
                  }
               }

               world.destroyBlock(x + 1, y, z, true);
               world.setBlock(x + 1, y, z, Hooks.spitStick.blockID, 3, 2);
               itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
         }
      }

      if(itemStack.getItemDamage() >= itemStack.getMaxDamage()) {
         --itemStack.stackSize;
      }

      return true;
   }

   @Override
   public int getItemEnchantability() {
      return 3;
   }

}
