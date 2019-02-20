package alex.hooks.hooked;

import net.minecraft.client.renderer.texture.IconRegister;

import alex.hooks.Hooks;
import alex.hooks.hooked.TileEntityHookedPigEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

public class TileEntityHookedPigBlock extends amw {

   public TileEntityHookedPigBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.c("hookedPig");
      this.c(500.0F);
      this.b(true);
   }

   public void a(abw par1World, int par2, int par3, int par4, Random par5Random) {
      if(par1World.s.nextInt(10) == 0) {
         int meta = par1World.h(par2, par3, par4);
         if(par1World.a(par2, par3 + 1, par4) != 79 && par1World.a(par2, par3 - 3, par4) != 79 && par1World.a(par2 + 1, par3, par4) != 79 && par1World.a(par2 - 1, par3, par4) != 79 && par1World.a(par2, par3, par4 + 1) != 79 && par1World.a(par2, par3, par4 - 1) != 79 && par1World.a(par2 + 1, par3 - 1, par4) != 79 && par1World.a(par2 - 1, par3 - 1, par4) != 79 && par1World.a(par2, par3 - 1, par4 + 1) != 79 && par1World.a(par2, par3 - 1, par4 - 1) != 79 && par1World.a(par2 + 1, par3 - 2, par4) != 79 && par1World.a(par2 - 1, par3 - 2, par4) != 79 && par1World.a(par2, par3 - 2, par4 + 1) != 79 && par1World.a(par2, par3 - 2, par4 - 1) != 79 && par1World.a(par2, par3 - 2, par4) != 10 && par1World.a(par2, par3 - 3, par4) != 10 && par1World.a(par2, par3 - 4, par4) != 10 && par1World.a(par2, par3 - 5, par4) != 10 && par1World.a(par2, par3 - 6, par4) != 10 && par1World.a(par2, par3 - 7, par4) != 10 && par1World.a(par2, par3 - 2, par4) != 11 && par1World.a(par2, par3 - 3, par4) != 11 && par1World.a(par2, par3 - 4, par4) != 11 && par1World.a(par2, par3 - 5, par4) != 11 && par1World.a(par2, par3 - 6, par4) != 11 && par1World.a(par2, par3 - 7, par4) != 11 && par5Random.nextInt(10) == 0) {
            par1World.f(par2, par3, par4, Hooks.rottenPig.cF, meta, 2);
         }
      }

   }

   public int a(int metadata, Random random, int fortune) {
      return Hooks.pigMeat.cv;
   }

   public int quantityDropped(int meta, int fortune, Random random) {
      byte amount = 0;
      return amount;
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new TileEntityHookedPigEntity();
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
