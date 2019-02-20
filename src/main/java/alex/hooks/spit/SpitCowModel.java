package alex.hooks.spit;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpitCowModel extends ModelBase {

   ModelRenderer head;
   ModelRenderer body;
   ModelRenderer leg1;
   ModelRenderer leg2;
   ModelRenderer leg3;
   ModelRenderer leg4;
   ModelRenderer horn1;
   ModelRenderer horn2;
   ModelRenderer udders;
   ModelRenderer Shape1;
   ModelRenderer Shape2;

   public SpitCowModel() {
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.head = new ModelRenderer(this, 0, 0);
      this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
      this.head.setRotationPoint(0.0F, 7.0F, 0.0F);
      this.head.setTextureSize(128, 64);
      this.head.mirror = true;
      this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
      this.body = new ModelRenderer(this, 18, 4);
      this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
      this.body.setRotationPoint(0.0F, 8.0F, 10.0F);
      this.body.setTextureSize(128, 64);
      this.body.mirror = true;
      this.setRotation(this.body, 1.570796F, 0.0F, 0.0F);
      this.leg1 = new ModelRenderer(this, 0, 16);
      this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg1.setRotationPoint(-3.0F, 13.0F, 15.0F);
      this.leg1.setTextureSize(128, 64);
      this.leg1.mirror = true;
      this.setRotation(this.leg1, 1.745329F, 0.2617994F, 0.0F);
      this.leg2 = new ModelRenderer(this, 0, 16);
      this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leg2.setRotationPoint(3.0F, 13.0F, 15.0F);
      this.leg2.setTextureSize(128, 64);
      this.leg2.mirror = true;
      this.setRotation(this.leg2, 1.745329F, -0.2617994F, 0.0F);
      this.leg3 = new ModelRenderer(this, 0, 16);
      this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg3.setRotationPoint(-3.0F, 15.0F, 3.0F);
      this.leg3.setTextureSize(128, 64);
      this.leg3.mirror = true;
      this.setRotation(this.leg3, -1.745329F, -0.2617994F, 0.0F);
      this.leg4 = new ModelRenderer(this, 0, 16);
      this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
      this.leg4.setRotationPoint(3.0F, 15.0F, 3.0F);
      this.leg4.setTextureSize(128, 64);
      this.leg4.mirror = true;
      this.setRotation(this.leg4, -1.745329F, 0.2617994F, 0.0F);
      this.horn1 = new ModelRenderer(this, 22, 0);
      this.horn1.addBox(-4.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn1.setRotationPoint(0.0F, 6.0F, 1.0F);
      this.horn1.setTextureSize(128, 64);
      this.horn1.mirror = true;
      this.setRotation(this.horn1, 0.0F, 0.0F, 0.0F);
      this.horn2 = new ModelRenderer(this, 22, 0);
      this.horn2.addBox(3.0F, -5.0F, -4.0F, 1, 3, 1);
      this.horn2.setRotationPoint(0.0F, 6.0F, 1.0F);
      this.horn2.setTextureSize(128, 64);
      this.horn2.mirror = true;
      this.setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
      this.udders = new ModelRenderer(this, 52, 0);
      this.udders.addBox(-2.0F, -3.0F, 0.0F, 4, 6, 2);
      this.udders.setRotationPoint(0.0F, 16.0F, 14.0F);
      this.udders.setTextureSize(128, 64);
      this.udders.mirror = true;
      this.setRotation(this.udders, 1.570796F, 0.0F, 0.0F);
      this.Shape1 = new ModelRenderer(this, 14, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape1.setRotationPoint(0.0F, 10.0F, -17.0F);
      this.Shape1.setTextureSize(128, 64);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape2.setRotationPoint(0.0F, 10.0F, 32.0F);
      this.Shape2.setTextureSize(128, 64);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.head.render(f5);
      this.body.render(f5);
      this.leg1.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.horn1.render(f5);
      this.horn2.render(f5);
      this.udders.render(f5);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}
