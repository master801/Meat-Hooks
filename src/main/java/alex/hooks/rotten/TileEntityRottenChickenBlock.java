package alex.hooks.rotten;

import net.minecraft.client.renderer.texture.IconRegister;

import alex.hooks.rotten.TileEntityRottenChickenEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Random;

public class TileEntityRottenChickenBlock extends amw {

   public TileEntityRottenChickenBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.c("rottenChicken");
      this.c(500.0F);
   }

   public int quantityDropped(int metadata, int fortune, Random rand) {
      return 3 + rand.nextInt(3) + fortune;
   }

   public ArrayList getBlockDropped(abw world, int x, int y, int z, int metadata, int fortune) {
      ArrayList ret = new ArrayList();
      int amount = this.quantityDropped(metadata, fortune, world.s);
      boolean luckDraw = false;
      boolean idDropped = false;
      boolean metaDropped = false;

      for(int i = 0; i < amount; ++i) {
         int var13 = world.s.nextInt(3);
         int var14 = 0;
         byte var15 = 0;
         if(var13 == 0) {
            var14 = yc.bo.cv;
         }

         if(var13 == 1) {
            var14 = yc.bo.cv;
         }

         if(var13 == 2) {
            var14 = yc.aZ.cv;
         }

         ret.add(new ye(var14, 1, var15));
      }

      return ret;
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new TileEntityRottenChickenEntity();
   }

   @Override
   public int getRenderType() {
      return -1;
   }

   @Override
   public boolean renderAsNormalBlock() {
      return false;
   }

   @Override
   public boolean isOpaqueCube() {
      return false;
   }

   @Override
   @SideOnly(Side.CLIENT)
   public void registerIcons(final IconRegister par1IconRegister) {
      par1IconRegister.registerIcon("Hooks:hookIcon");
   }

}
