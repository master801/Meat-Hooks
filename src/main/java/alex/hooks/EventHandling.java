package alex.hooks;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventHandling {

    @ForgeSubscribe
    public void entityDropping(LivingDropsEvent event) {
        if (event.entityLiving instanceof EntityCow) {
            EntityCow droppingZombie = (EntityCow)event.entityLiving;
            droppingZombie.b(Hooks.deadCow.cv, 1);
            event.setCanceled(true);
        } else if (event.entityLiving instanceof EntityPig) {
            EntityPig droppingZombie1 = (EntityPig)event.entityLiving;
            droppingZombie1.b(Hooks.deadPig.cv, 1);
            event.setCanceled(true);
        } else if (event.entityLiving instanceof EntityChicken) {
            EntityChicken droppingZombie2 = (EntityChicken)event.entityLiving;
            droppingZombie2.b(Hooks.deadChicken.cv, 1);
            event.setCanceled(true);
        } else if (event.entityLiving instanceof EntityZombie) {
            EntityZombie droppingZombie3 = (EntityZombie)event.entityLiving;
            if (Hooks.zombieDrops > 0 && droppingZombie3.q.s.nextInt(Hooks.zombieDrops) == 0) {
                droppingZombie3.b(Hooks.unconZombie.cv, 1);
            }
        }
    }

}
