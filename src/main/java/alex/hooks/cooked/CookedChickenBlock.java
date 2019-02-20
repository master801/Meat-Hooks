package alex.hooks.cooked;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

import alex.hooks.Hooks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CookedChickenBlock extends BlockContainer {

    public CookedChickenBlock(int id) {
        super(id, Material.iron);
        setCreativeTab(null);
        setUnlocalizedName("cookedChicken");
        setHardness(500.0F);
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess ba, int x, int y, int z) {
        switch(ba.getBlockMetadata(x, y, z)) {
            case 0:
                this.setBlockBounds(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                break;
            case 1:
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
                break;
            case 2:
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                break;
            case 3:
                this.setBlockBounds(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

    }

    @Override
    public int quantityDropped(int metadata, int fortune, Random rand) {
        return 3 + rand.nextInt(3) + fortune;
    }

    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<>();
        int amount = this.quantityDropped(metadata, fortune, world.rand);
        boolean luckDraw = false;
        boolean idDropped = false;
        boolean metaDropped = false;

        for(int i = 0; i < amount; ++i) {
            int var13 = world.rand.nextInt(3);
            int var14 = 0;
            byte var15 = 0;
            if(var13 == 0) {
                var14 = Hooks.chickennCooked.itemID;
            }

            if(var13 == 1) {
                var14 = Hooks.chickennCooked.itemID;
            }

            if(var13 == 2) {
                var14 = Item.bone.itemID;
            }

            ret.add(new ItemStack(var14, 1, var15));
        }

        return ret;
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new CookedChickenEntity();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon("Hooks:hookIcon");
    }

}
