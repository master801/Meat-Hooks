package alex.hooks.hooked;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HookedZombieBlock extends BlockContainer {

    public HookedZombieBlock(int id) {
        super(id, Material.iron);
        this.setCreativeTab(null);
        this.setBlockBounds(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        this.setUnlocalizedName("hookedZombie");
        this.setHardness(500.0F);
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new HookedZombieEntity();
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
