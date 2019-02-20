package alex.hooks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UnconsciousZombie extends Item {

   public UnconsciousZombie(int id) {
      super(id);
      this.setMaxStackSize(1);
      this.setCreativeTab(CreativeTabs.tabMisc);
      this.setUnlocalizedName("unconZombie");
      this.setTextureName("Hooks".toLowerCase() + ":unconZombie");
      this.setMaxDamage(1);
   }

   @Override
   public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.getBlockId(x, y, z);
      int blockMeta = world.getBlockMetadata(x, y, z);
      if(blockId != Hooks.hook.blockID) {
         return false;
      } else {
         if(world.isAirBlock(x, y - 1, z) && world.isAirBlock(x, y - 2, z)) {
            world.setBlock(x, y, z, Hooks.hookedZombie.blockID);
            world.setBlockMetadataWithNotify(x, y, z, blockMeta, 2);
            world.setBlock(x, y - 1, z, Hooks.Y3MInv.blockID, blockMeta, 2);
            world.setBlock(x, y - 2, z, Hooks.Y3BInv.blockID, blockMeta, 2);
            player.inventory.consumeInventoryItem(itemStack.itemID);
         } else if(world.isRemote) {
            player.addChatMessage("Not enough space, try raising the hook.");
         }
         return true;
      }
   }

}
