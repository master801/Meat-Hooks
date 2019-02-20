package alex.hooks.spit;

import net.minecraft.client.renderer.texture.IconRegister;

import alex.hooks.skinned.SpitSkinnedChickenEntity;
import alex.hooks.skinned.SpitSkinnedCowEntity;
import alex.hooks.skinned.SpitSkinnedPigEntity;
import alex.hooks.spit.SpitChickenEntity;
import alex.hooks.spit.SpitCowEntity;
import alex.hooks.spit.SpitPigEntity;
import alex.hooks.spit.SpitPropEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitPropBlock extends amw {

   public SpitPropBlock(int id) {
      super(id, akc.c);
      this.a(ww.b);
      this.a(0.3F, 0.0F, 0.3F, 0.7F, 0.9F, 0.7F);
      this.c("spitProp");
      this.c(2.0F);
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      if(aqz.l(par1World.a(par2, par3 - 1, par4))) {
         par1World.b(par2, par3, par4, l, 2);
      }

   }

   public void a(abw par1World, int par2, int par3, int par4, uf par5EntityPlayer) {
      SpitCowEntity a;
      if(par1World.r(par2 + 1, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2 + 1, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2 - 1, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2, par3, par4 + 1);
         a.angle = 1.0F;
      } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2, par3, par4 - 1);
         a.angle = 1.0F;
      } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2 + 2, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2 - 2, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2, par3, par4 + 2);
         a.angle = 1.0F;
      } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.r(par2, par3, par4 - 2);
         a.angle = 1.0F;
      } else {
         SpitPigEntity a1;
         if(par1World.r(par2 + 1, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2 + 1, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2 - 1, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2, par3, par4 + 1);
            a1.angle = 1.0F;
         } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2, par3, par4 - 1);
            a1.angle = 1.0F;
         } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2 + 2, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2 - 2, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2, par3, par4 + 2);
            a1.angle = 1.0F;
         } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.r(par2, par3, par4 - 2);
            a1.angle = 1.0F;
         } else {
            SpitChickenEntity a2;
            if(par1World.r(par2 + 1, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2 + 1, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2 - 1, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2, par3, par4 + 1);
               a2.angle = 1.0F;
            } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2, par3, par4 - 1);
               a2.angle = 1.0F;
            } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2 + 2, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2 - 2, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2, par3, par4 + 2);
               a2.angle = 1.0F;
            } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.r(par2, par3, par4 - 2);
               a2.angle = 1.0F;
            } else {
               SpitSkinnedCowEntity a3;
               if(par1World.r(par2 + 1, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2 + 1, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2 - 1, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2, par3, par4 + 1);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2, par3, par4 - 1);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2 + 2, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2 - 2, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2, par3, par4 + 2);
                  a3.angle = 1.0F;
               } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.r(par2, par3, par4 - 2);
                  a3.angle = 1.0F;
               } else {
                  SpitSkinnedPigEntity a4;
                  if(par1World.r(par2 + 1, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2 + 1, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2 - 1, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2, par3, par4 + 1);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2, par3, par4 - 1);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2 + 2, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2 - 2, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2, par3, par4 + 2);
                     a4.angle = 1.0F;
                  } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.r(par2, par3, par4 - 2);
                     a4.angle = 1.0F;
                  } else {
                     SpitSkinnedChickenEntity a5;
                     if(par1World.r(par2 + 1, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2 + 1, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2 - 1, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2 - 1, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2, par3, par4 + 1) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2, par3, par4 + 1);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2, par3, par4 - 1) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2, par3, par4 - 1);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2 + 2, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2 + 2, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2 - 2, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2 - 2, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2, par3, par4 + 2) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2, par3, par4 + 2);
                        a5.angle = 1.0F;
                     } else if(par1World.r(par2, par3, par4 - 2) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.r(par2, par3, par4 - 2);
                        a5.angle = 1.0F;
                     }
                  }
               }
            }
         }
      }

   }

   public asp b(abw world) {
      return new SpitPropEntity();
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
      this.cW = icon.a("Hooks:spitPropIcon");
   }
}
