package alex.hooks.hooked;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class HookedZombieRenderer extends TileEntitySpecialRenderer {

   private final HookedZombieModel model = new HookedZombieModel();

   @Override
   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      HookedZombieEntity a = (HookedZombieEntity)te;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("Hooks:textures/blocks/hookedZombie.png");
      super.tileEntityRenderer.renderEngine.bindTexture(textures);
      GL11.glRotatef(te.getBlockMetadata() * -90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -1.9375F, 0.0F);
      this.model.rightarm.rotateAngleX = a.angle;
      this.model.leftarm.rotateAngleX = a.bangle;
      this.model.rightarm.rotateAngleY = a.yangle;
      this.model.leftarm.rotateAngleY = -a.yangle;
      this.model.head.rotateAngleX = a.cangle;
      this.model.head.rotateAngleY = a.eangle;
      this.model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 1.0F / 16.0F);
      GL11.glPopMatrix();
   }

   private void adjustLightFixture(World world, int i, int j, int k, Block block) {
      Tessellator tess = Tessellator.instance;
      float brightness = block.getBlockBrightness(world, i, j, k);
      int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
      int modulousModifier = skyLight % 65536;
      int divModifier = skyLight / 65536;
      tess.setColorOpaque_F(brightness, brightness, brightness);
      OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)modulousModifier, (float)divModifier);
   }

}
