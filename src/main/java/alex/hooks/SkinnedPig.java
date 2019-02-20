package alex.hooks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkinnedPig extends Item {

   public SkinnedPig(int id) {
      super(id);
      this.setMaxStackSize(1);
      this.setCreativeTab(CreativeTabs.tabMisc);
      this.setUnlocalizedName("iskinnedPig");
      this.setTextureName("Hooks".toLowerCase() + ":iskinnedPig");
      this.setMaxDamage(1);
   }

   @Override
   public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.getBlockId(x, y, z);
      int blockMeta = world.getBlockMetadata(x, y, z);
      if(blockId == Hooks.hook.blockID) {
         if(world.isAirBlock(x, y - 1, z)) {
            world.setBlock(x, y, z, Hooks.skinnedPig.blockID);
            world.setBlockMetadataWithNotify(x, y, z, blockMeta, 2);
            world.setBlock(x, y - 1, z, Hooks.Y2Inv.blockID, blockMeta, 2);
            player.inventory.consumeInventoryItem(itemStack.itemID);
         } else if(world.isRemote) {
            player.addChatMessage("Not enough space, try raising the hook.");
         }
      } else if(blockId == Hooks.spitStick.blockID) {
         world.setBlock(x, y, z, Hooks.spitSkinnedPig.blockID, blockMeta, 2);
         player.inventory.consumeInventoryItem(itemStack.itemID);
      } else {
         if(blockId != Hooks.x2Inv.blockID) {
            return false;
         }

         if(world.getBlockId(x + 1, y, z) == Hooks.spitStick.blockID) {
            world.setBlock(x + 1, y, z, Hooks.spitSkinnedPig.blockID, world.getBlockMetadata(x + 1, y, z), 3);
         } else if(world.getBlockId(x - 1, y, z) == Hooks.spitStick.blockID) {
            world.setBlock(x - 1, y, z, Hooks.spitSkinnedPig.blockID, world.getBlockMetadata(x - 1, y, z), 3);
         } else if(world.getBlockId(x, y, z - 1) == Hooks.spitStick.blockID) {
            world.setBlock(x, y, z - 1, Hooks.spitSkinnedPig.blockID, world.getBlockMetadata(x, y, z - 1), 3);
         } else if(world.getBlockId(x, y, z + 1) == Hooks.spitStick.blockID) {
            world.setBlock(x, y, z + 1, Hooks.spitSkinnedPig.blockID, world.getBlockMetadata(x, y, z + 1), 3);
         }

         player.inventory.consumeInventoryItem(itemStack.itemID);
      }

      return true;
   }

   @Override
   public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
      if(par3Entity instanceof EntityPlayer) {
         EntityPlayer ep = (EntityPlayer)par3Entity;
         if(par2World.rand.nextInt(100000 / par1ItemStack.stackSize) == 0) {
            ep.inventory.consumeInventoryItem(par1ItemStack.itemID);
            ep.inventory.addItemStackToInventory(new ItemStack(Item.rottenFlesh));
         }
      }
   }

}
