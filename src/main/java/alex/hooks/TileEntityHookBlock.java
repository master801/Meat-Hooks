package alex.hooks;

import alex.hooks.TileEntityHookEntity;

public class TileEntityHookBlock extends amw {

   public TileEntityHookBlock(int id) {
      super(id, akc.d);
      this.a(ww.b);
      this.a(0.3F, 0.5F, 0.3F, 0.7F, 0.9F, 0.7F);
      this.c("hook");
      this.c(1.0F);
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      switch(l) {
      case 0:
         if(aqz.l(par1World.a(par2, par3, par4 - 1))) {
            par1World.b(par2, par3, par4, l, 2);
         } else if(aqz.l(par1World.a(par2 + 1, par3, par4))) {
            par1World.b(par2, par3, par4, l - 3, 2);
         } else if(aqz.l(par1World.a(par2 - 1, par3, par4))) {
            par1World.b(par2, par3, par4, l - 1, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 + 1))) {
            par1World.b(par2, par3, par4, l - 2, 2);
         } else {
            par1World.a(par2, par3, par4, true);
         }
         break;
      case 1:
         if(aqz.l(par1World.a(par2 + 1, par3, par4))) {
            par1World.b(par2, par3, par4, l, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 + 1))) {
            par1World.b(par2, par3, par4, l + 1, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 - 1))) {
            par1World.b(par2, par3, par4, l + 3, 2);
         } else if(aqz.l(par1World.a(par2 - 1, par3, par4))) {
            par1World.b(par2, par3, par4, l + 2, 2);
         } else {
            par1World.a(par2, par3, par4, true);
         }
         break;
      case 2:
         if(aqz.l(par1World.a(par2, par3, par4 + 1))) {
            par1World.b(par2, par3, par4, l, 2);
         } else if(aqz.l(par1World.a(par2 - 1, par3, par4))) {
            par1World.b(par2, par3, par4, l + 1, 2);
         } else if(aqz.l(par1World.a(par2 + 1, par3, par4))) {
            par1World.b(par2, par3, par4, l - 1, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 - 1))) {
            par1World.b(par2, par3, par4, l + 2, 2);
         } else {
            par1World.a(par2, par3, par4, true);
         }
         break;
      case 3:
         if(aqz.l(par1World.a(par2 - 1, par3, par4))) {
            par1World.b(par2, par3, par4, l, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 - 1))) {
            par1World.b(par2, par3, par4, l + 1, 2);
         } else if(aqz.l(par1World.a(par2, par3, par4 + 1))) {
            par1World.b(par2, par3, par4, l - 1, 2);
         } else if(aqz.l(par1World.a(par2 + 1, par3, par4))) {
            par1World.b(par2, par3, par4, l - 2, 2);
         } else {
            par1World.a(par2, par3, par4, true);
         }
      }

   }

   public asp b(abw world) {
      return new TileEntityHookEntity();
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
