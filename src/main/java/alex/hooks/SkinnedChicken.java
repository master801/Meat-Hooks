package alex.hooks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import alex.hooks.Hooks;

public class SkinnedChicken extends Item {

   public SkinnedChicken(int id) {
      super(id);
      this.d(4);
      this.a(ww.f);
      this.b("iskinnedChicken");
      this.d("Hooks".toLowerCase() + ":iskinnedChicken");
      this.e(1);
   }

   @Override
   public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.getBlockId(x, y, z);
      int blockMeta = world.getBlockMetadata(x, y, z);
      if(blockId == Hooks.hook.blockID) {
         if(world.c(x, y - 1, z)) {
            world.c(x, y, z, Hooks.skinnedChicken.blockID);
            world.b(x, y, z, blockMeta, 2);
            world.c(x, y - 1, z, Hooks.Y2Inv.blockID);
            world.b(x, y - 1, z, blockMeta, 2);
            player.bn.d(itemStack.d);
         } else if(world.I) {
            player.a("Not enough space, try raising the hook.");
         }
      } else if(blockId == Hooks.spitStick.blockID) {
         world.setBlock(x, y, z, Hooks.spitSkinnedChicken.blockID, blockMeta, 2);
         player.bn.d(itemStack.d);
      } else {
         if(blockId != Hooks.x2Inv.blockID) {
            return false;
         }

         if(world.getBlockId(x + 1, y, z) == Hooks.spitStick.blockID) {
            world.setBlock(x + 1, y, z, Hooks.spitSkinnedChicken.blockID, world.h(x + 1, y, z), 3);
         } else if(world.getBlockId(x - 1, y, z) == Hooks.spitStick.blockID) {
            world.setBlock(x - 1, y, z, Hooks.spitSkinnedChicken.blockID, world.h(x - 1, y, z), 3);
         } else if(world.getBlockId(x, y, z - 1) == Hooks.spitStick.blockID) {
            world.setBlock(x, y, z - 1, Hooks.spitSkinnedChicken.blockID, world.h(x, y, z - 1), 3);
         } else if(world.getBlockId(x, y, z + 1) == Hooks.spitStick.blockID) {
            world.setBlock(x, y, z + 1, Hooks.spitSkinnedChicken.blockID, world.h(x, y, z + 1), 3);
         }

         player.bn.d(itemStack.d);
      }

      return true;
   }



   @Override
   public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
      if(par3Entity instanceof EntityPlayer) {
         EntityPlayer ep = (EntityPlayer)par3Entity;
         if(par2World.rand.nextInt(100000 / par1ItemStack.b) == 0) {
            ep.bn.d(par1ItemStack.d);
            ep.bn.a(new ye(yc.bo));
         }
      }
   }

}
