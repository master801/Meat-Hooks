package alex.hooks.spit;


public class SpitPropModel extends bbo {

   bcu Shape1;
   bcu Shape2;
   bcu Shape3;


   public SpitPropModel() {
      this.t = 32;
      this.u = 32;
      this.Shape1 = new bcu(this, 0, 0);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 13, 1);
      this.Shape1.a(0.0F, 11.0F, 0.0F);
      this.Shape1.b(32, 32);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new bcu(this, 4, 0);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape2.a(1.0F, 9.0F, 0.0F);
      this.Shape2.b(32, 32);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 8, 0);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape3.a(-1.0F, 9.0F, 0.0F);
      this.Shape3.b(32, 32);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.a(f5);
      this.Shape2.a(f5);
      this.Shape3.a(f5);
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
