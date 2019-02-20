package alex.hooks.spit;

import net.minecraft.tileentity.TileEntity;

public class SpitChickenEntity extends TileEntity {

   public float prevAngle;
   public float angle;
   public int numUsingPlayers;

   @Override
   public void updateEntity() {
      super.updateEntity();
      if(this.angle > 0.0F) {
         this.prevAngle = this.angle++;
         if(this.angle == 359.0F) {
            this.angle = 0.0F;
         }
      }
   }

}
