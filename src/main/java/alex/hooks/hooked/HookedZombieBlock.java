package alex.hooks.hooked;

import alex.hooks.hooked.HookedZombieEntity;

public class HookedZombieBlock extends amw {

   public HookedZombieBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.c("hookedZombie");
      this.c(500.0F);
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new HookedZombieEntity();
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
