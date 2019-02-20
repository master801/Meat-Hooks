package alex.hooks.spit;

import net.minecraft.client.renderer.texture.IconRegister;

import alex.hooks.Hooks;
import alex.hooks.spit.SpitStickEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitStickBlock extends amw {

   public SpitStickBlock(int id) {
      super(id, akc.c);
      this.a(ww.b);
      this.c("spitStick");
      this.c(2.0F);
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      if(par1World.a(par2, par3, par4 + 1) == Hooks.spitProp.cF && par1World.a(par2, par3, par4 - 2) == Hooks.spitProp.cF) {
         par1World.b(par2, par3, par4, 0, 2);
         par1World.b(par2, par3, par4 - 2, 0, 2);
         par1World.b(par2, par3, par4 + 1, 0, 2);
         par1World.f(par2, par3, par4 - 1, Hooks.x2Inv.cF, 0, 2);
      } else if(par1World.a(par2 + 1, par3, par4) == Hooks.spitProp.cF && par1World.a(par2 - 2, par3, par4) == Hooks.spitProp.cF) {
         par1World.b(par2, par3, par4, 3, 2);
         par1World.b(par2 - 2, par3, par4, 3, 2);
         par1World.b(par2 + 1, par3, par4, 3, 2);
         par1World.f(par2 - 1, par3, par4, Hooks.x2Inv.cF, 3, 2);
      } else if(par1World.a(par2, par3, par4 - 1) == Hooks.spitProp.cF && par1World.a(par2, par3, par4 + 2) == Hooks.spitProp.cF) {
         par1World.b(par2, par3, par4, 2, 2);
         par1World.b(par2, par3, par4 + 2, 2, 2);
         par1World.b(par2, par3, par4 - 1, 2, 2);
         par1World.f(par2, par3, par4 + 1, Hooks.x2Inv.cF, 2, 2);
      } else if(par1World.a(par2 - 1, par3, par4) == Hooks.spitProp.cF && par1World.a(par2 + 2, par3, par4) == Hooks.spitProp.cF) {
         par1World.b(par2, par3, par4, 1, 2);
         par1World.b(par2 + 2, par3, par4, 1, 2);
         par1World.b(par2 - 1, par3, par4, 1, 2);
         par1World.f(par2 + 1, par3, par4, Hooks.x2Inv.cF, 1, 2);
      } else {
         par1World.a(par2, par3, par4, true);
      }

   }

   public void a(acf ba, int x, int y, int z) {
      switch(ba.h(x, y, z)) {
      case 0:
         this.a(0.4F, 0.7F, -1.0F, 0.6F, 0.9F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.7F, 0.4F, 2.0F, 0.9F, 0.6F);
         break;
      case 2:
         this.a(0.4F, 0.7F, 0.0F, 0.6F, 0.9F, 2.0F);
         break;
      case 3:
         this.a(-1.0F, 0.7F, 0.4F, 1.0F, 0.9F, 0.6F);
      }

   }

   public void g(abw par1World, int par2, int par3, int par4, int par5) {
      switch(par5) {
      case 0:
         par1World.a(par2, par3, par4 - 1, false);
         break;
      case 1:
         par1World.a(par2 + 1, par3, par4, false);
         break;
      case 2:
         par1World.a(par2, par3, par4 + 1, false);
         break;
      case 3:
         par1World.a(par2 - 1, par3, par4, false);
      }

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

   public void a(mt icon) {
      this.cW = icon.a("Hooks:spitStickIcon");
   }
}
