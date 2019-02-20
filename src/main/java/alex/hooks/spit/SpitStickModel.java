package alex.hooks.spit;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpitStickModel extends ModelBase {

   ModelRenderer Shape1;

   public SpitStickModel() {
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.Shape1 = new ModelRenderer(this, 14, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 51);
      this.Shape1.setRotationPoint(0.0F, 10.0F, -17.0F);
      this.Shape1.setTextureSize(128, 64);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.Shape1.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

}
