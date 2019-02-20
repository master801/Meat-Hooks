package alex.hooks;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HookModel extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;

    public HookModel() {
        this.textureHeight = textureWidth = 16;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.Shape1.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Shape1.setTextureSize(16, 16);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 0, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.Shape2.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Shape2.setTextureSize(16, 16);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 0, 0);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
        this.Shape3.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Shape3.setTextureSize(16, 16);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 0, 0);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape4.setRotationPoint(0.0F, 11.0F, 1.0F);
        this.Shape4.setTextureSize(16, 16);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
