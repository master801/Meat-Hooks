package alex.hooks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

import alex.hooks.burnt.BurntChickenBlock;
import alex.hooks.burnt.BurntChickenEntity;
import alex.hooks.burnt.BurntCowBlock;
import alex.hooks.burnt.BurntCowEntity;
import alex.hooks.burnt.BurntPigBlock;
import alex.hooks.burnt.BurntPigEntity;
import alex.hooks.cooked.CookedChickenBlock;
import alex.hooks.cooked.CookedChickenEntity;
import alex.hooks.cooked.CookedCowBlock;
import alex.hooks.cooked.CookedCowEntity;
import alex.hooks.cooked.CookedPigBlock;
import alex.hooks.cooked.CookedPigEntity;
import alex.hooks.hooked.HookedZombieBlock;
import alex.hooks.hooked.HookedZombieEntity;
import alex.hooks.hooked.TileEntityHookedChickenBlock;
import alex.hooks.hooked.TileEntityHookedChickenEntity;
import alex.hooks.hooked.TileEntityHookedCowBlock;
import alex.hooks.hooked.TileEntityHookedCowEntity;
import alex.hooks.hooked.TileEntityHookedPigBlock;
import alex.hooks.hooked.TileEntityHookedPigEntity;
import alex.hooks.rotten.TileEntityRottenChickenBlock;
import alex.hooks.rotten.TileEntityRottenChickenEntity;
import alex.hooks.rotten.TileEntityRottenCowBlock;
import alex.hooks.rotten.TileEntityRottenCowEntity;
import alex.hooks.rotten.TileEntityRottenPigBlock;
import alex.hooks.rotten.TileEntityRottenPigEntity;
import alex.hooks.skinned.SpitSkinnedChickenBlock;
import alex.hooks.skinned.SpitSkinnedChickenEntity;
import alex.hooks.skinned.SpitSkinnedCowBlock;
import alex.hooks.skinned.SpitSkinnedCowEntity;
import alex.hooks.skinned.SpitSkinnedPigBlock;
import alex.hooks.skinned.SpitSkinnedPigEntity;
import alex.hooks.skinned.TileEntitySkinnedChickenBlock;
import alex.hooks.skinned.TileEntitySkinnedChickenEntity;
import alex.hooks.skinned.TileEntitySkinnedCowBlock;
import alex.hooks.skinned.TileEntitySkinnedCowEntity;
import alex.hooks.skinned.TileEntitySkinnedPigBlock;
import alex.hooks.skinned.TileEntitySkinnedPigEntity;
import alex.hooks.spit.SpitChickenBlock;
import alex.hooks.spit.SpitChickenEntity;
import alex.hooks.spit.SpitCowBlock;
import alex.hooks.spit.SpitCowEntity;
import alex.hooks.spit.SpitPigBlock;
import alex.hooks.spit.SpitPigEntity;
import alex.hooks.spit.SpitPropBlock;
import alex.hooks.spit.SpitPropEntity;
import alex.hooks.spit.SpitStickBlock;
import alex.hooks.spit.SpitStickEntity;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
   modid = "Hooks",
   name = "Meat Hooks",
   version = "0.5.2"
)
@NetworkMod(
   clientSideRequired = true,
   serverSideRequired = false
)
public class Hooks {

   public static Block hook;
   public static Block hookedCow;
   public static Block hookedPig;
   public static Block hookedChicken;
   public static Block Y2Inv;
   public static Block Y3MInv;
   public static Block Y3BInv;
   public static Block rottenCow;
   public static Block rottenChicken;
   public static Block rottenPig;
   public static Block iceChest;
   public static Block skinnedCow;
   public static Block skinnedChicken;
   public static Block skinnedPig;
   public static Block spitCow;
   public static Block spitProp;
   public static Block spitStick;
   public static Block x2Inv;
   public static Block spitPig;
   public static Block spitChicken;
   public static Block cookedCow;
   public static Block cookedPig;
   public static Block cookedChicken;
   public static Block burntCow;
   public static Block burntPig;
   public static Block burntChicken;
   public static Block spitSkinnedCow;
   public static Block spitSkinnedChicken;
   public static Block spitSkinnedPig;
   public static Block hookedZombie;
   public static Item deadCow;
   public static Item deadPig;
   public static Item deadChicken;
   public static Item cleaver;
   public static Item pigMeat;
   public static Item chickenMeat;
   public static Item cowMeat;
   public static Item pigCooked;
   public static Item chickennCooked;
   public static Item cowCooked;
   public static Item filet;
   public static Item pigBurnt;
   public static Item chickenBurnt;
   public static Item cowBurnt;
   public static Item iskinnedCow;
   public static Item iskinnedPig;
   public static Item iskinnedChicken;
   public static Item unconZombie;
   public static boolean cobbleCleaver;
   public static int zombieDrops;
   public static int rotChance;

   @Instance("Hooks")
   public static Hooks instance;

   @SidedProxy(
      clientSide = HooksInfo.CLIENTPROXY,
      serverSide = HooksInfo.COMMONPROXY
   )
   public static CommonProxy proxy;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
      Configuration config = new Configuration(event.getSuggestedConfigurationFile());
      config.load();
      HooksInfo.HOOKBLOCKID = config.getBlock("Hook Block", 3111).getInt();
      HooksInfo.HOOKEDCHICKENBLOCKID = config.getBlock("Hooked Chicken Block", 3112).getInt();
      HooksInfo.HOOKEDCOWBLOCKID = config.getBlock("Hooked Cow Block", 3113).getInt();
      HooksInfo.HOOKEDPIGBLOCKID = config.getBlock("Hooked Pig Block", 3114).getInt();
      HooksInfo.Y2INVBLOCKID = config.getBlock("Y2 Inv Block", 3115).getInt();
      HooksInfo.Y3MINVBLOCKID = config.getBlock("Y3M Inv Block", 3116).getInt();
      HooksInfo.Y3BINVBLOCKID = config.getBlock("Y3B Inv Block", 3117).getInt();
      HooksInfo.CLEAVERITEMID = config.getItem("Cleaver", 5111).getInt();
      HooksInfo.DEADCHICKENITEMID = config.getItem("Dead Chicken", 5112).getInt();
      HooksInfo.DEADCOWITEMID = config.getItem("Dead Cow", 5113).getInt();
      HooksInfo.DEADPIGITEMID = config.getItem("Dead Pig", 5114).getInt();
      HooksInfo.ROTTENCOWBLOCKID = config.getBlock("Rotten Cow Block", 3118).getInt();
      HooksInfo.ROTTENPIGBLOCKID = config.getBlock("Rotten Pig Block", 3119).getInt();
      HooksInfo.ROTTENCHICKENBLOCKID = config.getBlock("Rotten Chicken Block", 3120).getInt();
      HooksInfo.MEATCHICKENITEMID = config.getItem("Chicken Meat", 5115).getInt();
      HooksInfo.MEATCOWITEMID = config.getItem("Cow Meat", 5116).getInt();
      HooksInfo.MEATPIGITEMID = config.getItem("Pig Meat", 5117).getInt();
      HooksInfo.CHICKENCOOKEDITEMID = config.getItem("Chicken Cooked", 5118).getInt();
      HooksInfo.COWCOOKEDITEMID = config.getItem("Cow Cooked", 5119).getInt();
      HooksInfo.PIGCOOKEDITEMID = config.getItem("Pig Cooked", 5120).getInt();
      HooksInfo.ICECHESTBLOCKID = config.getBlock("Ice Chest", 3121).getInt();
      HooksInfo.SKINNEDCHICKENBLOCKID = config.getBlock("Skinned Chicken Block", 3122).getInt();
      HooksInfo.SKINNEDCOWBLOCKID = config.getBlock("Skinned Cow Block", 3123).getInt();
      HooksInfo.SKINNEDPIGBLOCKID = config.getBlock("Skinned Pig Block", 3124).getInt();
      HooksInfo.FILETITEMID = config.getItem("Filet", 5121).getInt();
      HooksInfo.SPITPROPBLOCKID = config.getBlock("Spit Prop Block", 3125).getInt();
      HooksInfo.SPITCOWBLOCKID = config.getBlock("Cow on spit Block", 3126).getInt();
      HooksInfo.SPITSTICKBLOCKID = config.getBlock("Spit Stick Block", 3127).getInt();
      HooksInfo.X2INVBLOCKID = config.getBlock("X2 Inv Block", 3128).getInt();
      HooksInfo.SPITCHICKENBLOCKID = config.getBlock("Spit Chicken Block", 3140).getInt();
      HooksInfo.SPITPIGBLOCKID = config.getBlock("Spit Pig Block", 3129).getInt();
      HooksInfo.COOKEDCOWBLOCKID = config.getBlock("Cooked Cow Block", 3130).getInt();
      HooksInfo.COOKEDCHICKENBLOCKID = config.getBlock("Cooked Chicken Block", 3131).getInt();
      HooksInfo.COOKEDPIGBLOCKID = config.getBlock("Cooked Pig Block", 3132).getInt();
      HooksInfo.BURNTCOWBLOCKID = config.getBlock("Burnt Cow Block", 3133).getInt();
      HooksInfo.BURNTCHICKENBLOCKID = config.getBlock("Burnt Chicken Block", 3134).getInt();
      HooksInfo.BURNTPIGBLOCKID = config.getBlock("Burnt Pig Block", 3135).getInt();
      HooksInfo.CHICKENBURNTITEMID = config.getItem("Chicken Burnt", 5122).getInt();
      HooksInfo.COWBURNTITEMID = config.getItem("Cow Burnt", 5123).getInt();
      HooksInfo.PIGBURNTITEMID = config.getItem("Pig Burnt", 5124).getInt();
      HooksInfo.SPITSKINNEDCHICKENBLOCKID = config.getBlock("Spit Skinned Chicken Block", 3136).getInt();
      HooksInfo.SPITSKINNEDPIGBLOCKID = config.getBlock("Spit Skinned Pig Block", 3137).getInt();
      HooksInfo.SPITSKINNEDCOWBLOCKID = config.getBlock("Spit Skinned Cow Block", 3138).getInt();
      HooksInfo.ISKINNEDCHICKENITEMID = config.getItem("Skinned Chicken", 5125).getInt();
      HooksInfo.ISKINNEDCOWITEMID = config.getItem("Skinned Cow", 5126).getInt();
      HooksInfo.ISKINNEDPIGITEMID = config.getItem("Skinned Pig", 5127).getInt();
      HooksInfo.HOOKEDZOMBIEBLOCKID = config.getBlock("Hooked Zombie Block", 3139).getInt();
      HooksInfo.UNCONZOMBIEITEMID = config.getItem("Unconscious Zombie Item", 5128).getInt();
      cobbleCleaver = config.get("general", "Enable coblestone for cleaver recipe", false).getBoolean(false);
      zombieDrops = config.get("general", "Zombies chance of dropping body (must be integer,1=100% 0=0%, 2=50%, 3=33% and so on)", 1).getInt();
      rotChance = config.get("general", "Meat(raw, cooked, burned) chance of rotting (must be integer,1=100% 0=0%, 2=50%, 3=33% and so on, calculated 20 times per second)", 100000).getInt();
      config.save();
   }

   @EventHandler
   public void load(FMLInitializationEvent event) {
      hook = new TileEntityHookBlock(HooksInfo.HOOKBLOCKID);
      hookedCow = new TileEntityHookedCowBlock(HooksInfo.HOOKEDCOWBLOCKID);
      hookedPig = new TileEntityHookedPigBlock(HooksInfo.HOOKEDPIGBLOCKID);
      hookedChicken = new TileEntityHookedChickenBlock(HooksInfo.HOOKEDCHICKENBLOCKID);
      Y2Inv = new TileEntityY2InvBlock(HooksInfo.Y2INVBLOCKID);
      Y3MInv = new TileEntityY3MInvBlock(HooksInfo.Y3MINVBLOCKID);
      Y3BInv = new TileEntityY3BInvBlock(HooksInfo.Y3BINVBLOCKID);
      rottenCow = new TileEntityRottenCowBlock(HooksInfo.ROTTENCOWBLOCKID);
      rottenChicken = new TileEntityRottenChickenBlock(HooksInfo.ROTTENCHICKENBLOCKID);
      rottenPig = new TileEntityRottenPigBlock(HooksInfo.ROTTENPIGBLOCKID);
      iceChest = new IceChest(HooksInfo.ICECHESTBLOCKID, 0);
      skinnedCow = new TileEntitySkinnedCowBlock(HooksInfo.SKINNEDCOWBLOCKID);
      skinnedChicken = new TileEntitySkinnedChickenBlock(HooksInfo.SKINNEDCHICKENBLOCKID);
      skinnedPig = new TileEntitySkinnedPigBlock(HooksInfo.SKINNEDPIGBLOCKID);
      spitProp = new SpitPropBlock(HooksInfo.SPITPROPBLOCKID);
      spitCow = new SpitCowBlock(HooksInfo.SPITCOWBLOCKID);
      spitStick = new SpitStickBlock(HooksInfo.SPITSTICKBLOCKID);
      x2Inv = new X2InvBlock(HooksInfo.X2INVBLOCKID);
      spitChicken = new SpitChickenBlock(HooksInfo.SPITCHICKENBLOCKID);
      spitPig = new SpitPigBlock(HooksInfo.SPITPIGBLOCKID);
      cookedCow = new CookedCowBlock(HooksInfo.COOKEDCOWBLOCKID);
      cookedChicken = new CookedChickenBlock(HooksInfo.COOKEDCHICKENBLOCKID);
      cookedPig = new CookedPigBlock(HooksInfo.COOKEDPIGBLOCKID);
      burntCow = new BurntCowBlock(HooksInfo.BURNTCOWBLOCKID);
      burntChicken = new BurntChickenBlock(HooksInfo.BURNTCHICKENBLOCKID);
      burntPig = new BurntPigBlock(HooksInfo.BURNTPIGBLOCKID);
      spitSkinnedCow = new SpitSkinnedCowBlock(HooksInfo.SPITSKINNEDCOWBLOCKID);
      spitSkinnedChicken = new SpitSkinnedChickenBlock(HooksInfo.SPITSKINNEDCHICKENBLOCKID);
      spitSkinnedPig = new SpitSkinnedPigBlock(HooksInfo.SPITSKINNEDPIGBLOCKID);
      hookedZombie = new HookedZombieBlock(HooksInfo.HOOKEDZOMBIEBLOCKID);
      deadCow = new DeadCow(HooksInfo.DEADCOWITEMID);
      deadPig = new DeadPig(HooksInfo.DEADPIGITEMID);
      deadChicken = new DeadChicken(HooksInfo.DEADCHICKENITEMID);
      cleaver = new Cleaver(HooksInfo.CLEAVERITEMID);
      filet = new Filet(HooksInfo.FILETITEMID);
      cowMeat = new MeatItem(HooksInfo.MEATCOWITEMID, 3, 0.3F, true).b("cowMeat").d("Hooks".toLowerCase() + ":cowMeat");
      chickenMeat = new MeatItem(HooksInfo.MEATCHICKENITEMID, 2, 0.3F, true).b("chickenMeat").d("Hooks".toLowerCase() + ":chickenMeat");
      pigMeat = new MeatItem(HooksInfo.MEATPIGITEMID, 3, 0.3F, true).b("pigMeat").d("Hooks".toLowerCase() + ":pigMeat");
      pigCooked = new MeatItem(HooksInfo.PIGCOOKEDITEMID, 8, 0.8F, true).b("pigCooked").d("Hooks".toLowerCase() + ":pigCooked");
      cowCooked = new MeatItem(HooksInfo.COWCOOKEDITEMID, 8, 0.8F, true).b("cowCooked").d("Hooks".toLowerCase() + ":cowCooked");
      chickennCooked = new MeatItem(HooksInfo.CHICKENCOOKEDITEMID, 6, 0.6F, true).b("chickenCooked").d("Hooks".toLowerCase() + ":chickennCooked");
      pigBurnt = new MeatItem(HooksInfo.PIGBURNTITEMID, 1, 0.1F, true).b("pigBurnt").d("Hooks".toLowerCase() + ":pigBurnt");
      cowBurnt = new MeatItem(HooksInfo.COWBURNTITEMID, 1, 0.1F, true).b("cowBurnt").d("Hooks".toLowerCase() + ":cowBurnt");
      chickenBurnt = new MeatItem(HooksInfo.CHICKENBURNTITEMID, 1, 0.1F, true).b("chickenBurnt").d("Hooks".toLowerCase() + ":chickenBurnt");
      iskinnedCow = new SkinnedCow(HooksInfo.ISKINNEDCOWITEMID);
      iskinnedPig = new SkinnedPig(HooksInfo.ISKINNEDPIGITEMID);
      iskinnedChicken = new SkinnedChicken(HooksInfo.ISKINNEDCHICKENITEMID);
      unconZombie = new UnconsciousZombie(HooksInfo.UNCONZOMBIEITEMID);
      proxy.registerRenderers();
      GameRegistry.registerTileEntity(TileEntityHookedCowEntity.class, "tileEntityHookedCow");
      GameRegistry.registerBlock(hookedCow, "tileEntityHookedCow");
      GameRegistry.registerTileEntity(TileEntityHookedPigEntity.class, "tileEntityHookedPig");
      GameRegistry.registerBlock(hookedPig, "tileEntityHookedPig");
      GameRegistry.registerTileEntity(TileEntityHookedChickenEntity.class, "tileEntityHookedChicken");
      GameRegistry.registerBlock(hookedChicken, "tileEntityHookedChicken");
      GameRegistry.registerTileEntity(TileEntityHookEntity.class, "tileEntityHook");
      GameRegistry.registerBlock(hook, "tileEntityHook");
      GameRegistry.registerTileEntity(TileEntityY2InvEntity.class, "tileEntityY2Inv");
      GameRegistry.registerBlock(Y2Inv, "tileEntityY2Inv");
      GameRegistry.registerTileEntity(TileEntityY3MInvEntity.class, "tileEntityY3MInv");
      GameRegistry.registerBlock(Y3MInv, "tileEntityY3MInv");
      GameRegistry.registerTileEntity(TileEntityY3BInvEntity.class, "tileEntityY3BInv");
      GameRegistry.registerBlock(Y3BInv, "tileEntityY3BInv");
      GameRegistry.registerTileEntity(TileEntityRottenCowEntity.class, "tileEntityRottenCow");
      GameRegistry.registerBlock(rottenCow, "tileEntityRottenCow");
      GameRegistry.registerTileEntity(TileEntityRottenChickenEntity.class, "tileEntityRottenChicken");
      GameRegistry.registerBlock(rottenChicken, "tileEntityRottenChicken");
      GameRegistry.registerTileEntity(TileEntityRottenPigEntity.class, "tileEntityRottenPig");
      GameRegistry.registerBlock(rottenPig, "tileEntityRottenPig");
      GameRegistry.registerTileEntity(IceChestEntity.class, "iceChest");
      GameRegistry.registerBlock(iceChest, "iceChest");
      GameRegistry.registerTileEntity(TileEntitySkinnedCowEntity.class, "tileEntitySkinnedCow");
      GameRegistry.registerBlock(skinnedCow, "tileEntitySkinnedCow");
      GameRegistry.registerTileEntity(TileEntitySkinnedChickenEntity.class, "tileEntitySkinnedChicken");
      GameRegistry.registerBlock(skinnedChicken, "tileEntitySkinnedChicken");
      GameRegistry.registerTileEntity(TileEntitySkinnedPigEntity.class, "tileEntitySkinnedPig");
      GameRegistry.registerBlock(skinnedPig, "tileEntitySkinnedPig");
      GameRegistry.registerTileEntity(SpitPropEntity.class, "spitPropEntity");
      GameRegistry.registerBlock(spitProp, "SpitPropEntity");
      GameRegistry.registerTileEntity(SpitCowEntity.class, "spitCowEntity");
      GameRegistry.registerBlock(spitCow, "spitCowEntity");
      GameRegistry.registerTileEntity(SpitStickEntity.class, "spitStickEntity");
      GameRegistry.registerBlock(spitStick, "spitStickEntity");
      GameRegistry.registerTileEntity(X2InvEntity.class, "x2InvEntity");
      GameRegistry.registerBlock(x2Inv, "x2InvEntity");
      GameRegistry.registerTileEntity(SpitChickenEntity.class, "spitChickenEntity");
      GameRegistry.registerBlock(spitChicken, "spitChickenEntity");
      GameRegistry.registerTileEntity(SpitPigEntity.class, "spitPigEntity");
      GameRegistry.registerBlock(spitPig, "spitPigEntity");
      GameRegistry.registerTileEntity(CookedCowEntity.class, "cookedCowEntity");
      GameRegistry.registerBlock(cookedCow, "cookedCowEntity");
      GameRegistry.registerTileEntity(CookedChickenEntity.class, "cookedChickenEntity");
      GameRegistry.registerBlock(cookedChicken, "cookedChickenEntity");
      GameRegistry.registerTileEntity(CookedPigEntity.class, "cookedPigEntity");
      GameRegistry.registerBlock(cookedPig, "cookedPigEntity");
      GameRegistry.registerTileEntity(BurntCowEntity.class, "burntCowEntity");
      GameRegistry.registerBlock(burntCow, "burntCowEntity");
      GameRegistry.registerTileEntity(BurntChickenEntity.class, "burntChickenEntity");
      GameRegistry.registerBlock(burntChicken, "burntChickenEntity");
      GameRegistry.registerTileEntity(BurntPigEntity.class, "burntPigEntity");
      GameRegistry.registerBlock(burntPig, "burntPigEntity");
      GameRegistry.registerTileEntity(SpitSkinnedCowEntity.class, "spitSkinnedCow");
      GameRegistry.registerBlock(spitSkinnedCow, "spitSkinnedCow");
      GameRegistry.registerTileEntity(SpitSkinnedChickenEntity.class, "spitSkinnedChicken");
      GameRegistry.registerBlock(spitSkinnedChicken, "spitSkinnedChicken");
      GameRegistry.registerTileEntity(SpitSkinnedPigEntity.class, "spitSkinnedPig");
      GameRegistry.registerBlock(spitSkinnedPig, "spitSkinnedPig");
      GameRegistry.registerTileEntity(HookedZombieEntity.class, "hookedZombie");
      GameRegistry.registerBlock(hookedZombie, "hookedZombie");
      LanguageRegistry.addName(hookedCow, "Dead Cow");
      LanguageRegistry.addName(hookedPig, "Dead Pig");
      LanguageRegistry.addName(hookedChicken, "Dead Chicken");
      LanguageRegistry.addName(hook, "Meat Hook");
      LanguageRegistry.addName(rottenCow, "Rotten Cow");
      LanguageRegistry.addName(iceChest, "Ice Chest");
      LanguageRegistry.addName(spitProp, "Spit Prop");
      LanguageRegistry.addName(spitStick, "Spit");
      GameRegistry.registerItem(deadCow, "deadCow");
      LanguageRegistry.addName(deadCow, "Dead Cow");
      GameRegistry.registerItem(deadChicken, "deadChicken");
      LanguageRegistry.addName(deadChicken, "Dead Chicken");
      GameRegistry.registerItem(deadPig, "deadPig");
      LanguageRegistry.addName(deadPig, "Dead Pig");
      GameRegistry.registerItem(cleaver, "cLeaver");
      LanguageRegistry.addName(cleaver, "Meat Cleaver");
      GameRegistry.registerItem(chickenMeat, "chickenMeat");
      LanguageRegistry.addName(chickenMeat, "Raw Chicken");
      GameRegistry.registerItem(pigMeat, "pigMeat");
      LanguageRegistry.addName(pigMeat, "Raw Pork");
      GameRegistry.registerItem(cowMeat, "cowMeat");
      LanguageRegistry.addName(cowMeat, "Raw Beef");
      GameRegistry.registerItem(chickennCooked, "chickennCooked");
      LanguageRegistry.addName(chickennCooked, "Cooked Chicken");
      GameRegistry.registerItem(pigCooked, "pigCooked");
      LanguageRegistry.addName(pigCooked, "Cooked Pork");
      GameRegistry.registerItem(cowCooked, "cowCooked");
      LanguageRegistry.addName(cowCooked, "Cooked Beef");
      GameRegistry.registerItem(filet, "filet");
      LanguageRegistry.addName(filet, "Filet Knife");
      GameRegistry.registerItem(chickenBurnt, "chickenBurnt");
      LanguageRegistry.addName(chickenBurnt, "Burnt Chicken");
      GameRegistry.registerItem(pigBurnt, "pigBurnt");
      LanguageRegistry.addName(pigBurnt, "Burnt Pork");
      GameRegistry.registerItem(cowBurnt, "cowBurnt");
      LanguageRegistry.addName(cowBurnt, "Burnt Beef");
      GameRegistry.registerItem(iskinnedCow, "iskinnedCow");
      LanguageRegistry.addName(iskinnedCow, "Skinned Cow");
      GameRegistry.registerItem(iskinnedChicken, "iskinnedChicken");
      LanguageRegistry.addName(iskinnedChicken, "Skinned Chicken");
      GameRegistry.registerItem(iskinnedPig, "iskinnedPig");
      LanguageRegistry.addName(iskinnedPig, "Skinned Pig");
      GameRegistry.registerItem(unconZombie, "unconZombie");
      LanguageRegistry.addName(unconZombie, "Unconscious Zombie");
      GameRegistry.addRecipe(new ItemStack(hook), " x", " x", "xx", 'x', Item.ingotIron);
      GameRegistry.addRecipe(new ItemStack(cleaver), "  x", " xx", "yx ", 'x', Item.ingotIron, 'y', Item.stick);
      GameRegistry.addRecipe(new ItemStack(filet), "  x", " x ", "y  ", 'x', Item.ingotIron, 'y', Item.stick);
      GameRegistry.addRecipe(new ItemStack(iceChest), "xyx", "yzy", "xyx", 'x', Item.ingotIron, 'y', Block.ice, 'z', Block.chest);
      GameRegistry.addSmelting(pigMeat.itemID, new ItemStack(pigCooked), 0.0F);
      GameRegistry.addSmelting(cowMeat.itemID, new ItemStack(cowCooked), 0.0F);
      GameRegistry.addSmelting(chickenMeat.itemID, new ItemStack(chickennCooked), 0.0F);
      GameRegistry.addRecipe(new ItemStack(spitProp), "x x", " x ", " x ", 'x', Item.stick);
      GameRegistry.addRecipe(new ItemStack(spitStick), "  x", " x ", "x  ", 'x', Item.stick);
      if(cobbleCleaver) {
         GameRegistry.addRecipe(new ItemStack(cleaver), "  x", " xx", "yx ", 'x', Block.cobblestone, 'y', Item.stick);
      }

      MinecraftForge.EVENT_BUS.register(new EventHandling());
   }

}
