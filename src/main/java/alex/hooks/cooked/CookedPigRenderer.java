package alex.hooks.cooked;

import alex.hooks.spit.SpitPigModel;
import org.lwjgl.opengl.GL11;

public class CookedPigRenderer extends bje {

   private final SpitPigModel model = new SpitPigModel();


   private void adjustRotatePivotViaMeta(abw world, int x, int y, int z) {
      int meta = world.h(x, y, z);
      GL11.glPushMatrix();
      GL11.glRotatef((float)(meta * -90), 0.0F, 0.0F, 1.0F);
      GL11.glPopMatrix();
   }

   public void a(asp te, double x, double y, double z, float scale) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      bjo textures = new bjo("Hooks:textures/blocks/spitPigCooked.png");
      atv.w().N.a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef((float)(te.p() * -90), 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      this.model.a((nn)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }

   private void adjustLightFixture(abw world, int i, int j, int k, aqz block) {
      bfq tess = bfq.a;
      float brightness = block.f(world, i, j, k);
      int skyLight = world.h(i, j, k, 0);
      int modulousModifier = skyLight % 65536;
      int divModifier = skyLight / 65536;
      tess.a(brightness, brightness, brightness);
      bma.a(bma.b, (float)modulousModifier, (float)divModifier);
   }
}
