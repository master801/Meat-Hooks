package alex.hooks;

import alex.hooks.Hooks;

public class Filet extends yc {

   public Filet(int id) {
      super(id);
      this.d(1);
      this.a(ww.i);
      this.b("filet");
      this.d("Hooks".toLowerCase() + ":filet");
      this.e(15);
   }

   public boolean a(ye itemStack, uf player, abw world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.a(x, y, z);
      int metaData = world.h(x, y, z);
      if(blockId == Hooks.hookedCow.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.a(x, y - 2, z, false);
         world.f(x, y, z, Hooks.skinnedCow.cF, metaData, 2);
         world.f(x, y - 1, z, Hooks.Y3MInv.cF, metaData, 2);
         world.f(x, y - 2, z, Hooks.Y3BInv.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.hookedPig.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.skinnedPig.cF, metaData, 2);
         world.f(x, y - 1, z, Hooks.Y2Inv.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.hookedChicken.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.skinnedChicken.cF, metaData, 2);
         world.f(x, y - 1, z, Hooks.Y2Inv.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.Y2Inv.cF) {
         if(world.a(x, y + 1, z) == Hooks.hookedChicken.cF) {
            world.a(x, y, z, false);
            world.a(x, y + 1, z, true);
            world.f(x, y + 1, z, Hooks.skinnedChicken.cF, metaData, 2);
            world.f(x, y, z, Hooks.Y2Inv.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }

         if(world.a(x, y + 1, z) == Hooks.hookedPig.cF) {
            world.a(x, y + 1, z, true);
            world.f(x, y + 1, z, Hooks.skinnedPig.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      } else if(blockId == Hooks.Y3MInv.cF) {
         if(world.a(x, y + 1, z) == Hooks.hookedCow.cF) {
            world.a(x, y + 1, z, true);
            world.f(x, y + 1, z, Hooks.skinnedCow.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      } else {
         if(blockId != Hooks.Y3BInv.cF) {
            return false;
         }

         if(world.a(x, y + 2, z) == Hooks.hookedCow.cF) {
            world.a(x, y + 2, z, true);
            world.f(x, y + 2, z, Hooks.skinnedCow.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      }

      if(itemStack.k() >= itemStack.l()) {
         --itemStack.b;
      }

      return true;
   }

   public int c() {
      return 3;
   }
}
