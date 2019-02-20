package alex.hooks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MeatItem extends ItemFood {

    public MeatItem(int par1, int par2, float par3, boolean par4) {
        super(par1, par2, par3, par4);
        this.setMaxDamage(1);
    }

    @Override
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
        if(par3Entity instanceof EntityPlayer) {
            EntityPlayer ep = (EntityPlayer)par3Entity;
            if(Hooks.rotChance > 0) {
                int c = Hooks.rotChance / par1ItemStack.stackSize;
                if(c < 1) {
                    c = 1;
                }

                if(par2World.rand.nextInt(c) == 0) {
                    ep.inventory.consumeInventoryItem(par1ItemStack.itemID);
                    ep.inventory.addItemStackToInventory(new ItemStack(Item.rottenFlesh));
                }
            }
        }
    }

}
