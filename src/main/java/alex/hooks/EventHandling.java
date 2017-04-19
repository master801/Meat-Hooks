package alex.hooks;

import alex.hooks.Hooks;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventHandling {

   @ForgeSubscribe
   public void entityDropping(LivingDropsEvent event) {
      if(event.entityLiving instanceof rr) {
         rr droppingZombie = (rr)event.entityLiving;
         droppingZombie.b(Hooks.deadCow.cv, 1);
         event.setCanceled(true);
      } else if(event.entityLiving instanceof ry) {
         ry droppingZombie1 = (ry)event.entityLiving;
         droppingZombie1.b(Hooks.deadPig.cv, 1);
         event.setCanceled(true);
      } else if(event.entityLiving instanceof rq) {
         rq droppingZombie2 = (rq)event.entityLiving;
         droppingZombie2.b(Hooks.deadChicken.cv, 1);
         event.setCanceled(true);
      } else if(event.entityLiving instanceof tw) {
         tw droppingZombie3 = (tw)event.entityLiving;
         if(Hooks.zombieDrops > 0 && droppingZombie3.q.s.nextInt(Hooks.zombieDrops) == 0) {
            droppingZombie3.b(Hooks.unconZombie.cv, 1);
         }
      }

   }
}
