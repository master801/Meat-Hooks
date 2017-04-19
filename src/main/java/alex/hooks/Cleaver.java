package alex.hooks;

import alex.hooks.Hooks;

public class Cleaver extends yc {

   public Cleaver(int id) {
      super(id);
      this.d(1);
      this.a(ww.i);
      this.b("cLeaver");
      this.d("Hooks".toLowerCase() + ":cleaver");
      this.e(15);
   }

   public boolean a(ye itemStack, uf player, abw world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
      int blockId = world.a(x, y, z);
      int metaData = world.h(x, y, z);
      if(blockId == Hooks.skinnedCow.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.a(x, y - 2, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.skinnedPig.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.skinnedChicken.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.Y2Inv.cF) {
         if(world.a(x, y + 1, z) == Hooks.skinnedChicken.cF || world.a(x, y + 1, z) == Hooks.skinnedPig.cF || world.a(x, y + 1, z) == Hooks.rottenChicken.cF || world.a(x, y + 1, z) == Hooks.rottenPig.cF) {
            world.a(x, y, z, false);
            world.a(x, y + 1, z, true);
            world.f(x, y + 1, z, Hooks.hook.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      } else if(blockId == Hooks.Y3MInv.cF) {
         if(world.a(x, y + 1, z) == Hooks.skinnedCow.cF || world.a(x, y + 1, z) == Hooks.rottenCow.cF) {
            world.a(x, y, z, false);
            world.a(x, y - 1, z, false);
            world.a(x, y + 1, z, true);
            world.f(x, y + 1, z, Hooks.hook.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      } else if(blockId == Hooks.Y3BInv.cF) {
         if(world.a(x, y + 2, z) == Hooks.skinnedCow.cF || world.a(x, y + 2, z) == Hooks.rottenCow.cF) {
            world.a(x, y, z, false);
            world.a(x, y + 1, z, false);
            world.a(x, y + 2, z, true);
            world.f(x, y + 2, z, Hooks.hook.cF, metaData, 2);
            itemStack.b(itemStack.k() + 1);
         }
      } else if(blockId == Hooks.rottenCow.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.a(x, y - 2, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.rottenPig.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.rottenChicken.cF) {
         world.a(x, y, z, true);
         world.a(x, y - 1, z, false);
         world.f(x, y, z, Hooks.hook.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.cookedChicken.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.cookedPig.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.cookedCow.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.burntChicken.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.burntPig.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else if(blockId == Hooks.burntCow.cF) {
         world.a(x, y, z, true);
         world.f(x, y, z, Hooks.spitStick.cF, metaData, 2);
         itemStack.b(itemStack.k() + 1);
      } else {
         if(blockId != Hooks.x2Inv.cF) {
            return false;
         }

         switch(metaData) {
         case 0:
            if(world.a(x, y, z + 1) == Hooks.cookedChicken.cF || world.a(x, y, z + 1) == Hooks.cookedCow.cF || world.a(x, y, z + 1) == Hooks.cookedPig.cF || world.a(x, y, z + 1) == Hooks.burntChicken.cF || world.a(x, y, z + 1) == Hooks.burntCow.cF || world.a(x, y, z + 1) == Hooks.burntPig.cF) {
               world.a(x, y, z + 1, true);
               world.f(x, y, z + 1, Hooks.spitStick.cF, 0, 2);
               itemStack.b(itemStack.k() + 1);
               break;
            }
         case 1:
            if(world.a(x - 1, y, z) == Hooks.cookedChicken.cF || world.a(x - 1, y, z) == Hooks.cookedCow.cF || world.a(x - 1, y, z) == Hooks.cookedPig.cF || world.a(x - 1, y, z) == Hooks.burntChicken.cF || world.a(x - 1, y, z) == Hooks.burntCow.cF || world.a(x - 1, y, z) == Hooks.burntPig.cF) {
               world.a(x - 1, y, z, true);
               world.f(x - 1, y, z, Hooks.spitStick.cF, 1, 2);
               itemStack.b(itemStack.k() + 1);
               break;
            }
         case 2:
            if(world.a(x, y, z - 1) == Hooks.cookedChicken.cF || world.a(x, y, z - 1) == Hooks.cookedCow.cF || world.a(x, y, z - 1) == Hooks.cookedPig.cF || world.a(x, y, z - 1) == Hooks.burntChicken.cF || world.a(x, y, z - 1) == Hooks.burntCow.cF || world.a(x, y, z - 1) == Hooks.burntPig.cF) {
               world.a(x, y, z - 1, true);
               world.f(x, y, z - 1, Hooks.spitStick.cF, 2, 2);
               itemStack.b(itemStack.k() + 1);
               break;
            }
         case 3:
            label87: {
               if(world.a(x + 1, y, z) != Hooks.cookedChicken.cF && world.a(x + 1, y, z) != Hooks.cookedCow.cF && world.a(x + 1, y, z) != Hooks.cookedPig.cF) {
                  x = 1;
                  if(world.a(1, y, z) != Hooks.burntChicken.cF && world.a(x + 1, y, z) != Hooks.burntCow.cF && world.a(x + 1, y, z) != Hooks.burntPig.cF) {
                     break label87;
                  }
               }

               world.a(x + 1, y, z, true);
               world.f(x + 1, y, z, Hooks.spitStick.cF, 3, 2);
               itemStack.b(itemStack.k() + 1);
            }
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
