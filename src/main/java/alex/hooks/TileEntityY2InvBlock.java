package alex.hooks;

import alex.hooks.TileEntityY2InvEntity;

public class TileEntityY2InvBlock extends amw {

   public TileEntityY2InvBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      this.c("Y2Inv");
      this.c(500.0F);
   }

   public asp b(abw world) {
      return new TileEntityY2InvEntity();
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
