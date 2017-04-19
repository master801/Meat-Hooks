package alex.hooks;

import alex.hooks.TileEntityY3MInvEntity;

public class TileEntityY3MInvBlock extends amw {

   public TileEntityY3MInvBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      this.c("Y3MInv");
      this.c(500.0F);
   }

   public asp b(abw world) {
      return new TileEntityY3MInvEntity();
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
