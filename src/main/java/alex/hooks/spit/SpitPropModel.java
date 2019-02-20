package alex.hooks.spit;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpitPropModel extends ModelBase {

   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;

   public SpitPropModel() {
      this.textureHeight = textureWidth = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 13, 1);
      this.Shape1.setRotationPoint(0.0F, 11.0F, 0.0F);
      this.Shape1.setTextureSize(32, 32);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 4, 0);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape2.setRotationPoint(1.0F, 9.0F, 0.0F);
      this.Shape2.setTextureSize(32, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 8, 0);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
      this.Shape3.setRotationPoint(-1.0F, 9.0F, 0.0F);
      this.Shape3.setTextureSize(32, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}
