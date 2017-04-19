package alex.hooks;

import alex.hooks.Hooks;
import alex.hooks.X2InvEntity;
import java.util.Random;

public class X2InvBlock extends amw {

   public X2InvBlock(int id) {
      super(id, akc.c);
      this.a((ww)null);
      this.c("x2Inv");
   }

   public void a(acf ba, int x, int y, int z) {
      if(ba.a(x + 1, y, z) != Hooks.spitCow.cF && ba.a(x + 1, y, z) != Hooks.cookedCow.cF && ba.a(x + 1, y, z) != Hooks.spitSkinnedCow.cF && ba.a(x + 1, y, z) != Hooks.burntCow.cF) {
         if(ba.a(x - 1, y, z) != Hooks.spitCow.cF && ba.a(x - 1, y, z) != Hooks.cookedCow.cF && ba.a(x - 1, y, z) != Hooks.spitSkinnedCow.cF && ba.a(x - 1, y, z) != Hooks.burntCow.cF) {
            if(ba.a(x, y, z + 1) != Hooks.spitCow.cF && ba.a(x, y, z + 1) != Hooks.cookedCow.cF && ba.a(x, y, z + 1) != Hooks.spitSkinnedCow.cF && ba.a(x, y, z + 1) != Hooks.burntCow.cF) {
               if(ba.a(x, y, z - 1) != Hooks.spitCow.cF && ba.a(x, y, z - 1) != Hooks.cookedCow.cF && ba.a(x, y, z - 1) != Hooks.spitSkinnedCow.cF && ba.a(x, y, z - 1) != Hooks.burntCow.cF) {
                  if(ba.a(x + 1, y, z) == Hooks.spitStick.cF) {
                     this.a(0.0F, 0.7F, 0.4F, 2.0F, 0.9F, 0.6F);
                     this.c(2.0F);
                  } else if(ba.a(x - 1, y, z) == Hooks.spitStick.cF) {
                     this.a(-1.0F, 0.7F, 0.4F, 1.0F, 0.9F, 0.6F);
                     this.c(2.0F);
                  } else if(ba.a(x, y, z + 1) == Hooks.spitStick.cF) {
                     this.a(0.4F, 0.7F, 0.0F, 0.6F, 0.9F, 2.0F);
                     this.c(2.0F);
                  } else if(ba.a(x, y, z - 1) == Hooks.spitStick.cF) {
                     this.a(0.4F, 0.7F, -1.0F, 0.6F, 0.9F, 1.0F);
                     this.c(2.0F);
                  } else if(ba.a(x + 1, y, z) != Hooks.spitChicken.cF && ba.a(x + 1, y, z) != Hooks.cookedChicken.cF && ba.a(x + 1, y, z) != Hooks.spitSkinnedChicken.cF && ba.a(x + 1, y, z) != Hooks.burntChicken.cF) {
                     if(ba.a(x - 1, y, z) != Hooks.spitChicken.cF && ba.a(x - 1, y, z) != Hooks.cookedChicken.cF && ba.a(x - 1, y, z) != Hooks.spitSkinnedChicken.cF && ba.a(x - 1, y, z) != Hooks.burntChicken.cF) {
                        if(ba.a(x, y, z + 1) != Hooks.spitChicken.cF && ba.a(x, y, z + 1) != Hooks.cookedChicken.cF && ba.a(x, y, z + 1) != Hooks.spitSkinnedChicken.cF && ba.a(x, y, z + 1) != Hooks.burntChicken.cF) {
                           if(ba.a(x, y, z - 1) != Hooks.spitChicken.cF && ba.a(x, y, z - 1) != Hooks.cookedChicken.cF && ba.a(x, y, z - 1) != Hooks.spitSkinnedChicken.cF && ba.a(x, y, z - 1) != Hooks.burntChicken.cF) {
                              if(ba.a(x + 1, y, z) != Hooks.spitPig.cF && ba.a(x + 1, y, z) != Hooks.cookedPig.cF && ba.a(x + 1, y, z) != Hooks.spitSkinnedPig.cF && ba.a(x + 1, y, z) != Hooks.burntPig.cF) {
                                 if(ba.a(x - 1, y, z) != Hooks.spitPig.cF && ba.a(x - 1, y, z) != Hooks.cookedPig.cF && ba.a(x - 1, y, z) != Hooks.spitSkinnedPig.cF && ba.a(x - 1, y, z) != Hooks.burntPig.cF) {
                                    if(ba.a(x, y, z + 1) != Hooks.spitPig.cF && ba.a(x, y, z + 1) != Hooks.cookedPig.cF && ba.a(x, y, z + 1) != Hooks.spitSkinnedPig.cF && ba.a(x, y, z + 1) != Hooks.burntPig.cF) {
                                       if(ba.a(x, y, z - 1) == Hooks.spitPig.cF || ba.a(x, y, z - 1) == Hooks.cookedPig.cF || ba.a(x, y, z - 1) == Hooks.spitSkinnedPig.cF || ba.a(x, y, z - 1) == Hooks.burntPig.cF) {
                                          this.a(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                                          this.c(500.0F);
                                       }
                                    } else {
                                       this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                                       this.c(500.0F);
                                    }
                                 } else {
                                    this.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                                    this.c(500.0F);
                                 }
                              } else {
                                 this.a(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
                                 this.c(500.0F);
                              }
                           } else {
                              this.a(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                              this.c(500.0F);
                           }
                        } else {
                           this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                           this.c(500.0F);
                        }
                     } else {
                        this.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                        this.c(500.0F);
                     }
                  } else {
                     this.a(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
                     this.c(500.0F);
                  }
               } else {
                  this.a(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                  this.c(500.0F);
               }
            } else {
               this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
               this.c(500.0F);
            }
         } else {
            this.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            this.c(500.0F);
         }
      } else {
         this.a(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
         this.c(500.0F);
      }

   }

   public void g(abw par1World, int par2, int par3, int par4, int par5) {
      if(par1World.a(par2, par3, par4 - 1) == Hooks.spitStick.cF) {
         par1World.a(par2, par3, par4 - 1, true);
      } else if(par1World.a(par2 + 1, par3, par4) == Hooks.spitStick.cF) {
         par1World.a(par2 + 1, par3, par4, true);
      } else if(par1World.a(par2 - 1, par3, par4) == Hooks.spitStick.cF) {
         par1World.a(par2 - 1, par3, par4, true);
      } else if(par1World.a(par2, par3, par4 + 1) == Hooks.spitStick.cF) {
         par1World.a(par2, par3, par4 + 1, true);
      }

   }

   public int a(int par1, Random par2Random, int par3) {
      return 0;
   }

   public asp b(abw world) {
      return new X2InvEntity();
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
