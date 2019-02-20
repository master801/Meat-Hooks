package alex.hooks;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HookedCowModel extends ModelBase {

   bcu Shape2;
   bcu Shape3;
   bcu Shape4;
   bcu leg1;
   bcu Shape5;
   bcu Shape1;
   bcu body;
   bcu leg2;
   bcu leg3;
   bcu leg4;
   bcu horn1;
   bcu horn2;
   bcu udders;

   public HookedCowModel() {
      this.textureWidth = 64;
      this.textureWidth = 32;
      this.Shape2 = new bcu(this, 53, 8);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape2.a(0.0F, 15.0F, 0.0F);
      this.Shape2.b(64, 32);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 52, 9);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 1, 3);
      this.Shape3.a(0.0F, 14.0F, 0.0F);
      this.Shape3.b(64, 32);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
      this.Shape4 = new bcu(this, 55, 11);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape4.a(0.0F, 12.0F, 1.0F);
      this.Shape4.b(64, 32);
      this.Shape4.i = true;
      this.setRotation(this.Shape4, 1.570796F, 0.0F, 0.0F);
      this.leg1 = new bcu(this, 0, 16);
      this.leg1.a(-3.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg1.a(-3.0F, 24.0F, -2.0F);
      this.leg1.b(64, 32);
      this.leg1.i = true;
      this.setRotation(this.leg1, 2.792527F, 0.0F, 0.2617994F);
      this.Shape5 = new bcu(this, 0, 0);
      this.Shape5.a(0.0F, 0.0F, 0.0F, 8, 8, 6);
      this.Shape5.a(-4.0F, 45.0F, -12.0F);
      this.Shape5.b(64, 32);
      this.Shape5.i = true;
      this.setRotation(this.Shape5, 1.570796F, 0.0F, 0.0F);
      this.Shape1 = new bcu(this, 54, 7);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape1.a(0.0F, 14.0F, 3.0F);
      this.Shape1.b(64, 32);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
      this.body = new bcu(this, 18, 4);
      this.body.a(-6.0F, -10.0F, -7.0F, 12, 18, 10);
      this.body.a(0.0F, 30.0F, -7.0F);
      this.body.b(64, 32);
      this.body.i = true;
      this.setRotation(this.body, 3.141593F, 0.0F, 0.0F);
      this.leg2 = new bcu(this, 0, 16);
      this.leg2.a(-1.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg2.a(3.0F, 24.0F, -2.0F);
      this.leg2.b(64, 32);
      this.leg2.i = true;
      this.setRotation(this.leg2, 2.792527F, 0.0F, -0.2617994F);
      this.leg3 = new bcu(this, 0, 16);
      this.leg3.a(-3.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg3.a(-3.0F, 38.0F, -2.0F);
      this.leg3.b(64, 32);
      this.leg3.i = true;
      this.setRotation(this.leg3, 0.6108652F, 0.0F, 0.0F);
      this.leg4 = new bcu(this, 0, 16);
      this.leg4.a(-1.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg4.a(3.0F, 38.0F, -2.0F);
      this.leg4.b(64, 32);
      this.leg4.i = true;
      this.setRotation(this.leg4, 0.6108652F, 0.0F, 0.0F);
      this.horn1 = new bcu(this, 22, 0);
      this.horn1.a(-4.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn1.a(0.0F, 38.0F, -9.0F);
      this.horn1.b(64, 32);
      this.horn1.i = true;
      this.setRotation(this.horn1, 1.570796F, 0.0F, 0.0F);
      this.horn2 = new bcu(this, 22, 0);
      this.horn2.a(3.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn2.a(0.0F, 38.0F, -9.0F);
      this.horn2.b(64, 32);
      this.horn2.i = true;
      this.setRotation(this.horn2, 1.570796F, 0.0F, 0.0F);
      this.udders = new bcu(this, 52, 0);
      this.udders.a(-2.0F, -3.0F, 0.0F, 4, 5, 2);
      this.udders.a(0.0F, 25.0F, 1.0F);
      this.udders.b(64, 32);
      this.udders.i = true;
      this.setRotation(this.udders, 3.141593F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.Shape2.a(f5);
      this.Shape3.a(f5);
      this.Shape4.a(f5);
      this.leg1.a(f5);
      this.Shape5.a(f5);
      this.Shape1.a(f5);
      this.body.a(f5);
      this.leg2.a(f5);
      this.leg3.a(f5);
      this.leg4.a(f5);
      this.horn1.a(f5);
      this.horn2.a(f5);
      this.udders.a(f5);
   }

   private void setRotation(bcu model, float x, float y, float z) {
      model.f = x;
      model.g = y;
      model.h = z;
   }

}
