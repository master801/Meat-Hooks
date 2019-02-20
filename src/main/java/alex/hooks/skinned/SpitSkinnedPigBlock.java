package alex.hooks.skinned;

import net.minecraft.client.renderer.texture.IconRegister;

import alex.hooks.Hooks;
import alex.hooks.skinned.SpitSkinnedPigEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

public class SpitSkinnedPigBlock extends amw {

   public SpitSkinnedPigBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.c("spitSkinnedPig");
      this.c(500.0F);
      this.b(true);
   }

   public void a(acf ba, int x, int y, int z) {
      switch(ba.h(x, y, z)) {
      case 0:
         this.a(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
         break;
      case 3:
         this.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void a(abw par1World, int par2, int par3, int par4, Random par5Random) {
      SpitSkinnedPigEntity a = (SpitSkinnedPigEntity)par1World.r(par2, par3, par4);
      asx aabb = asx.a((double)par2, (double)(par3 - 2), (double)par4, (double)(par2 + 1), (double)(par3 - 1), (double)(par4 + 1));
      if(par1World.e(aabb)) {
         if(a.angle != 0.0F) {
            par1World.f(par2, par3, par4, Hooks.cookedPig.cF, par1World.h(par2, par3, par4), 2);
         } else {
            par1World.f(par2, par3, par4, Hooks.burntPig.cF, par1World.h(par2, par3, par4), 2);
         }
      }

   }

   public int a(int metadata, Random random, int fortune) {
      return Hooks.pigMeat.cv;
   }

   public int quantityDropped(int meta, int fortune, Random random) {
      int amount = 2 + random.nextInt(3) + fortune;
      return amount;
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new SpitSkinnedPigEntity();
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
