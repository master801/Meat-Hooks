package alex.hooks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HookedCowModel extends ModelBase {

   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer leg1;
   ModelRenderer Shape5;
   ModelRenderer Shape1;
   ModelRenderer body;
   ModelRenderer leg2;
   ModelRenderer leg3;
   ModelRenderer leg4;
   ModelRenderer horn1;
   ModelRenderer horn2;
   ModelRenderer udders;

   public HookedCowModel() {
      this.textureWidth = 64;
      this.textureWidth = 32;
      this.Shape2 = new ModelRenderer(this, 53, 8);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape2.setRotationPoint(0.0F, 15.0F, 0.0F);
      this.Shape2.setTextureSize(64, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 52, 9);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
      this.Shape3.setRotationPoint(0.0F, 14.0F, 0.0F);
      this.Shape3.setTextureSize(64, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 55, 11);
      this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape4.setRotationPoint(0.0F, 12.0F, 1.0F);
      this.Shape4.setTextureSize(64, 32);
      this.Shape4.mirror = true;
      this.setRotation(this.Shape4, 1.570796F, 0.0F, 0.0F);
      this.leg1 = new ModelRenderer(this, 0, 16);
      this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg1.setRotationPoint(-3.0F, 24.0F, -2.0F);
      this.leg1.setTextureSize(64, 32);
      this.leg1.mirror = true;
      this.setRotation(this.leg1, 2.792527F, 0.0F, 0.2617994F);
      this.Shape5 = new ModelRenderer(this, 0, 0);
      this.Shape5.addBox(0.0F, 0.0F, 0.0F, 8, 8, 6);
      this.Shape5.setRotationPoint(-4.0F, 45.0F, -12.0F);
      this.Shape5.setTextureSize(64, 32);
      this.Shape5.mirror = true;
      this.setRotation(this.Shape5, 1.570796F, 0.0F, 0.0F);
      this.Shape1 = new ModelRenderer(this, 54, 7);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape1.setRotationPoint(0.0F, 14.0F, 3.0F);
      this.Shape1.setTextureSize(64, 32);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
      this.body = new ModelRenderer(this, 18, 4);
      this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
      this.body.setRotationPoint(0.0F, 30.0F, -7.0F);
      this.body.setTextureSize(64, 32);
      this.body.mirror = true;
      this.setRotation(this.body, 3.141593F, 0.0F, 0.0F);
      this.leg2 = new ModelRenderer(this, 0, 16);
      this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg2.setRotationPoint(3.0F, 24.0F, -2.0F);
      this.leg2.setTextureSize(64, 32);
      this.leg2.mirror = true;
      this.setRotation(this.leg2, 2.792527F, 0.0F, -0.2617994F);
      this.leg3 = new ModelRenderer(this, 0, 16);
      this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg3.setRotationPoint(-3.0F, 38.0F, -2.0F);
      this.leg3.setTextureSize(64, 32);
      this.leg3.mirror = true;
      this.setRotation(this.leg3, 0.6108652F, 0.0F, 0.0F);
      this.leg4 = new ModelRenderer(this, 0, 16);
      this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg4.setRotationPoint(3.0F, 38.0F, -2.0F);
      this.leg4.setTextureSize(64, 32);
      this.leg4.mirror = true;
      this.setRotation(this.leg4, 0.6108652F, 0.0F, 0.0F);
      this.horn1 = new ModelRenderer(this, 22, 0);
      this.horn1.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn1.setRotationPoint(0.0F, 38.0F, -9.0F);
      this.horn1.setTextureSize(64, 32);
      this.horn1.mirror = true;
      this.setRotation(this.horn1, 1.570796F, 0.0F, 0.0F);
      this.horn2 = new ModelRenderer(this, 22, 0);
      this.horn2.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn2.setRotationPoint(0.0F, 38.0F, -9.0F);
      this.horn2.setTextureSize(64, 32);
      this.horn2.mirror = true;
      this.setRotation(this.horn2, 1.570796F, 0.0F, 0.0F);
      this.udders = new ModelRenderer(this, 52, 0);
      this.udders.addBox(-2.0F, -3.0F, 0.0F, 4, 5, 2);
      this.udders.setRotationPoint(0.0F, 25.0F, 1.0F);
      this.udders.setTextureSize(64, 32);
      this.udders.mirror = true;
      this.setRotation(this.udders, 3.141593F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.leg1.render(f5);
      this.Shape5.render(f5);
      this.Shape1.render(f5);
      this.body.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.horn1.render(f5);
      this.horn2.render(f5);
      this.udders.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}
