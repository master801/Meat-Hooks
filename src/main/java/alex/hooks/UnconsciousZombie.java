package alex.hooks;

import alex.hooks.Hooks;

public class UnconsciousZombie extends yc {

   public UnconsciousZombie(int id) {
      super(id);
      this.d(1);
      this.a(ww.f);
      this.b("unconZombie");
      this.d("Hooks".toLowerCase() + ":unconZombie");
      this.e(1);
   }

   public boolean a(ye itemStack, uf player, abw world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.a(x, y, z);
      int blockMeta = world.h(x, y, z);
      if(blockId != Hooks.hook.cF) {
         return false;
      } else {
         if(world.c(x, y - 1, z) && world.c(x, y - 2, z)) {
            world.c(x, y, z, Hooks.hookedZombie.cF);
            world.b(x, y, z, blockMeta, 2);
            world.f(x, y - 1, z, Hooks.Y3MInv.cF, blockMeta, 2);
            world.f(x, y - 2, z, Hooks.Y3BInv.cF, blockMeta, 2);
            player.bn.d(itemStack.d);
         } else if(world.I) {
            player.a("Not enough space, try raising the hook.");
         }

         return true;
      }
   }
}
