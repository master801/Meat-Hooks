package alex.hooks.rotten;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityRottenChickenBlock extends BlockContainer {

    public TileEntityRottenChickenBlock(int id) {
        super(id, Material.iron);
        this.setCreativeTab(null);
        this.setBlockBounds(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        this.setUnlocalizedName("rottenChicken");
        this.setHardness(500.0F);
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
                var14 = Item.rottenFlesh.itemID;
            }
            if(var13 == 1) {
                var14 = Item.rottenFlesh.itemID;
            }
            if(var13 == 2) {
                var14 = Item.bone.itemID;
            }

            ret.add(new ItemStack(var14, 1, var15));
        }
        return ret;
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityRottenChickenEntity();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister par1IconRegister) {
        par1IconRegister.registerIcon("Hooks:hookIcon");
    }

}
