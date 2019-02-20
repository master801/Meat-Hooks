package alex.hooks.spit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import alex.hooks.Hooks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitStickBlock extends Block {

    public SpitStickBlock(int id) {
        super(id, Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("spitStick");
        this.setHardness(2.0F);
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        if(par1World.getBlockId(par2, par3, par4 + 1) == Hooks.spitProp.blockID && par1World.getBlockId(par2, par3, par4 - 2) == Hooks.spitProp.blockID) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
            par1World.setBlockMetadataWithNotify(par2, par3, par4 - 2, 0, 2);
            par1World.setBlockMetadataWithNotify(par2, par3, par4 + 1, 0, 2);
            par1World.setBlock(par2, par3, par4 - 1, Hooks.x2Inv.blockID, 0, 2);
        } else if(par1World.getBlockId(par2 + 1, par3, par4) == Hooks.spitProp.blockID && par1World.getBlockId(par2 - 2, par3, par4) == Hooks.spitProp.blockID) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
            par1World.setBlockMetadataWithNotify(par2 - 2, par3, par4, 3, 2);
            par1World.setBlockMetadataWithNotify(par2 + 1, par3, par4, 3, 2);
            par1World.setBlock(par2 - 1, par3, par4, Hooks.x2Inv.blockID, 3, 2);
        } else if(par1World.getBlockId(par2, par3, par4 - 1) == Hooks.spitProp.blockID && par1World.getBlockId(par2, par3, par4 + 2) == Hooks.spitProp.blockID) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
            par1World.setBlockMetadataWithNotify(par2, par3, par4 + 2, 2, 2);
            par1World.setBlockMetadataWithNotify(par2, par3, par4 - 1, 2, 2);
            par1World.setBlock(par2, par3, par4 + 1, Hooks.x2Inv.blockID, 2, 2);
        } else if(par1World.getBlockId(par2 - 1, par3, par4) == Hooks.spitProp.blockID && par1World.getBlockId(par2 + 2, par3, par4) == Hooks.spitProp.blockID) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
            par1World.setBlockMetadataWithNotify(par2 + 2, par3, par4, 1, 2);
            par1World.setBlockMetadataWithNotify(par2 - 1, par3, par4, 1, 2);
            par1World.setBlock(par2 + 1, par3, par4, Hooks.x2Inv.blockID, 1, 2);
        } else {
            par1World.destroyBlock(par2, par3, par4, true);
        }

    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess ba, int x, int y, int z) {
        switch(ba.getBlockMetadata(x, y, z)) {
            case 0:
                setBlockBounds(0.4F, 0.7F, -1.0F, 0.6F, 0.9F, 1.0F);
                break;
            case 1:
                setBlockBounds(0.0F, 0.7F, 0.4F, 2.0F, 0.9F, 0.6F);
                break;
            case 2:
                setBlockBounds(0.4F, 0.7F, 0.0F, 0.6F, 0.9F, 2.0F);
                break;
            case 3:
                setBlockBounds(-1.0F, 0.7F, 0.4F, 1.0F, 0.9F, 0.6F);
                break;
        }
    }

    @Override
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
        switch(par5) {
            case 0:
                par1World.destroyBlock(par2, par3, par4 - 1, false);
                break;
            case 1:
                par1World.destroyBlock(par2 + 1, par3, par4, false);
                break;
            case 2:
                par1World.destroyBlock(par2, par3, par4 + 1, false);
                break;
            case 3:
                par1World.destroyBlock(par2 - 1, par3, par4, false);
                break;
        }
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
        par1IconRegister.registerIcon("Hooks:spitStickIcon");
    }

}
