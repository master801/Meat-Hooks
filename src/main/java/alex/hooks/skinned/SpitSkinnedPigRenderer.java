package alex.hooks.skinned;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import alex.hooks.skinned.SpitSkinnedPigEntity;
import alex.hooks.spit.SpitPigModel;
import org.lwjgl.opengl.GL11;

public class SpitSkinnedPigRenderer extends TileEntitySpecialRenderer {

   private final SpitPigModel model = new SpitPigModel();

   @Override
   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      SpitSkinnedPigEntity a = (SpitSkinnedPigEntity)te;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("Hooks:textures/blocks/spitPigSkinned.png");
      super.tileEntityRenderer.renderEngine.bindTexture(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(te.getBlockMetadata() * -90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.03125F, 0.65625F, 0.0F);
      GL11.glRotatef(a.angle, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.03125F, -0.65625F, 0.0F);
      this.model.render(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 1.0F / 16.0F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }

   private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
      int meta = world.h(x, y, z);
      GL11.glPushMatrix();
      GL11.glRotatef((float)(meta * -90), 0.0F, 0.0F, 1.0F);
      GL11.glPopMatrix();
   }

   private void adjustLightFixture(World world, int i, int j, int k, Block block) {
      bfq tess = bfq.a;
      float brightness = block.f(world, i, j, k);
      int skyLight = world.h(i, j, k, 0);
      int modulousModifier = skyLight % 65536;
      int divModifier = skyLight / 65536;
      tess.a(brightness, brightness, brightness);
      bma.a(bma.b, (float)modulousModifier, (float)divModifier);
   }
}
