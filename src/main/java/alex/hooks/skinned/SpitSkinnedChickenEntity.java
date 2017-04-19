package alex.hooks.skinned;


public class SpitSkinnedChickenEntity extends asp {

   public float prevAngle;
   public float angle;
   public int numUsingPlayers;


   public void h() {
      super.h();
      if(this.angle > 0.0F) {
         this.prevAngle = this.angle++;
         if(this.angle == 359.0F) {
            this.angle = 0.0F;
         }
      }

   }
}
