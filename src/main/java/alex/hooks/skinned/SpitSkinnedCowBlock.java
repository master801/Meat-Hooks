package alex.hooks.skinned;

import alex.hooks.Hooks;
import alex.hooks.skinned.SpitSkinnedCowEntity;
import java.util.ArrayList;
import java.util.Random;

public class SpitSkinnedCowBlock extends amw {

   public SpitSkinnedCowBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.c("spitSkinnedCow");
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
      SpitSkinnedCowEntity a = (SpitSkinnedCowEntity)par1World.r(par2, par3, par4);
      asx aabb = asx.a((double)par2, (double)(par3 - 2), (double)par4, (double)(par2 + 1), (double)(par3 - 1), (double)(par4 + 1));
      if(par1World.e(aabb)) {
         if(a.angle != 0.0F) {
            par1World.f(par2, par3, par4, Hooks.cookedCow.cF, par1World.h(par2, par3, par4), 2);
         } else {
            par1World.f(par2, par3, par4, Hooks.burntCow.cF, par1World.h(par2, par3, par4), 2);
         }
      }

   }

   public int quantityDropped(int metadata, int fortune, Random rand) {
      return 2 + rand.nextInt(2) + fortune;
   }

   public ArrayList getBlockDropped(abw world, int x, int y, int z, int metadata, int fortune) {
      ArrayList ret = new ArrayList();
      int amount = this.quantityDropped(metadata, fortune, world.s);
      boolean luckDraw = false;
      boolean idDropped = false;
      boolean metaDropped = false;

      for(int i = 0; i < amount; ++i) {
         int var13 = world.s.nextInt(2);
         int var14 = 0;
         byte var15 = 0;
         if(var13 == 0) {
            var14 = Hooks.cowMeat.cv;
         }

         if(var13 == 1) {
            var14 = Hooks.cowMeat.cv;
         }

         ret.add(new ye(var14, 1, var15));
      }

      return ret;
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new SpitSkinnedCowEntity();
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
      this.cW = icon.a("Hooks:hook");
   }
}
