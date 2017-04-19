package alex.hooks;

import alex.hooks.IceChestEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.Random;
import net.minecraftforge.common.ForgeDirection;

public class IceChest extends amw {

   private final Random random = new Random();
   public final int chestType;


   protected IceChest(int par1, int par2) {
      super(par1, akc.w);
      this.chestType = par2;
      this.a(ww.c);
      this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      this.d("Hooks".toLowerCase() + ":deadCow");
   }

   public boolean c() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return -1;
   }

   public void a(acf par1IBlockAccess, int par2, int par3, int par4) {
      if(par1IBlockAccess.a(par2, par3, par4 - 1) == this.cF) {
         this.a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
      } else if(par1IBlockAccess.a(par2, par3, par4 + 1) == this.cF) {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
      } else if(par1IBlockAccess.a(par2 - 1, par3, par4) == this.cF) {
         this.a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      } else if(par1IBlockAccess.a(par2 + 1, par3, par4) == this.cF) {
         this.a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
      } else {
         this.a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      }

   }

   public void a(abw par1World, int par2, int par3, int par4) {
      super.a(par1World, par2, par3, par4);
      this.unifyAdjacentChests(par1World, par2, par3, par4);
      int l = par1World.a(par2, par3, par4 - 1);
      int i1 = par1World.a(par2, par3, par4 + 1);
      int j1 = par1World.a(par2 - 1, par3, par4);
      int k1 = par1World.a(par2 + 1, par3, par4);
      if(l == this.cF) {
         this.unifyAdjacentChests(par1World, par2, par3, par4 - 1);
      }

      if(i1 == this.cF) {
         this.unifyAdjacentChests(par1World, par2, par3, par4 + 1);
      }

      if(j1 == this.cF) {
         this.unifyAdjacentChests(par1World, par2 - 1, par3, par4);
      }

      if(k1 == this.cF) {
         this.unifyAdjacentChests(par1World, par2 + 1, par3, par4);
      }

   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = par1World.a(par2, par3, par4 - 1);
      int i1 = par1World.a(par2, par3, par4 + 1);
      int j1 = par1World.a(par2 - 1, par3, par4);
      int k1 = par1World.a(par2 + 1, par3, par4);
      byte b0 = 0;
      int l1 = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 0.5D) & 3;
      if(l1 == 0) {
         b0 = 2;
      }

      if(l1 == 1) {
         b0 = 5;
      }

      if(l1 == 2) {
         b0 = 3;
      }

      if(l1 == 3) {
         b0 = 4;
      }

      if(l != this.cF && i1 != this.cF && j1 != this.cF && k1 != this.cF) {
         par1World.b(par2, par3, par4, b0, 3);
      } else {
         if((l == this.cF || i1 == this.cF) && (b0 == 4 || b0 == 5)) {
            if(l == this.cF) {
               par1World.b(par2, par3, par4 - 1, b0, 3);
            } else {
               par1World.b(par2, par3, par4 + 1, b0, 3);
            }

            par1World.b(par2, par3, par4, b0, 3);
         }

         if((j1 == this.cF || k1 == this.cF) && (b0 == 2 || b0 == 3)) {
            if(j1 == this.cF) {
               par1World.b(par2 - 1, par3, par4, b0, 3);
            } else {
               par1World.b(par2 + 1, par3, par4, b0, 3);
            }

            par1World.b(par2, par3, par4, b0, 3);
         }
      }

      if(par6ItemStack.u()) {
         ((IceChestEntity)par1World.r(par2, par3, par4)).setChestGuiName(par6ItemStack.s());
      }

   }

   public void unifyAdjacentChests(abw par1World, int par2, int par3, int par4) {
      if(!par1World.I) {
         int l = par1World.a(par2, par3, par4 - 1);
         int i1 = par1World.a(par2, par3, par4 + 1);
         int j1 = par1World.a(par2 - 1, par3, par4);
         int k1 = par1World.a(par2 + 1, par3, par4);
         boolean flag = true;
         int l1;
         int i2;
         boolean flag1;
         byte b0;
         int j2;
         if(l != this.cF && i1 != this.cF) {
            if(j1 != this.cF && k1 != this.cF) {
               b0 = 3;
               if(aqz.t[l] && !aqz.t[i1]) {
                  b0 = 3;
               }

               if(aqz.t[i1] && !aqz.t[l]) {
                  b0 = 2;
               }

               if(aqz.t[j1] && !aqz.t[k1]) {
                  b0 = 5;
               }

               if(aqz.t[k1] && !aqz.t[j1]) {
                  b0 = 4;
               }
            } else {
               l1 = par1World.a(j1 == this.cF?par2 - 1:par2 + 1, par3, par4 - 1);
               i2 = par1World.a(j1 == this.cF?par2 - 1:par2 + 1, par3, par4 + 1);
               b0 = 3;
               flag1 = true;
               if(j1 == this.cF) {
                  j2 = par1World.h(par2 - 1, par3, par4);
               } else {
                  j2 = par1World.h(par2 + 1, par3, par4);
               }

               if(j2 == 2) {
                  b0 = 2;
               }

               if((aqz.t[l] || aqz.t[l1]) && !aqz.t[i1] && !aqz.t[i2]) {
                  b0 = 3;
               }

               if((aqz.t[i1] || aqz.t[i2]) && !aqz.t[l] && !aqz.t[l1]) {
                  b0 = 2;
               }
            }
         } else {
            l1 = par1World.a(par2 - 1, par3, l == this.cF?par4 - 1:par4 + 1);
            i2 = par1World.a(par2 + 1, par3, l == this.cF?par4 - 1:par4 + 1);
            b0 = 5;
            flag1 = true;
            if(l == this.cF) {
               j2 = par1World.h(par2, par3, par4 - 1);
            } else {
               j2 = par1World.h(par2, par3, par4 + 1);
            }

            if(j2 == 4) {
               b0 = 4;
            }

            if((aqz.t[j1] || aqz.t[l1]) && !aqz.t[k1] && !aqz.t[i2]) {
               b0 = 5;
            }

            if((aqz.t[k1] || aqz.t[i2]) && !aqz.t[j1] && !aqz.t[l1]) {
               b0 = 4;
            }
         }

         par1World.b(par2, par3, par4, b0, 3);
      }

   }

   public boolean c(abw par1World, int par2, int par3, int par4) {
      int l = 0;
      if(par1World.a(par2 - 1, par3, par4) == this.cF) {
         ++l;
      }

      if(par1World.a(par2 + 1, par3, par4) == this.cF) {
         ++l;
      }

      if(par1World.a(par2, par3, par4 - 1) == this.cF) {
         ++l;
      }

      if(par1World.a(par2, par3, par4 + 1) == this.cF) {
         ++l;
      }

      return l > 1?false:(this.isThereANeighborChest(par1World, par2 - 1, par3, par4)?false:(this.isThereANeighborChest(par1World, par2 + 1, par3, par4)?false:(this.isThereANeighborChest(par1World, par2, par3, par4 - 1)?false:!this.isThereANeighborChest(par1World, par2, par3, par4 + 1))));
   }

   private boolean isThereANeighborChest(abw par1World, int par2, int par3, int par4) {
      return par1World.a(par2, par3, par4) != this.cF?false:(par1World.a(par2 - 1, par3, par4) == this.cF?true:(par1World.a(par2 + 1, par3, par4) == this.cF?true:(par1World.a(par2, par3, par4 - 1) == this.cF?true:par1World.a(par2, par3, par4 + 1) == this.cF)));
   }

   public void a(abw par1World, int par2, int par3, int par4, int par5) {
      super.a(par1World, par2, par3, par4, par5);
      IceChestEntity IceChestEntity = (IceChestEntity)par1World.r(par2, par3, par4);
      if(IceChestEntity != null) {
         IceChestEntity.i();
      }

   }

   public void a(abw par1World, int par2, int par3, int par4, int par5, int par6) {
      IceChestEntity IceChestEntity = (IceChestEntity)par1World.r(par2, par3, par4);
      if(IceChestEntity != null) {
         for(int j1 = 0; j1 < IceChestEntity.j_(); ++j1) {
            ye itemstack = IceChestEntity.a(j1);
            if(itemstack != null) {
               float f = this.random.nextFloat() * 0.8F + 0.1F;
               float f1 = this.random.nextFloat() * 0.8F + 0.1F;

               ss entityitem;
               for(float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.b > 0; par1World.d(entityitem)) {
                  int k1 = this.random.nextInt(21) + 10;
                  if(k1 > itemstack.b) {
                     k1 = itemstack.b;
                  }

                  itemstack.b -= k1;
                  entityitem = new ss(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ye(itemstack.d, k1, itemstack.k()));
                  float f3 = 0.05F;
                  entityitem.x = (double)((float)this.random.nextGaussian() * f3);
                  entityitem.y = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                  entityitem.z = (double)((float)this.random.nextGaussian() * f3);
                  if(itemstack.p()) {
                     entityitem.d().d((by)itemstack.q().b());
                  }
               }
            }
         }

         par1World.m(par2, par3, par4, par5);
      }

      super.a(par1World, par2, par3, par4, par5, par6);
   }

   public boolean a(abw par1World, int par2, int par3, int par4, uf par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if(par1World.I) {
         return true;
      } else {
         mo iinventory = this.getInventory(par1World, par2, par3, par4);
         if(iinventory != null) {
            par5EntityPlayer.a(iinventory);
         }

         return true;
      }
   }

   public mo getInventory(abw par1World, int par2, int par3, int par4) {
      Object object = (IceChestEntity)par1World.r(par2, par3, par4);
      if(object == null) {
         return null;
      } else if(par1World.isBlockSolidOnSide(par2, par3 + 1, par4, ForgeDirection.DOWN)) {
         return null;
      } else if(isOcelotBlockingChest(par1World, par2, par3, par4)) {
         return null;
      } else if(par1World.a(par2 - 1, par3, par4) == this.cF && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4))) {
         return null;
      } else if(par1World.a(par2 + 1, par3, par4) == this.cF && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4))) {
         return null;
      } else if(par1World.a(par2, par3, par4 - 1) == this.cF && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1))) {
         return null;
      } else if(par1World.a(par2, par3, par4 + 1) == this.cF && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, ForgeDirection.DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1))) {
         return null;
      } else {
         if(par1World.a(par2 - 1, par3, par4) == this.cF) {
            object = new mn("container.chestDouble", (IceChestEntity)par1World.r(par2 - 1, par3, par4), (mo)object);
         }

         if(par1World.a(par2 + 1, par3, par4) == this.cF) {
            object = new mn("container.chestDouble", (mo)object, (IceChestEntity)par1World.r(par2 + 1, par3, par4));
         }

         if(par1World.a(par2, par3, par4 - 1) == this.cF) {
            object = new mn("container.chestDouble", (IceChestEntity)par1World.r(par2, par3, par4 - 1), (mo)object);
         }

         if(par1World.a(par2, par3, par4 + 1) == this.cF) {
            object = new mn("container.chestDouble", (mo)object, (IceChestEntity)par1World.r(par2, par3, par4 + 1));
         }

         return (mo)object;
      }
   }

   public asp b(abw par1World) {
      IceChestEntity IceChestEntity = new IceChestEntity();
      return IceChestEntity;
   }

   public boolean f() {
      return this.chestType == 1;
   }

   public int b(acf par1IBlockAccess, int par2, int par3, int par4, int par5) {
      if(!this.f()) {
         return 0;
      } else {
         int i1 = ((IceChestEntity)par1IBlockAccess.r(par2, par3, par4)).numUsingPlayers;
         return ls.a(i1, 0, 15);
      }
   }

   public int c(acf par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return par5 == 1?this.b(par1IBlockAccess, par2, par3, par4, par5):0;
   }

   public static boolean isOcelotBlockingChest(abw par0World, int par1, int par2, int par3) {
      Iterator iterator = par0World.a(rx.class, asx.a().a((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();

      while(iterator.hasNext()) {
         rx entityocelot1 = (rx)iterator.next();
         if(entityocelot1.bU()) {
            return true;
         }
      }

      return false;
   }

   public boolean q_() {
      return true;
   }

   public int b_(abw par1World, int par2, int par3, int par4, int par5) {
      return uy.b(this.getInventory(par1World, par2, par3, par4));
   }

   @SideOnly(Side.CLIENT)
   public void a(mt icon) {
      this.cW = icon.a("Hooks:iceChest");
   }
}
