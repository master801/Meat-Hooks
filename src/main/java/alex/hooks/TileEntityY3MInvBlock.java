package alex.hooks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityY3MInvBlock extends BlockContainer {

    public TileEntityY3MInvBlock(int id) {
        super(id, Material.iron);
        this.setCreativeTab(null);
        this.setBlockBounds(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        this.setUnlocalizedName("Y3MInv");
        this.setHardness(500.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityY3MInvEntity();
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
        this.blockIcon = icon.registerIcon("Hooks:hookIcon");
    }

}
