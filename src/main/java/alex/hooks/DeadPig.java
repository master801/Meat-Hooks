package alex.hooks;

import alex.hooks.Hooks;

public class DeadPig extends yc {

   public DeadPig(int id) {
      super(id);
      this.d(1);
      this.a(ww.f);
      this.b("deadPig");
      this.d("Hooks".toLowerCase() + ":deadPig");
      this.e(1);
   }

   public boolean a(ye itemStack, uf player, abw world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.a(x, y, z);
      int blockMeta = world.h(x, y, z);
      if(blockId == Hooks.hook.cF) {
         if(world.c(x, y - 1, z)) {
            world.c(x, y, z, Hooks.hookedPig.cF);
            world.b(x, y, z, blockMeta, 2);
            world.f(x, y - 1, z, Hooks.Y2Inv.cF, blockMeta, 2);
            player.bn.d(itemStack.d);
         } else if(world.I) {
            player.a("Not enough space, try raising the hook.");
         }
      } else if(blockId == Hooks.spitStick.cF) {
         world.f(x, y, z, Hooks.spitPig.cF, blockMeta, 2);
         player.bn.d(itemStack.d);
      } else {
         if(blockId != Hooks.x2Inv.cF) {
            return false;
         }

         if(world.a(x + 1, y, z) == Hooks.spitStick.cF) {
            world.f(x + 1, y, z, Hooks.spitPig.cF, world.h(x + 1, y, z), 3);
         } else if(world.a(x - 1, y, z) == Hooks.spitStick.cF) {
            world.f(x - 1, y, z, Hooks.spitPig.cF, world.h(x - 1, y, z), 3);
         } else if(world.a(x, y, z - 1) == Hooks.spitStick.cF) {
            world.f(x, y, z - 1, Hooks.spitPig.cF, world.h(x, y, z - 1), 3);
         } else if(world.a(x, y, z + 1) == Hooks.spitStick.cF) {
            world.f(x, y, z + 1, Hooks.spitPig.cF, world.h(x, y, z + 1), 3);
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
