package alex.hooks.spit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import alex.hooks.skinned.SpitSkinnedChickenEntity;
import alex.hooks.skinned.SpitSkinnedCowEntity;
import alex.hooks.skinned.SpitSkinnedPigEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitPropBlock extends BlockContainer {

   public SpitPropBlock(int id) {
      super(id, Material.ground);
      this.setCreativeTab(CreativeTabs.tabBlock);
      this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 0.9F, 0.7F);
      this.setUnlocalizedName("spitProp");
      this.setHardness(2.0F);
   }

   @Override
   public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
      if(Block.isNormalCube(par1World.getBlockId(par2, par3 - 1, par4))) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
      }
   }

   @Override
   public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
      SpitCowEntity a;
      if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
         a.angle = 1.0F;
      } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitCowEntity) {
         a = (SpitCowEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
         a.angle = 1.0F;
      } else {
         SpitPigEntity a1;
         if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
            a1.angle = 1.0F;
         } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitPigEntity) {
            a1 = (SpitPigEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
            a1.angle = 1.0F;
         } else {
            SpitChickenEntity a2;
            if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
               a2.angle = 1.0F;
            } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitChickenEntity) {
               a2 = (SpitChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
               a2.angle = 1.0F;
            } else {
               SpitSkinnedCowEntity a3;
               if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
                  a3.angle = 1.0F;
               } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitSkinnedCowEntity) {
                  a3 = (SpitSkinnedCowEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
                  a3.angle = 1.0F;
               } else {
                  SpitSkinnedPigEntity a4;
                  if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
                     a4.angle = 1.0F;
                  } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitSkinnedPigEntity) {
                     a4 = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
                     a4.angle = 1.0F;
                  } else {
                     SpitSkinnedChickenEntity a5;
                     if(par1World.getBlockTileEntity(par2 + 1, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2 + 1, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2 - 1, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2 - 1, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2, par3, par4 + 1) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 + 1);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2, par3, par4 - 1) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 - 1);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2 + 2, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2 + 2, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2 - 2, par3, par4) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2 - 2, par3, par4);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2, par3, par4 + 2) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 + 2);
                        a5.angle = 1.0F;
                     } else if(par1World.getBlockTileEntity(par2, par3, par4 - 2) instanceof SpitSkinnedChickenEntity) {
                        a5 = (SpitSkinnedChickenEntity)par1World.getBlockTileEntity(par2, par3, par4 - 2);
                        a5.angle = 1.0F;
                     }
                  }
               }
            }
         }
      }

   }

   @Override
   public TileEntity createNewTileEntity(World world) {
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
      par1IconRegister.registerIcon("Hooks:spitPropIcon");
   }

}
