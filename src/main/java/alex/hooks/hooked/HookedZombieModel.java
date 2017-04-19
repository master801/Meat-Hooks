package alex.hooks.hooked;


public class HookedZombieModel extends bbo {

   bcu head;
   bcu body;
   bcu rightarm;
   bcu leftarm;
   bcu rightleg;
   bcu leftleg;
   bcu Shape1;
   bcu Shape2;
   bcu Shape3;
   bcu Shape4;


   public HookedZombieModel() {
      this.t = 64;
      this.u = 64;
      this.head = new bcu(this, 0, 0);
      this.head.a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
      this.head.a(0.0F, -3.0F, 3.0F);
      this.head.b(64, 64);
      this.head.i = true;
      this.setRotation(this.head, -0.2974289F, 0.0F, 0.0F);
      this.body = new bcu(this, 16, 16);
      this.body.a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
      this.body.a(0.0F, -3.0F, 3.0F);
      this.body.b(64, 64);
      this.body.i = true;
      this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
      this.rightarm = new bcu(this, 40, 16);
      this.rightarm.a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
      this.rightarm.a(-5.0F, -1.0F, 3.0F);
      this.rightarm.b(64, 64);
      this.rightarm.i = true;
      this.setRotation(this.rightarm, -3.141593F, 0.0F, 0.0F);
      this.leftarm = new bcu(this, 40, 16);
      this.leftarm.a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
      this.leftarm.a(5.0F, -1.0F, 3.0F);
      this.leftarm.b(64, 64);
      this.leftarm.i = true;
      this.setRotation(this.leftarm, -3.141593F, 0.0F, 0.1858931F);
      this.rightleg = new bcu(this, 0, 16);
      this.rightleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.rightleg.a(-2.0F, 9.0F, 3.0F);
      this.rightleg.b(64, 64);
      this.rightleg.i = true;
      this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
      this.leftleg = new bcu(this, 0, 16);
      this.leftleg.a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leftleg.a(2.0F, 9.0F, 3.0F);
      this.leftleg.b(64, 64);
      this.leftleg.i = true;
      this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
      this.Shape1 = new bcu(this, 0, 0);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape1.a(0.0F, 18.0F, 3.0F);
      this.Shape1.b(64, 64);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
      this.Shape2 = new bcu(this, 0, 0);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape2.a(0.0F, 17.0F, 0.0F);
      this.Shape2.b(64, 64);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 0, 0);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape3.a(0.0F, 19.0F, 1.0F);
      this.Shape3.b(64, 64);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new bcu(this, 0, 0);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape4.a(0.0F, 17.0F, 0.0F);
      this.Shape4.b(64, 64);
      this.Shape4.i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.head.a(f5);
      this.body.a(f5);
      this.rightarm.a(f5);
      this.leftarm.a(f5);
      this.rightleg.a(f5);
      this.leftleg.a(f5);
      this.Shape1.a(f5);
      this.Shape2.a(f5);
      this.Shape3.a(f5);
      this.Shape4.a(f5);
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
