package alex.hooks.cooked;

import alex.hooks.Hooks;
import alex.hooks.cooked.CookedPigEntity;
import java.util.ArrayList;
import java.util.Random;

public class CookedPigBlock extends amw {

   public CookedPigBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.c("cookedPig");
      this.c(500.0F);
      this.b(true);
   }

   public void a(acf ba, int x, int y, int z) {
      switch(ba.h(x, y, z)) {
      case 0:
         this.a(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
         break;
      case 3:
         this.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public int quantityDropped(int metadata, int fortune, Random rand) {
      return 3 + rand.nextInt(3) + fortune;
   }

   public ArrayList getBlockDropped(abw world, int x, int y, int z, int metadata, int fortune) {
      ArrayList ret = new ArrayList();
      int amount = this.quantityDropped(metadata, fortune, world.s);
      boolean luckDraw = false;
      boolean idDropped = false;
      boolean metaDropped = false;

      for(int i = 0; i < amount; ++i) {
         int var13 = world.s.nextInt(3);
         int var14 = 0;
         byte var15 = 0;
         if(var13 == 0) {
            var14 = Hooks.pigCooked.cv;
         }

         if(var13 == 1) {
            var14 = Hooks.pigCooked.cv;
         }

         if(var13 == 2) {
            var14 = yc.aZ.cv;
         }

         ret.add(new ye(var14, 1, var15));
      }

      return ret;
   }

   public asp b(abw world) {
      return new CookedPigEntity();
   }

   public int d() {
      return -1;
   }

   public boolean c() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(mt icon) {
      this.cW = icon.a("Hooks:hookIcon");
   }
}
