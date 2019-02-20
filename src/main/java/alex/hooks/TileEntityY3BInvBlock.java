package alex.hooks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityY3BInvBlock extends BlockContainer {

    public TileEntityY3BInvBlock(int id) {
        super(id, Material.iron);
        this.setCreativeTab(null);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F);
        this.setUnlocalizedName("Y3BInv");
        this.setHardness(500.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityY3BInvEntity();
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
    public void registerIcons(IconRegister icon) {
        blockIcon = icon.registerIcon("Hooks:hookIcon");
    }

}
