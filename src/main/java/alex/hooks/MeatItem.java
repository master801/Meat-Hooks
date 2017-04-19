package alex.hooks;

import alex.hooks.Hooks;

public class MeatItem extends xx {

   public MeatItem(int par1, int par2, float par3, boolean par4) {
      super(par1, par2, par3, par4);
      this.e(1);
   }

   public void a(ye par1ItemStack, abw par2World, nn par3Entity, int par4, boolean par5) {
      if(par3Entity instanceof uf) {
         uf ep = (uf)par3Entity;
         if(Hooks.rotChance > 0) {
            int c = Hooks.rotChance / par1ItemStack.b;
            if(c < 1) {
               c = 1;
            }

            if(par2World.s.nextInt(c) == 0) {
               ep.bn.d(par1ItemStack.d);
               ep.bn.a(new ye(yc.bo));
            }
         }
      }

   }
}
