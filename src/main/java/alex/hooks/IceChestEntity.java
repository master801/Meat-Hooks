package alex.hooks;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import alex.hooks.IceChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.List;

public class IceChestEntity extends TileEntity implements IInventory {

   private ItemStack[] chestContents = new ItemStack[36];
   public boolean adjacentChestChecked;
   public IceChestEntity adjacentChestZNeg;
   public IceChestEntity adjacentChestXPos;
   public IceChestEntity adjacentChestXNeg;
   public IceChestEntity adjacentChestZPosition;
   public float lidAngle;
   public float prevLidAngle;
   public int numUsingPlayers;
   private int ticksSinceSync;
   private int cachedChestType;
   private String customName;


   public IceChestEntity() {
      this.cachedChestType = -1;
   }

   @SideOnly(Side.CLIENT)
   public IceChestEntity(int par1) {
      this.cachedChestType = par1;
   }

   public int j_() {
      return 27;
   }

   public ye a(int par1) {
      return this.chestContents[par1];
   }

   public ye a(int par1, int par2) {
      if(this.chestContents[par1] != null) {
         ye itemstack;
         if(this.chestContents[par1].b <= par2) {
            itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            this.e();
            return itemstack;
         } else {
            itemstack = this.chestContents[par1].a(par2);
            if(this.chestContents[par1].b == 0) {
               this.chestContents[par1] = null;
            }

            this.e();
            return itemstack;
         }
      } else {
         return null;
      }
   }

   public ye a_(int par1) {
      if(this.chestContents[par1] != null) {
         ye itemstack = this.chestContents[par1];
         this.chestContents[par1] = null;
         return itemstack;
      } else {
         return null;
      }
   }

   public void a(int par1, ye par2ItemStack) {
      this.chestContents[par1] = par2ItemStack;
      if(par2ItemStack != null && par2ItemStack.b > this.d()) {
         par2ItemStack.b = this.d();
      }

      this.e();
   }

   public String b() {
      return this.c()?this.customName:"container.chest";
   }

   public boolean c() {
      return this.customName != null && this.customName.length() > 0;
   }

   public void setChestGuiName(String par1Str) {
      this.customName = par1Str;
   }

   public void a(by par1NBTTagCompound) {
      super.a(par1NBTTagCompound);
      cg nbttaglist = par1NBTTagCompound.m("Items");
      this.chestContents = new ye[this.j_()];
      if(par1NBTTagCompound.b("CustomName")) {
         this.customName = par1NBTTagCompound.i("CustomName");
      }

      for(int i = 0; i < nbttaglist.c(); ++i) {
         by nbttagcompound1 = (by)nbttaglist.b(i);
         int j = nbttagcompound1.c("Slot") & 255;
         if(j >= 0 && j < this.chestContents.length) {
            this.chestContents[j] = ye.a(nbttagcompound1);
         }
      }

   }

   public void b(by par1NBTTagCompound) {
      super.b(par1NBTTagCompound);
      cg nbttaglist = new cg();

      for(int i = 0; i < this.chestContents.length; ++i) {
         if(this.chestContents[i] != null) {
            by nbttagcompound1 = new by();
            nbttagcompound1.a("Slot", (byte)i);
            this.chestContents[i].b(nbttagcompound1);
            nbttaglist.a(nbttagcompound1);
         }
      }

      par1NBTTagCompound.a("Items", nbttaglist);
      if(this.c()) {
         par1NBTTagCompound.a("CustomName", this.customName);
      }

   }

   public int d() {
      return 64;
   }

   public boolean a(uf par1EntityPlayer) {
      return this.k.r(this.l, this.m, this.n) != this?false:par1EntityPlayer.e((double)this.l + 0.5D, (double)this.m + 0.5D, (double)this.n + 0.5D) <= 64.0D;
   }

   public void i() {
      super.i();
      this.adjacentChestChecked = false;
   }

   private void func_90009_a(IceChestEntity par1IceChestEntity, int par2) {
      if(par1IceChestEntity.r()) {
         this.adjacentChestChecked = false;
      } else if(this.adjacentChestChecked) {
         switch(par2) {
         case 0:
            if(this.adjacentChestZPosition != par1IceChestEntity) {
               this.adjacentChestChecked = false;
            }
            break;
         case 1:
            if(this.adjacentChestXNeg != par1IceChestEntity) {
               this.adjacentChestChecked = false;
            }
            break;
         case 2:
            if(this.adjacentChestZNeg != par1IceChestEntity) {
               this.adjacentChestChecked = false;
            }
            break;
         case 3:
            if(this.adjacentChestXPos != par1IceChestEntity) {
               this.adjacentChestChecked = false;
            }
         }
      }

   }

   public void checkForAdjacentChests() {
      if(!this.adjacentChestChecked) {
         this.adjacentChestChecked = true;
         this.adjacentChestZNeg = null;
         this.adjacentChestXPos = null;
         this.adjacentChestXNeg = null;
         this.adjacentChestZPosition = null;
         if(this.func_94044_a(this.l - 1, this.m, this.n)) {
            this.adjacentChestXNeg = (IceChestEntity)this.k.r(this.l - 1, this.m, this.n);
         }

         if(this.func_94044_a(this.l + 1, this.m, this.n)) {
            this.adjacentChestXPos = (IceChestEntity)this.k.r(this.l + 1, this.m, this.n);
         }

         if(this.func_94044_a(this.l, this.m, this.n - 1)) {
            this.adjacentChestZNeg = (IceChestEntity)this.k.r(this.l, this.m, this.n - 1);
         }

         if(this.func_94044_a(this.l, this.m, this.n + 1)) {
            this.adjacentChestZPosition = (IceChestEntity)this.k.r(this.l, this.m, this.n + 1);
         }

         if(this.adjacentChestZNeg != null) {
            this.adjacentChestZNeg.func_90009_a(this, 0);
         }

         if(this.adjacentChestZPosition != null) {
            this.adjacentChestZPosition.func_90009_a(this, 2);
         }

         if(this.adjacentChestXPos != null) {
            this.adjacentChestXPos.func_90009_a(this, 1);
         }

         if(this.adjacentChestXNeg != null) {
            this.adjacentChestXNeg.func_90009_a(this, 3);
         }
      }

   }

   private boolean func_94044_a(int par1, int par2, int par3) {
      aqz block = aqz.s[this.k.a(par1, par2, par3)];
      return block != null && block instanceof IceChest?((IceChest)block).chestType == this.getChestType():false;
   }

   public void h() {
      super.h();
      this.checkForAdjacentChests();
      ++this.ticksSinceSync;
      float f;
      if(!this.k.I && this.numUsingPlayers != 0 && (this.ticksSinceSync + this.l + this.m + this.n) % 200 == 0) {
         this.numUsingPlayers = 0;
         f = 5.0F;
         List d0 = this.k.a(uf.class, asx.a().a((double)((float)this.l - f), (double)((float)this.m - f), (double)((float)this.n - f), (double)((float)(this.l + 1) + f), (double)((float)(this.m + 1) + f), (double)((float)(this.n + 1) + f)));
         Iterator iterator = d0.iterator();

         while(iterator.hasNext()) {
            uf f1 = (uf)iterator.next();
            if(f1.bp instanceof vj) {
               mo f2 = ((vj)f1.bp).e();
               if(f2 == this || f2 instanceof mn && ((mn)f2).a(this)) {
                  ++this.numUsingPlayers;
               }
            }
         }
      }

      this.prevLidAngle = this.lidAngle;
      f = 0.1F;
      double var8;
      if(this.numUsingPlayers > 0 && this.lidAngle == 0.0F && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null) {
         double var9 = (double)this.l + 0.5D;
         var8 = (double)this.n + 0.5D;
         if(this.adjacentChestZPosition != null) {
            var8 += 0.5D;
         }

         if(this.adjacentChestXPos != null) {
            var9 += 0.5D;
         }

         this.k.a(var9, (double)this.m + 0.5D, var8, "random.chestopen", 0.5F, this.k.s.nextFloat() * 0.1F + 0.9F);
      }

      if(this.numUsingPlayers == 0 && this.lidAngle > 0.0F || this.numUsingPlayers > 0 && this.lidAngle < 1.0F) {
         float var10 = this.lidAngle;
         if(this.numUsingPlayers > 0) {
            this.lidAngle += f;
         } else {
            this.lidAngle -= f;
         }

         if(this.lidAngle > 1.0F) {
            this.lidAngle = 1.0F;
         }

         float var11 = 0.5F;
         if(this.lidAngle < var11 && var10 >= var11 && this.adjacentChestZNeg == null && this.adjacentChestXNeg == null) {
            var8 = (double)this.l + 0.5D;
            double d2 = (double)this.n + 0.5D;
            if(this.adjacentChestZPosition != null) {
               d2 += 0.5D;
            }

            if(this.adjacentChestXPos != null) {
               var8 += 0.5D;
            }

            this.k.a(var8, (double)this.m + 0.5D, d2, "random.chestclosed", 0.5F, this.k.s.nextFloat() * 0.1F + 0.9F);
         }

         if(this.lidAngle < 0.0F) {
            this.lidAngle = 0.0F;
         }
      }

   }

   public boolean b(int par1, int par2) {
      if(par1 == 1) {
         this.numUsingPlayers = par2;
         return true;
      } else {
         return super.b(par1, par2);
      }
   }

   public void k_() {
      if(this.numUsingPlayers < 0) {
         this.numUsingPlayers = 0;
      }

      ++this.numUsingPlayers;
      this.k.d(this.l, this.m, this.n, this.q().cF, 1, this.numUsingPlayers);
      this.k.f(this.l, this.m, this.n, this.q().cF);
      this.k.f(this.l, this.m - 1, this.n, this.q().cF);
   }

   public void g() {
      if(this.q() != null && this.q() instanceof IceChest) {
         --this.numUsingPlayers;
         this.k.d(this.l, this.m, this.n, this.q().cF, 1, this.numUsingPlayers);
         this.k.f(this.l, this.m, this.n, this.q().cF);
         this.k.f(this.l, this.m - 1, this.n, this.q().cF);
      }

   }

   public boolean b(int par1, ye par2ItemStack) {
      return true;
   }

   public void w_() {
      super.w_();
      this.i();
      this.checkForAdjacentChests();
   }

   public int getChestType() {
      if(this.cachedChestType == -1) {
         if(this.k == null || !(this.q() instanceof IceChest)) {
            return 0;
         }

         this.cachedChestType = ((IceChest)this.q()).chestType;
      }

      return this.cachedChestType;
   }
}
