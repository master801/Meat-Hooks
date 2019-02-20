package alex.hooks.spit;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpitChickenModel extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape5;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape6;
    ModelRenderer Shape4;

    public SpitChickenModel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, -4.0F, 4, 6, 3);
        this.Shape1.setRotationPoint(-2.0F, 6.0F, 4.0F);
        this.Shape1.setTextureSize(128, 64);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.3490659F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 14, 0);
        this.Shape2.addBox(0.0F, 0.0F, -4.0F, 4, 2, 2);
        this.Shape2.setRotationPoint(-2.0F, 9.0F, 3.0F);
        this.Shape2.setTextureSize(128, 64);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.3490659F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 14, 4);
        this.Shape3.addBox(0.0F, 0.0F, -4.0F, 2, 2, 2);
        this.Shape3.setRotationPoint(-1.0F, 10.0F, 4.0F);
        this.Shape3.setTextureSize(128, 64);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.3490659F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 24, 13);
        this.Shape7.addBox(4.0F, 0.0F, 0.0F, 1, 4, 6);
        this.Shape7.setRotationPoint(-8.0F, 8.0F, 5.0F);
        this.Shape7.setTextureSize(128, 64);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.3490659F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 24, 13);
        this.Shape8.addBox(4.0F, 0.0F, 0.0F, 1, 4, 6);
        this.Shape8.setRotationPoint(-1.0F, 8.0F, 5.0F);
        this.Shape8.setTextureSize(128, 64);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.3490659F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 31, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.Shape5.setRotationPoint(1.0F, 13.0F, 9.0F);
        this.Shape5.setTextureSize(128, 64);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 1.832596F, -0.3490659F, 0.0F);
        this.Shape13 = new ModelRenderer(this, 31, 0);
        this.Shape13.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.Shape13.setRotationPoint(-2.0F, 13.0F, 9.0F);
        this.Shape13.setTextureSize(128, 64);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, 1.805228F, 0.3490659F, 0.0F);
        this.Shape14 = new ModelRenderer(this, 27, 0);
        this.Shape14.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
        this.Shape14.setRotationPoint(-1.0F, 13.0F, 13.0F);
        this.Shape14.setTextureSize(128, 64);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, 1.832596F, -0.3490659F, 0.0F);
        this.Shape15 = new ModelRenderer(this, 27, 0);
        this.Shape15.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
        this.Shape15.setRotationPoint(-1.0F, 13.0F, 14.0F);
        this.Shape15.setTextureSize(128, 64);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, 1.832596F, 0.3490659F, 0.0F);
        this.Shape16 = new ModelRenderer(this, 31, 0);
        this.Shape16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape16.setRotationPoint(0.0F, 13.93333F, 13.5F);
        this.Shape16.setTextureSize(128, 64);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, 1.832596F, -0.3490659F, 0.0F);
        this.Shape17 = new ModelRenderer(this, 31, 0);
        this.Shape17.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape17.setRotationPoint(0.0F, 14.0F, 14.0F);
        this.Shape17.setTextureSize(128, 64);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 1.832596F, 0.3490659F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 13, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 51);
        this.Shape6.setRotationPoint(0.0F, 10.0F, -17.0F);
        this.Shape6.setTextureSize(128, 64);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 0, 9);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 6, 8, 6);
        this.Shape4.setRotationPoint(-3.0F, 14.0F, 5.0F);
        this.Shape4.setTextureSize(128, 64);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 1.905404F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape7.render(f5);
        this.Shape8.render(f5);
        this.Shape5.render(f5);
        this.Shape13.render(f5);
        this.Shape14.render(f5);
        this.Shape15.render(f5);
        this.Shape16.render(f5);
        this.Shape17.render(f5);
        this.Shape6.render(f5);
        this.Shape4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
