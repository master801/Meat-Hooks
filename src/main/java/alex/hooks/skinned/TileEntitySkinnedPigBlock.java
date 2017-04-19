package alex.hooks.skinned;

import alex.hooks.Hooks;
import alex.hooks.skinned.TileEntitySkinnedPigEntity;
import java.util.ArrayList;
import java.util.Random;

public class TileEntitySkinnedPigBlock extends amw {

   public TileEntitySkinnedPigBlock(int id) {
      super(id, akc.f);
      this.a((ww)null);
      this.a(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.c("skinnedPig");
      this.c(500.0F);
      this.b(true);
   }

   public void a(abw par1World, int par2, int par3, int par4, Random par5Random) {
      if(par1World.s.nextInt(10) == 0) {
         int meta = par1World.h(par2, par3, par4);
         if(par1World.a(par2, par3 + 1, par4) != 79 && par1World.a(par2, par3 - 3, par4) != 79 && par1World.a(par2 + 1, par3, par4) != 79 && par1World.a(par2 - 1, par3, par4) != 79 && par1World.a(par2, par3, par4 + 1) != 79 && par1World.a(par2, par3, par4 - 1) != 79 && par1World.a(par2 + 1, par3 - 1, par4) != 79 && par1World.a(par2 - 1, par3 - 1, par4) != 79 && par1World.a(par2, par3 - 1, par4 + 1) != 79 && par1World.a(par2, par3 - 1, par4 - 1) != 79 && par1World.a(par2 + 1, par3 - 2, par4) != 79 && par1World.a(par2 - 1, par3 - 2, par4) != 79 && par1World.a(par2, par3 - 2, par4 + 1) != 79 && par1World.a(par2, par3 - 2, par4 - 1) != 79 && par1World.a(par2, par3 - 2, par4) != 10 && par1World.a(par2, par3 - 3, par4) != 10 && par1World.a(par2, par3 - 4, par4) != 10 && par1World.a(par2, par3 - 5, par4) != 10 && par1World.a(par2, par3 - 6, par4) != 10 && par1World.a(par2, par3 - 7, par4) != 10 && par1World.a(par2, par3 - 2, par4) != 11 && par1World.a(par2, par3 - 3, par4) != 11 && par1World.a(par2, par3 - 4, par4) != 11 && par1World.a(par2, par3 - 5, par4) != 11 && par1World.a(par2, par3 - 6, par4) != 11 && par1World.a(par2, par3 - 7, par4) != 11 && par5Random.nextInt(10) == 0) {
            par1World.f(par2, par3, par4, Hooks.rottenPig.cF, meta, 2);
         }
      }

   }

   public void a(abw world, int x, int y, int z, uf par5EntityPlayer) {
      int i = world.h(x, y, z);
      world.a(x, y, z, false);
      world.a(x, y - 1, z, false);
      world.f(x, y, z, Hooks.hook.cF, i, 2);
      par5EntityPlayer.bn.a(new ye(Hooks.iskinnedPig));
   }

   public int quantityDropped(int metadata, int fortune, Random rand) {
      return 3 + rand.nextInt(3) + fortune;
   }

   public ArrayList getBlockDropped(abw world, int x, int y, int z, int metadata, int fortune) {
      ArrayList ret = new ArrayList();
      int amount = this.quantityDropped(metadata, fortune, world.s);
      boolean luckDraw = false;
      boolean idDropped = false;
      boolean metaDropped = false;

      for(int i = 0; i < amount; ++i) {
         int var13 = world.s.nextInt(3);
         int var14 = 0;
         byte var15 = 0;
         if(var13 == 0) {
            var14 = Hooks.pigMeat.cv;
         }

         if(var13 == 1) {
            var14 = Hooks.pigMeat.cv;
         }

         if(var13 == 2) {
            var14 = yc.aZ.cv;
         }

         ret.add(new ye(var14, 1, var15));
      }

      return ret;
   }

   public void a(abw par1World, int par2, int par3, int par4, of par5EntityLivingBase, ye par6ItemStack) {
      int l = ls.c((double)(par5EntityLivingBase.A * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.b(par2, par3, par4, l, 2);
   }

   public asp b(abw world) {
      return new TileEntitySkinnedPigEntity();
   }

   public int d() {
      return -1;
   }

   public boolean c() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(mt icon) {
      this.cW = icon.a("Hooks:hookIcon");
   }
}
