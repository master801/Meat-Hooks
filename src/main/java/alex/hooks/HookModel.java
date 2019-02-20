package alex.hooks;


import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class HookModel extends ModelBase {

   bcu Shape1;
   bcu Shape2;
   bcu Shape3;
   bcu Shape4;


   public HookModel() {
      this.t = 16;
      this.u = 16;
      this.Shape1 = new bcu(this, 0, 0);
      this.Shape1.a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape1.a(0.0F, 14.0F, 3.0F);
      this.Shape1.b(16, 16);
      this.Shape1.i = true;
      this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
      this.Shape2 = new bcu(this, 0, 0);
      this.Shape2.a(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape2.a(0.0F, 15.0F, 0.0F);
      this.Shape2.b(16, 16);
      this.Shape2.i = true;
      this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
      this.Shape3 = new bcu(this, 0, 0);
      this.Shape3.a(0.0F, 0.0F, 0.0F, 1, 1, 4);
      this.Shape3.a(0.0F, 15.0F, 0.0F);
      this.Shape3.b(16, 16);
      this.Shape3.i = true;
      this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
      this.Shape4 = new bcu(this, 0, 0);
      this.Shape4.a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape4.a(0.0F, 11.0F, 1.0F);
      this.Shape4.b(16, 16);
      this.Shape4.i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      Shape1.a(f5);
      Shape2.a(f5);
      Shape3.a(f5);
      Shape4.a(f5);
   }

   private void setRotation(bcu model, float x, float y, float z) {
      model.f = x;
      model.g = y;
      model.h = z;
   }

}
