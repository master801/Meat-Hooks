package alex.hooks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import alex.hooks.IceChest;
import alex.hooks.IceChestEntity;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class IceChestRenderer extends TileEntitySpecialRenderer {

   private static final ResourceLocation RES_TRAPPED_DOUBLE = new ResourceLocation("Hooks:textures/blocks/trapped_double.png");
   private static final ResourceLocation RES_CHRISTMAS_DOUBLE = new ResourceLocation("Hooks:textures/blocks/christmas_double.png");
   private static final ResourceLocation RES_NORMAL_DOUBLE = new ResourceLocation("Hooks:textures/blocks/normal_double.png");
   private static final ResourceLocation RES_TRAPPED_SINGLE = new ResourceLocation("Hooks:textures/blocks/trapped.png");
   private static final ResourceLocation RES_CHRISTMAS_SINGLE = new ResourceLocation("Hooks:textures/blocks/christmas.png");
   private static final ResourceLocation RES_NORMAL_SINGLE = new ResourceLocation("Hooks:textures/blocks/normal.png");
   private bbd chestModel = new bbd();
   private bbd largeChestModel = new bbk();
   private boolean isChristmas;


   public IceChestRenderer() {
      Calendar calendar = Calendar.getInstance();
      if(calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
         this.isChristmas = true;
      }

   }

   @Override
   public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8) {
      this.renderTileEntityChestAt((IceChestEntity)par1TileEntity, par2, par4, par6, par8);
   }

   public void renderTileEntityChestAt(IceChestEntity par1TileEntityChest, double par2, double par4, double par6, float par8) {
      int i;
      if(!par1TileEntityChest.o()) {
         i = 0;
      } else {
         aqz modelchest = par1TileEntityChest.q();
         i = par1TileEntityChest.p();
         if(modelchest instanceof IceChest && i == 0) {
            try {
               ((IceChest)modelchest).unifyAdjacentChests(par1TileEntityChest.az(), par1TileEntityChest.l, par1TileEntityChest.m, par1TileEntityChest.n);
            } catch (ClassCastException var14) {
               FMLLog.severe("Attempted to render a chest at %d,  %d, %d that was not a chest", new Object[]{Integer.valueOf(par1TileEntityChest.l), Integer.valueOf(par1TileEntityChest.m), Integer.valueOf(par1TileEntityChest.n)});
            }

            i = par1TileEntityChest.p();
         }

         par1TileEntityChest.checkForAdjacentChests();
      }

      if(par1TileEntityChest.adjacentChestZNeg == null && par1TileEntityChest.adjacentChestXNeg == null) {
         bbd modelchest1;
         if(par1TileEntityChest.adjacentChestXPos == null && par1TileEntityChest.adjacentChestZPosition == null) {
            modelchest1 = this.chestModel;
            if(par1TileEntityChest.getChestType() == 1) {
               this.a(RES_TRAPPED_SINGLE);
            } else if(this.isChristmas) {
               this.a(RES_CHRISTMAS_SINGLE);
            } else {
               this.a(RES_NORMAL_SINGLE);
            }
         } else {
            modelchest1 = this.largeChestModel;
            if(par1TileEntityChest.getChestType() == 1) {
               this.a(RES_TRAPPED_DOUBLE);
            } else if(this.isChristmas) {
               this.a(RES_CHRISTMAS_DOUBLE);
            } else {
               this.a(RES_NORMAL_DOUBLE);
            }
         }

         GL11.glPushMatrix();
         GL11.glEnable('\u803a');
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)par2, (float)par4 + 1.0F, (float)par6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short short1 = 0;
         if(i == 2) {
            short1 = 180;
         }

         if(i == 3) {
            short1 = 0;
         }

         if(i == 4) {
            short1 = 90;
         }

         if(i == 5) {
            short1 = -90;
         }

         if(i == 2 && par1TileEntityChest.adjacentChestXPos != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if(i == 5 && par1TileEntityChest.adjacentChestZPosition != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float f1 = par1TileEntityChest.prevLidAngle + (par1TileEntityChest.lidAngle - par1TileEntityChest.prevLidAngle) * par8;
         float f2;
         if(par1TileEntityChest.adjacentChestZNeg != null) {
            f2 = par1TileEntityChest.adjacentChestZNeg.prevLidAngle + (par1TileEntityChest.adjacentChestZNeg.lidAngle - par1TileEntityChest.adjacentChestZNeg.prevLidAngle) * par8;
            if(f2 > f1) {
               f1 = f2;
            }
         }

         if(par1TileEntityChest.adjacentChestXNeg != null) {
            f2 = par1TileEntityChest.adjacentChestXNeg.prevLidAngle + (par1TileEntityChest.adjacentChestXNeg.lidAngle - par1TileEntityChest.adjacentChestXNeg.prevLidAngle) * par8;
            if(f2 > f1) {
               f1 = f2;
            }
         }

         f1 = 1.0F - f1;
         f1 = 1.0F - f1 * f1 * f1;
         modelchest1.a.f = -(f1 * 3.1415927F / 2.0F);
         modelchest1.a();
         GL11.glDisable('\u803a');
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

   }

}
