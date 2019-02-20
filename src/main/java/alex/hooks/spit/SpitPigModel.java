package alex.hooks.spit;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpitPigModel extends ModelBase {

   ModelRenderer head;
   ModelRenderer body;
   ModelRenderer leg1;
   ModelRenderer leg2;
   ModelRenderer leg3;
   ModelRenderer leg4;
   ModelRenderer Shape1;

   public SpitPigModel() {
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.head = new ModelRenderer(this, 0, 0);
      this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
      this.head.setRotationPoint(0.0F, 9.0F, 2.0F);
      this.head.setTextureSize(128, 64);
      this.head.mirror = true;
      this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
      this.body = new ModelRenderer(this, 28, 8);
      this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8);
      this.body.setRotationPoint(0.0F, 8.0F, 11.0F);
      this.body.setTextureSize(128, 64);
      this.body.mirror = true;
      this.setRotation(this.body, 1.570796F, 0.0F, 0.0F);
      this.leg1 = new ModelRenderer(this, 0, 16);
      this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg1.setRotationPoint(-3.0F, 13.0F, 15.0F);
      this.leg1.setTextureSize(128, 64);
      this.leg1.mirror = true;
      this.setRotation(this.leg1, 1.919862F, 0.4363323F, 0.0F);
      this.leg2 = new ModelRenderer(this, 0, 16);
      this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg2.setRotationPoint(3.0F, 13.0F, 15.0F);
      this.leg2.setTextureSize(128, 64);
      this.leg2.mirror = true;
      this.setRotation(this.leg2, 1.919862F, -0.4363323F, 0.0F);
      this.leg3 = new ModelRenderer(this, 0, 16);
      this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg3.setRotationPoint(-3.0F, 13.0F, 3.0F);
      this.leg3.setTextureSize(128, 64);
      this.leg3.mirror = true;
      this.setRotation(this.leg3, -1.919862F, 0.0F, 0.0F);
      this.leg4 = new ModelRenderer(this, 0, 16);
      this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
      this.leg4.setRotationPoint(3.0F, 13.0F, 3.0F);
      this.leg4.setTextureSize(128, 64);
      this.leg4.mirror = true;
      this.setRotation(this.leg4, -1.919862F, 0.0F, 0.0F);
      this.Shape1 = new ModelRenderer(this, 13, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape1.setRotationPoint(0.0F, 10.0F, -17.0F);
      this.Shape1.setTextureSize(128, 64);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
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
      this.Shape1.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}
