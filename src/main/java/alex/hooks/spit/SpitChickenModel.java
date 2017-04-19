package alex.hooks.spit;


public class SpitChickenModel extends bbo {

   bcu Shape1;
   bcu Shape2;
   bcu Shape3;
   bcu Shape7;
   bcu Shape8;
   bcu Shape5;
   bcu Shape13;
   bcu Shape14;
   bcu Shape15;
   bcu Shape16;
   bcu Shape17;
   bcu Shape6;
   bcu Shape4;


   public SpitChickenModel() {
      this.t = 128;
      this.u = 64;
      this.Shape1 = new bcu(this, 0, 0);
      this.Shape1.a(0.0F, 0.0F, -4.0F, 4, 6, 3);
      this.Shape1.a(-2.0F, 6.0F, 4.0F);
      this.Shape1.b(128, 64);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 0.3490659F, 0.0F, 0.0F);
      this.Shape2 = new bcu(this, 14, 0);
      this.Shape2.a(0.0F, 0.0F, -4.0F, 4, 2, 2);
      this.Shape2.a(-2.0F, 9.0F, 3.0F);
      this.Shape2.b(128, 64);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 0.3490659F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 14, 4);
      this.Shape3.a(0.0F, 0.0F, -4.0F, 2, 2, 2);
      this.Shape3.a(-1.0F, 10.0F, 4.0F);
      this.Shape3.b(128, 64);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 0.3490659F, 0.0F, 0.0F);
      this.Shape7 = new bcu(this, 24, 13);
      this.Shape7.a(4.0F, 0.0F, 0.0F, 1, 4, 6);
      this.Shape7.a(-8.0F, 8.0F, 5.0F);
      this.Shape7.b(128, 64);
      this.Shape7.i = true;
      this.setRotation(this.Shape7, 0.3490659F, 0.0F, 0.0F);
      this.Shape8 = new bcu(this, 24, 13);
      this.Shape8.a(4.0F, 0.0F, 0.0F, 1, 4, 6);
      this.Shape8.a(-1.0F, 8.0F, 5.0F);
      this.Shape8.b(128, 64);
      this.Shape8.i = true;
      this.setRotation(this.Shape8, 0.3490659F, 0.0F, 0.0F);
      this.Shape5 = new bcu(this, 31, 0);
      this.Shape5.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape5.a(1.0F, 13.0F, 9.0F);
      this.Shape5.b(128, 64);
      this.Shape5.i = true;
      this.setRotation(this.Shape5, 1.832596F, -0.3490659F, 0.0F);
      this.Shape13 = new bcu(this, 31, 0);
      this.Shape13.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape13.a(-2.0F, 13.0F, 9.0F);
      this.Shape13.b(128, 64);
      this.Shape13.i = true;
      this.setRotation(this.Shape13, 1.805228F, 0.3490659F, 0.0F);
      this.Shape14 = new bcu(this, 27, 0);
      this.Shape14.a(0.0F, 0.0F, 0.0F, 3, 1, 2);
      this.Shape14.a(-1.0F, 13.0F, 13.0F);
      this.Shape14.b(128, 64);
      this.Shape14.i = true;
      this.setRotation(this.Shape14, 1.832596F, -0.3490659F, 0.0F);
      this.Shape15 = new bcu(this, 27, 0);
      this.Shape15.a(0.0F, 0.0F, 0.0F, 3, 1, 2);
      this.Shape15.a(-1.0F, 13.0F, 14.0F);
      this.Shape15.b(128, 64);
      this.Shape15.i = true;
      this.setRotation(this.Shape15, 1.832596F, 0.3490659F, 0.0F);
      this.Shape16 = new bcu(this, 31, 0);
      this.Shape16.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape16.a(0.0F, 13.93333F, 13.5F);
      this.Shape16.b(128, 64);
      this.Shape16.i = true;
      this.setRotation(this.Shape16, 1.832596F, -0.3490659F, 0.0F);
      this.Shape17 = new bcu(this, 31, 0);
      this.Shape17.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape17.a(0.0F, 14.0F, 14.0F);
      this.Shape17.b(128, 64);
      this.Shape17.i = true;
      this.setRotation(this.Shape17, 1.832596F, 0.3490659F, 0.0F);
      this.Shape6 = new bcu(this, 13, 0);
      this.Shape6.a(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape6.a(0.0F, 10.0F, -17.0F);
      this.Shape6.b(128, 64);
      this.Shape6.i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new bcu(this, 0, 9);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 6, 8, 6);
      this.Shape4.a(-3.0F, 14.0F, 5.0F);
      this.Shape4.b(128, 64);
      this.Shape4.i = true;
      this.setRotation(this.Shape4, 1.905404F, 0.0F, 0.0F);
   }

   public void a(nn entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.a(entity, f, f1, f2, f3, f4, f5);
      this.a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.a(f5);
      this.Shape2.a(f5);
      this.Shape3.a(f5);
      this.Shape7.a(f5);
      this.Shape8.a(f5);
      this.Shape5.a(f5);
      this.Shape13.a(f5);
      this.Shape14.a(f5);
      this.Shape15.a(f5);
      this.Shape16.a(f5);
      this.Shape17.a(f5);
      this.Shape6.a(f5);
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
