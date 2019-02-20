package alex.hooks;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HookedPigModel extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;

    public HookedPigModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Shape1 = new ModelRenderer(this, 19, 21);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.Shape1.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 1.570796F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 19, 27);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
        this.Shape2.setRotationPoint(0.0F, 15.0F, 1.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 1.570796F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 17, 23);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4);
        this.Shape3.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 1.570796F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 19, 24);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
        this.Shape4.setRotationPoint(0.0F, 11.0F, 1.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 31.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 1.570796F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8);
        this.body.setRotationPoint(0.0F, 22.0F, -4.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, -2.918521F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
        this.leg1.setRotationPoint(-3.0F, 18.0F, -1.0F);
        this.leg1.setTextureSize(64, 32);
        this.leg1.mirror = true;
        this.setRotation(this.leg1, 2.617994F, 0.0F, 0.4363323F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
        this.leg2.setRotationPoint(3.0F, 18.0F, -1.0F);
        this.leg2.setTextureSize(64, 32);
        this.leg2.mirror = true;
        this.setRotation(this.leg2, 2.617994F, 0.0F, -0.4363323F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2.0F, 18.0F, -2.0F, 4, 6, 4);
        this.leg3.setRotationPoint(-3.0F, 12.0F, -3.0F);
        this.leg3.setTextureSize(64, 32);
        this.leg3.mirror = true;
        this.setRotation(this.leg3, 0.3490659F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4);
        this.leg4.setRotationPoint(3.0F, 29.0F, 3.0F);
        this.leg4.setTextureSize(64, 32);
        this.leg4.mirror = true;
        this.setRotation(this.leg4, 0.3490659F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
        this.Shape4.render(f5);
        this.head.render(f5);
        this.body.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
