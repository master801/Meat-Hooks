package alex.hooks;


public class HookedPigModel extends bbo {

   bcu Shape1;
   bcu Shape2;
   bcu Shape3;
   bcu Shape4;
   bcu head;
   bcu body;
   bcu leg1;
   bcu leg2;
   bcu leg3;
   bcu leg4;


   public HookedPigModel() {
      this.t = 64;
      this.u = 32;
      this.Shape1 = new bcu(this, 19, 21);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape1.a(0.0F, 14.0F, 3.0F);
      this.Shape1.b(64, 32);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
      this.Shape2 = new bcu(this, 19, 27);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape2.a(0.0F, 15.0F, 1.0F);
      this.Shape2.b(64, 32);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 17, 23);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 1, 4);
      this.Shape3.a(0.0F, 15.0F, 0.0F);
      this.Shape3.b(64, 32);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
      this.Shape4 = new bcu(this, 19, 24);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape4.a(0.0F, 11.0F, 1.0F);
      this.Shape4.b(64, 32);
      this.Shape4.i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.head = new bcu(this, 0, 0);
      this.head.a(-4.0F, -4.0F, -8.0F, 8, 8, 8);
      this.head.a(0.0F, 31.0F, 0.0F);
      this.head.b(64, 32);
      this.head.i = true;
      this.setRotation(this.head, 1.570796F, 0.0F, 0.0F);
      this.body = new bcu(this, 28, 8);
      this.body.a(-5.0F, -10.0F, -7.0F, 10, 16, 8);
      this.body.a(0.0F, 22.0F, -4.0F);
      this.body.b(64, 32);
      this.body.i = true;
      this.setRotation(this.body, -2.918521F, 0.0F, 0.0F);
      this.leg1 = new bcu(this, 0, 16);
      this.leg1.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg1.a(-3.0F, 18.0F, -1.0F);
      this.leg1.b(64, 32);
      this.leg1.i = true;
      this.setRotation(this.leg1, 2.617994F, 0.0F, 0.4363323F);
      this.leg2 = new bcu(this, 0, 16);
      this.leg2.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg2.a(3.0F, 18.0F, -1.0F);
      this.leg2.b(64, 32);
      this.leg2.i = true;
      this.setRotation(this.leg2, 2.617994F, 0.0F, -0.4363323F);
      this.leg3 = new bcu(this, 0, 16);
      this.leg3.a(-2.0F, 18.0F, -2.0F, 4, 6, 4);
      this.leg3.a(-3.0F, 12.0F, -3.0F);
      this.leg3.b(64, 32);
      this.leg3.i = true;
      this.setRotation(this.leg3, 0.3490659F, 0.0F, 0.0F);
      this.leg4 = new bcu(this, 0, 16);
      this.leg4.a(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg4.a(3.0F, 29.0F, 3.0F);
      this.leg4.b(64, 32);
      this.leg4.i = true;
      this.setRotation(this.leg4, 0.3490659F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.a(f5);
      this.Shape2.a(f5);
      this.Shape3.a(f5);
      this.Shape4.a(f5);
      this.head.a(f5);
      this.body.a(f5);
      this.leg1.a(f5);
      this.leg2.a(f5);
      this.leg3.a(f5);
      this.leg4.a(f5);
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
