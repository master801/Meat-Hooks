package alex.hooks.spit;


public class SpitPigModel extends bbo {

   bcu head;
   bcu body;
   bcu leg1;
   bcu leg2;
   bcu leg3;
   bcu leg4;
   bcu Shape1;


   public SpitPigModel() {
      this.t = 128;
      this.u = 64;
      this.head = new bcu(this, 0, 0);
      this.head.a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
      this.head.a(0.0F, 9.0F, 2.0F);
      this.head.b(128, 64);
      this.head.i = true;
      this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
      this.body = new bcu(this, 28, 8);
      this.body.a(-5.0F, -10.0F, -7.0F, 10, 16, 8);
      this.body.a(0.0F, 8.0F, 11.0F);
      this.body.b(128, 64);
      this.body.i = true;
      this.setRotation(this.body, 1.570796F, 0.0F, 0.0F);
      this.leg1 = new bcu(this, 0, 16);
      this.leg1.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg1.a(-3.0F, 13.0F, 15.0F);
      this.leg1.b(128, 64);
      this.leg1.i = true;
      this.setRotation(this.leg1, 1.919862F, 0.4363323F, 0.0F);
      this.leg2 = new bcu(this, 0, 16);
      this.leg2.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg2.a(3.0F, 13.0F, 15.0F);
      this.leg2.b(128, 64);
      this.leg2.i = true;
      this.setRotation(this.leg2, 1.919862F, -0.4363323F, 0.0F);
      this.leg3 = new bcu(this, 0, 16);
      this.leg3.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg3.a(-3.0F, 13.0F, 3.0F);
      this.leg3.b(128, 64);
      this.leg3.i = true;
      this.setRotation(this.leg3, -1.919862F, 0.0F, 0.0F);
      this.leg4 = new bcu(this, 0, 16);
      this.leg4.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg4.a(3.0F, 13.0F, 3.0F);
      this.leg4.b(128, 64);
      this.leg4.i = true;
      this.setRotation(this.leg4, -1.919862F, 0.0F, 0.0F);
      this.Shape1 = new bcu(this, 13, 0);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape1.a(0.0F, 10.0F, -17.0F);
      this.Shape1.b(128, 64);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.head.a(f5);
      this.body.a(f5);
      this.leg1.a(f5);
      this.leg2.a(f5);
      this.leg3.a(f5);
      this.leg4.a(f5);
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
