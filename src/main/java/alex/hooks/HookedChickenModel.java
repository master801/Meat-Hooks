package alex.hooks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HookedChickenModel extends ModelBase {

   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape7;
   ModelRenderer Shape8;
   ModelRenderer Shape9;
   ModelRenderer Shape10;
   ModelRenderer Shape11;
   ModelRenderer Shape12;
   ModelRenderer Shape5;
   ModelRenderer Shape13;
   ModelRenderer Shape14;
   ModelRenderer Shape15;
   ModelRenderer Shape16;
   ModelRenderer Shape17;


   public HookedChickenModel() {
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.addBox(0.0F, 15.0F, -4.0F, 4, 6, 3);
      this.Shape1.setRotationPoint(-2.0F, 33.0F, -17.0F);
      this.Shape1.setTextureSize(64, 32);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 2.094395F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 14, 0);
      this.Shape2.addBox(0.0F, 15.0F, -4.0F, 4, 2, 2);
      this.Shape2.setRotationPoint(-2.0F, 33.0F, -16.0F);
      this.Shape2.setTextureSize(64, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 2.094395F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 14, 4);
      this.Shape3.addBox(0.0F, 15.0F, -4.0F, 2, 2, 2);
      this.Shape3.setRotationPoint(-1.0F, 32.0F, -13.0F);
      this.Shape3.setTextureSize(64, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 2.094395F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 9);
      this.Shape4.addBox(0.0F, 16.0F, 0.0F, 6, 8, 6);
      this.Shape4.setRotationPoint(-3.0F, 39.0F, 10.0F);
      this.Shape4.setTextureSize(64, 32);
      this.Shape4.mirror = true;
      this.setRotation(this.Shape4, -2.792527F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 24, 13);
      this.Shape7.addBox(4.0F, 13.0F, 0.0F, 1, 4, 6);
      this.Shape7.setRotationPoint(-8.0F, 14.0F, 12.0F);
      this.Shape7.setTextureSize(64, 32);
      this.Shape7.mirror = true;
      this.setRotation(this.Shape7, -1.22173F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 24, 13);
      this.Shape8.addBox(4.0F, 13.0F, 0.0F, 1, 4, 6);
      this.Shape8.setRotationPoint(-1.0F, 14.0F, 12.0F);
      this.Shape8.setTextureSize(64, 32);
      this.Shape8.mirror = true;
      this.setRotation(this.Shape8, -1.22173F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 22, 6);
      this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape9.setRotationPoint(0.0F, 14.0F, 3.0F);
      this.Shape9.setTextureSize(64, 32);
      this.Shape9.mirror = true;
      this.setRotation(this.Shape9, 1.570796F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 19, 10);
      this.Shape10.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape10.setRotationPoint(0.0F, 15.0F, 0.0F);
      this.Shape10.setTextureSize(64, 32);
      this.Shape10.mirror = true;
      this.setRotation(this.Shape10, 1.570796F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 19, 10);
      this.Shape11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
      this.Shape11.setRotationPoint(0.0F, 14.0F, 0.0F);
      this.Shape11.setTextureSize(64, 32);
      this.Shape11.mirror = true;
      this.setRotation(this.Shape11, 1.570796F, 0.0F, 0.0F);
      this.Shape12 = new ModelRenderer(this, 21, 10);
      this.Shape12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape12.setRotationPoint(0.0F, 11.0F, 1.0F);
      this.Shape12.setTextureSize(64, 32);
      this.Shape12.mirror = true;
      this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 31, 0);
      this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape5.setRotationPoint(1.0F, 19.0F, 2.0F);
      this.Shape5.setTextureSize(64, 32);
      this.Shape5.mirror = true;
      this.setRotation(this.Shape5, 3.141593F, 0.0F, 0.0F);
      this.Shape13 = new ModelRenderer(this, 31, 0);
      this.Shape13.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape13.setRotationPoint(-2.0F, 19.0F, 2.0F);
      this.Shape13.setTextureSize(64, 32);
      this.Shape13.mirror = true;
      this.setRotation(this.Shape13, 3.141593F, 0.0F, 0.0F);
      this.Shape14 = new ModelRenderer(this, 27, 0);
      this.Shape14.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
      this.Shape14.setRotationPoint(0.0F, 13.0F, 1.0F);
      this.Shape14.setTextureSize(64, 32);
      this.Shape14.mirror = true;
      this.setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
      this.Shape15 = new ModelRenderer(this, 27, 0);
      this.Shape15.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
      this.Shape15.setRotationPoint(-3.0F, 13.0F, 1.0F);
      this.Shape15.setTextureSize(64, 32);
      this.Shape15.mirror = true;
      this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
      this.Shape16 = new ModelRenderer(this, 31, 0);
      this.Shape16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape16.setRotationPoint(1.0F, 13.0F, 3.0F);
      this.Shape16.setTextureSize(64, 32);
      this.Shape16.mirror = true;
      this.setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
      this.Shape17 = new ModelRenderer(this, 31, 0);
      this.Shape17.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1);
      this.Shape17.setRotationPoint(-2.0F, 14.0F, 3.0F);
      this.Shape17.setTextureSize(64, 32);
      this.Shape17.mirror = true;
      this.setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.Shape7.render(f5);
      this.Shape8.render(f5);
      this.Shape9.render(f5);
      this.Shape10.render(f5);
      this.Shape11.render(f5);
      this.Shape12.render(f5);
      this.Shape5.render(f5);
      this.Shape13.render(f5);
      this.Shape14.render(f5);
      this.Shape15.render(f5);
      this.Shape16.render(f5);
      this.Shape17.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}