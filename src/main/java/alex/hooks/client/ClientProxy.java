package alex.hooks.client;

import alex.hooks.CommonProxy;
import alex.hooks.IceChestEntity;
import alex.hooks.IceChestRenderer;
import alex.hooks.TileEntityHookEntity;
import alex.hooks.TileEntityHookRenderer;
import alex.hooks.burnt.BurntChickenEntity;
import alex.hooks.burnt.BurntChickenRenderer;
import alex.hooks.burnt.BurntCowEntity;
import alex.hooks.burnt.BurntCowRenderer;
import alex.hooks.burnt.BurntPigEntity;
import alex.hooks.burnt.BurntPigRenderer;
import alex.hooks.cooked.CookedChickenEntity;
import alex.hooks.cooked.CookedChickenRenderer;
import alex.hooks.cooked.CookedCowEntity;
import alex.hooks.cooked.CookedCowRenderer;
import alex.hooks.cooked.CookedPigEntity;
import alex.hooks.cooked.CookedPigRenderer;
import alex.hooks.hooked.HookedZombieEntity;
import alex.hooks.hooked.HookedZombieRenderer;
import alex.hooks.hooked.TileEntityHookedChickenEntity;
import alex.hooks.hooked.TileEntityHookedChickenRenderer;
import alex.hooks.hooked.TileEntityHookedCowEntity;
import alex.hooks.hooked.TileEntityHookedCowRenderer;
import alex.hooks.hooked.TileEntityHookedPigEntity;
import alex.hooks.hooked.TileEntityHookedPigRenderer;
import alex.hooks.rotten.TileEntityRottenChickenEntity;
import alex.hooks.rotten.TileEntityRottenChickenRenderer;
import alex.hooks.rotten.TileEntityRottenCowEntity;
import alex.hooks.rotten.TileEntityRottenCowRenderer;
import alex.hooks.rotten.TileEntityRottenPigEntity;
import alex.hooks.rotten.TileEntityRottenPigRenderer;
import alex.hooks.skinned.SpitSkinnedChickenEntity;
import alex.hooks.skinned.SpitSkinnedChickenRenderer;
import alex.hooks.skinned.SpitSkinnedCowEntity;
import alex.hooks.skinned.SpitSkinnedCowRenderer;
import alex.hooks.skinned.SpitSkinnedPigEntity;
import alex.hooks.skinned.SpitSkinnedPigRenderer;
import alex.hooks.skinned.TileEntitySkinnedChickenEntity;
import alex.hooks.skinned.TileEntitySkinnedChickenRenderer;
import alex.hooks.skinned.TileEntitySkinnedCowEntity;
import alex.hooks.skinned.TileEntitySkinnedCowRenderer;
import alex.hooks.skinned.TileEntitySkinnedPigEntity;
import alex.hooks.skinned.TileEntitySkinnedPigRenderer;
import alex.hooks.spit.SpitChickenEntity;
import alex.hooks.spit.SpitChickenRenderer;
import alex.hooks.spit.SpitCowEntity;
import alex.hooks.spit.SpitCowRenderer;
import alex.hooks.spit.SpitPigEntity;
import alex.hooks.spit.SpitPigRenderer;
import alex.hooks.spit.SpitPropEntity;
import alex.hooks.spit.SpitPropRenderer;
import alex.hooks.spit.SpitStickEntity;
import alex.hooks.spit.SpitStickRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

   public void registerRenderers() {
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHookEntity.class, new TileEntityHookRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHookedCowEntity.class, new TileEntityHookedCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHookedPigEntity.class, new TileEntityHookedPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHookedChickenEntity.class, new TileEntityHookedChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRottenCowEntity.class, new TileEntityRottenCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRottenChickenEntity.class, new TileEntityRottenChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRottenPigEntity.class, new TileEntityRottenPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkinnedCowEntity.class, new TileEntitySkinnedCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkinnedChickenEntity.class, new TileEntitySkinnedChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkinnedPigEntity.class, new TileEntitySkinnedPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitPropEntity.class, new SpitPropRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitCowEntity.class, new SpitCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitStickEntity.class, new SpitStickRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitChickenEntity.class, new SpitChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitPigEntity.class, new SpitPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(CookedCowEntity.class, new CookedCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(CookedChickenEntity.class, new CookedChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(CookedPigEntity.class, new CookedPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(BurntCowEntity.class, new BurntCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(BurntChickenEntity.class, new BurntChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(BurntPigEntity.class, new BurntPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitSkinnedCowEntity.class, new SpitSkinnedCowRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitSkinnedChickenEntity.class, new SpitSkinnedChickenRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(SpitSkinnedPigEntity.class, new SpitSkinnedPigRenderer());
      ClientRegistry.bindTileEntitySpecialRenderer(HookedZombieEntity.class, new HookedZombieRenderer());

      ClientRegistry.bindTileEntitySpecialRenderer(IceChestEntity.class, new IceChestRenderer());
   }
}
