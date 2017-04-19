package alex.hooks;

import alex.hooks.Hooks;

public class SkinnedCow extends yc {

   public SkinnedCow(int id) {
      super(id);
      this.d(1);
      this.a(ww.f);
      this.b("iskinnedCow");
      this.d("Hooks".toLowerCase() + ":iskinnedCow");
      this.e(1);
   }

   public boolean a(ye itemStack, uf player, abw world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.a(x, y, z);
      int blockMeta = world.h(x, y, z);
      if(blockId == Hooks.hook.cF) {
         if(world.c(x, y - 1, z) && world.c(x, y - 2, z)) {
            world.c(x, y, z, Hooks.skinnedCow.cF);
            world.b(x, y, z, blockMeta, 2);
            world.f(x, y - 1, z, Hooks.Y3MInv.cF, blockMeta, 2);
            world.f(x, y - 2, z, Hooks.Y3BInv.cF, blockMeta, 2);
            player.bn.d(itemStack.d);
         } else if(world.I) {
            player.a("Not enough space, try raising the hook.");
         }
      } else if(blockId == Hooks.spitStick.cF) {
         world.f(x, y, z, Hooks.spitSkinnedCow.cF, blockMeta, 2);
         player.bn.d(itemStack.d);
      } else {
         if(blockId != Hooks.x2Inv.cF) {
            return false;
         }

         if(world.a(x + 1, y, z) == Hooks.spitStick.cF) {
            world.f(x + 1, y, z, Hooks.spitSkinnedCow.cF, world.h(x + 1, y, z), 3);
         } else if(world.a(x - 1, y, z) == Hooks.spitStick.cF) {
            world.f(x - 1, y, z, Hooks.spitSkinnedCow.cF, world.h(x - 1, y, z), 3);
         } else if(world.a(x, y, z - 1) == Hooks.spitStick.cF) {
            world.f(x, y, z - 1, Hooks.spitSkinnedCow.cF, world.h(x, y, z - 1), 3);
         } else if(world.a(x, y, z + 1) == Hooks.spitStick.cF) {
            world.f(x, y, z + 1, Hooks.spitSkinnedCow.cF, world.h(x, y, z + 1), 3);
         }

         player.bn.d(itemStack.d);
      }

      return true;
   }

   public void a(ye par1ItemStack, abw par2World, nn par3Entity, int par4, boolean par5) {
      if(par3Entity instanceof uf) {
         uf ep = (uf)par3Entity;
         if(par2World.s.nextInt(100000 / par1ItemStack.b) == 0) {
            ep.bn.d(par1ItemStack.d);
            ep.bn.a(new ye(yc.bo));
         }
      }

   }
}
