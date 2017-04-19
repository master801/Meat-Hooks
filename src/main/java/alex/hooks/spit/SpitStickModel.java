package alex.hooks.spit;


public class SpitStickModel extends bbo {

   bcu Shape1;


   public SpitStickModel() {
      this.t = 128;
      this.u = 64;
      this.Shape1 = new bcu(this, 14, 0);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape1.a(0.0F, 10.0F, -17.0F);
      this.Shape1.b(128, 64);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.a(f5);
   }

   private void setRotation(bcu model, float x, float y, float z) {
      model.f = x;
      model.g = y;
      model.h = z;
   }

   public void a(float f, float f1, float f2, float f3, float f4, float f5, nn entity) {
      super.a(f, f1, f2, f3, f4, f5, entity);
   }
}
