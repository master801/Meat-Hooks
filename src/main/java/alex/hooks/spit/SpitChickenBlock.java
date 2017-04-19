package alex.hooks.spit;

import alex.hooks.Hooks;
import alex.hooks.spit.SpitChickenEntity;
import java.util.Random;

public class SpitChickenBlock extends amw {

   public SpitChickenBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.c("spitChicken");
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

   public void a(abw par1World, int par2, int par3, int par4, Random par5Random) {
      SpitChickenEntity a = (SpitChickenEntity)par1World.r(par2, par3, par4);
      asx aabb = asx.a((double)par2, (double)(par3 - 2), (double)par4, (double)(par2 + 1), (double)(par3 - 1), (double)(par4 + 1));
      if(par5Random.nextInt(1) == 0 && par1World.e(aabb)) {
         if(a.angle != 0.0F) {
            par1World.f(par2, par3, par4, Hooks.cookedChicken.cF, par1World.h(par2, par3, par4), 2);
         } else {
            par1World.f(par2, par3, par4, Hooks.burntChicken.cF, par1World.h(par2, par3, par4), 2);
         }
      }

   }

   public asp b(abw world) {
      return new SpitChickenEntity();
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
