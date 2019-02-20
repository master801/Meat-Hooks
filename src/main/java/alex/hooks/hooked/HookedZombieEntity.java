package alex.hooks.hooked;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class HookedZombieEntity extends TileEntity {

   public float prevAngle;
   public float angle;
   public int numUsingPlayers;
   public int z = 0;
   public float yangle;
   public float bangle;
   public float cangle;
   public float dangle;
   public float eangle = 0.0F;


   @Override
   public void updateEntity() {
      super.updateEntity();
      EntityPlayer a = this.worldObj.getClosestPlayer((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, 7.0D);
      if((double)this.angle < 4.71238911151886D && (double)this.angle > 4.084070563316345D) {
         this.yangle = (float)Math.pow((double)this.angle - 4.39822971502571D, 2.0D);
         if(this.z == 1) {
            this.yangle = -this.yangle;
         }

         if(this.yangle < 0.0F) {
            this.yangle = (float)((double)this.yangle + 0.09424777960769379D);
         } else {
            this.yangle = (float)((double)this.yangle - 0.09424777960769379D);
         }
      }

      if(a != null) {
         if(this.getBlockMetadata() == 0) {
            if(a.posZ - (double)this.zCoord == 0.0D) {
               if(a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = 1.5707964F;
               } else {
                  this.dangle = -1.5707964F;
               }
            } else {
               this.dangle = (float)Math.atan((a.posX - (double)this.xCoord) / (a.posZ - (double)this.zCoord));
               if(a.posZ - (double)this.zCoord < 0.0D && a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = 1.5707964F;
               }

               if(a.posZ - (double)this.zCoord < 0.0D && a.posX - (double)this.xCoord < 0.0D) {
                  this.dangle = -1.5707964F;
               }
            }
         }

         if(this.getBlockMetadata() == 1) {
            if(a.posZ - (double)this.zCoord == 0.0D) {
               if(a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = -1.5707964F;
               } else {
                  this.dangle = 1.5707964F;
               }
            } else {
               this.dangle = (float)Math.atan((a.posX - (double)this.xCoord) / (a.posZ - (double)this.zCoord));
               if(a.posZ - (double)this.zCoord > 0.0D) {
                  this.dangle = (float)((double)this.dangle + 1.5707963267948966D);
               }

               if(a.posZ - (double)this.zCoord < 0.0D) {
                  this.dangle = (float)((double)this.dangle - 1.5707963267948966D);
               }

               if(a.posZ - (double)this.zCoord < 0.0D && a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = -1.5707964F;
               }

               if(a.posZ - (double)this.zCoord > 0.0D && a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = 1.5707964F;
               }
            }
         }

         if(this.getBlockMetadata() == 2) {
            if(a.posZ - (double)this.zCoord == 0.0D) {
               if(a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = -1.5707964F;
               } else {
                  this.dangle = 1.5707964F;
               }
            } else {
               this.dangle = (float)Math.atan((a.posX - (double)this.xCoord) / (a.posZ - (double)this.zCoord));
               if(a.posZ - (double)this.zCoord > 0.0D && a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = -1.5707964F;
               }

               if(a.posZ - (double)this.zCoord > 0.0D && a.posX - (double)this.xCoord < 0.0D) {
                  this.dangle = 1.5707964F;
               }
            }
         }

         if(this.getBlockMetadata() == 3) {
            if(a.posZ - (double)this.zCoord == 0.0D) {
               if(a.posX - (double)this.xCoord > 0.0D) {
                  this.dangle = 1.5707964F;
               } else {
                  this.dangle = -1.5707964F;
               }
            } else {
               this.dangle = (float)Math.atan((a.posX - (double)this.xCoord) / (a.posZ - (double)this.zCoord));
               if(a.posZ - (double)this.zCoord > 0.0D) {
                  this.dangle = (float)((double)this.dangle - 1.5707963267948966D);
               }

               if(a.posZ - (double)this.zCoord < 0.0D) {
                  this.dangle = (float)((double)this.dangle + 1.5707963267948966D);
               }

               if(a.posZ - (double)this.zCoord < 0.0D && a.posX - (double)this.xCoord < 0.0D) {
                  this.dangle = 1.5707964F;
               }

               if(a.posZ - (double)this.zCoord > 0.0D && a.posX - (double)this.xCoord < 0.0D) {
                  this.dangle = -1.5707964F;
               }
            }
         }

         if(this.z == 0) {
            this.angle += 0.03F;
            if((double)this.angle > 4.71238911151886D) {
               this.z = 1;
            }
         }

         if((double)this.angle < 4.084070563316345D) {
            this.z = 0;
         }

         if(this.cangle < 0.0F) {
            this.cangle = (float)((double)this.cangle + 0.06283185307179587D);
         }
      }

      if((a == null || this.z == 1) && this.angle > 3.1415927F) {
         this.angle -= 0.03F;
      }

      if(a == null) {
         this.dangle = 0.0F;
         if((double)this.cangle > -0.6283185307179586D) {
            this.cangle = (float)((double)this.cangle - 0.06283185307179587D);
         }
      }

      if((double)this.angle > 3.958406853675842D) {
         this.bangle = (float)((double)(this.angle + this.angle) - 4.084070449666731D);
      } else {
         this.bangle = this.angle;
      }

      if(this.eangle > this.dangle) {
         this.eangle = (float)((double)this.eangle - 0.06283185307179587D);
      }

      if(this.eangle < this.dangle) {
         this.eangle = (float)((double)this.eangle + 0.06283185307179587D);
      }
   }

}
