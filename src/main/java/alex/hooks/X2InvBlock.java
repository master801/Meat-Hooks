package alex.hooks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class X2InvBlock extends BlockContainer {

    public X2InvBlock(int id) {
        super(id, Material.ground);
        this.setCreativeTab(null);
        this.setUnlocalizedName("x2Inv");
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess ba, int x, int y, int z) {
        if(ba.getBlockId(x + 1, y, z) != Hooks.spitCow.blockID && ba.getBlockId(x + 1, y, z) != Hooks.cookedCow.blockID && ba.getBlockId(x + 1, y, z) != Hooks.spitSkinnedCow.blockID && ba.getBlockId(x + 1, y, z) != Hooks.burntCow.blockID) {
            if(ba.getBlockId(x - 1, y, z) != Hooks.spitCow.blockID && ba.getBlockId(x - 1, y, z) != Hooks.cookedCow.blockID && ba.getBlockId(x - 1, y, z) != Hooks.spitSkinnedCow.blockID && ba.getBlockId(x - 1, y, z) != Hooks.burntCow.blockID) {
                if(ba.getBlockId(x, y, z + 1) != Hooks.spitCow.blockID && ba.getBlockId(x, y, z + 1) != Hooks.cookedCow.blockID && ba.getBlockId(x, y, z + 1) != Hooks.spitSkinnedCow.blockID && ba.getBlockId(x, y, z + 1) != Hooks.burntCow.blockID) {
                    if(ba.getBlockId(x, y, z - 1) != Hooks.spitCow.blockID && ba.getBlockId(x, y, z - 1) != Hooks.cookedCow.blockID && ba.getBlockId(x, y, z - 1) != Hooks.spitSkinnedCow.blockID && ba.getBlockId(x, y, z - 1) != Hooks.burntCow.blockID) {
                        if(ba.getBlockId(x + 1, y, z) == Hooks.spitStick.blockID) {
                            this.setBlockBounds(0.0F, 0.7F, 0.4F, 2.0F, 0.9F, 0.6F);
                            this.setHardness(2.0F);
                        } else if(ba.getBlockId(x - 1, y, z) == Hooks.spitStick.blockID) {
                            this.setBlockBounds(-1.0F, 0.7F, 0.4F, 1.0F, 0.9F, 0.6F);
                            this.setHardness(2.0F);
                        } else if(ba.getBlockId(x, y, z + 1) == Hooks.spitStick.blockID) {
                            this.setBlockBounds(0.4F, 0.7F, 0.0F, 0.6F, 0.9F, 2.0F);
                            this.setHardness(2.0F);
                        } else if(ba.getBlockId(x, y, z - 1) == Hooks.spitStick.blockID) {
                            this.setBlockBounds(0.4F, 0.7F, -1.0F, 0.6F, 0.9F, 1.0F);
                            this.setHardness(2.0F);
                        } else if(ba.getBlockId(x + 1, y, z) != Hooks.spitChicken.blockID && ba.getBlockId(x + 1, y, z) != Hooks.cookedChicken.blockID && ba.getBlockId(x + 1, y, z) != Hooks.spitSkinnedChicken.blockID && ba.getBlockId(x + 1, y, z) != Hooks.burntChicken.blockID) {
                            if(ba.getBlockId(x - 1, y, z) != Hooks.spitChicken.blockID && ba.getBlockId(x - 1, y, z) != Hooks.cookedChicken.blockID && ba.getBlockId(x - 1, y, z) != Hooks.spitSkinnedChicken.blockID && ba.getBlockId(x - 1, y, z) != Hooks.burntChicken.blockID) {
                                if(ba.getBlockId(x, y, z + 1) != Hooks.spitChicken.blockID && ba.getBlockId(x, y, z + 1) != Hooks.cookedChicken.blockID && ba.getBlockId(x, y, z + 1) != Hooks.spitSkinnedChicken.blockID && ba.getBlockId(x, y, z + 1) != Hooks.burntChicken.blockID) {
                                    if(ba.getBlockId(x, y, z - 1) != Hooks.spitChicken.blockID && ba.getBlockId(x, y, z - 1) != Hooks.cookedChicken.blockID && ba.getBlockId(x, y, z - 1) != Hooks.spitSkinnedChicken.blockID && ba.getBlockId(x, y, z - 1) != Hooks.burntChicken.blockID) {
                                        if(ba.getBlockId(x + 1, y, z) != Hooks.spitPig.blockID && ba.getBlockId(x + 1, y, z) != Hooks.cookedPig.blockID && ba.getBlockId(x + 1, y, z) != Hooks.spitSkinnedPig.blockID && ba.getBlockId(x + 1, y, z) != Hooks.burntPig.blockID) {
                                            if(ba.getBlockId(x - 1, y, z) != Hooks.spitPig.blockID && ba.getBlockId(x - 1, y, z) != Hooks.cookedPig.blockID && ba.getBlockId(x - 1, y, z) != Hooks.spitSkinnedPig.blockID && ba.getBlockId(x - 1, y, z) != Hooks.burntPig.blockID) {
                                                if(ba.getBlockId(x, y, z + 1) != Hooks.spitPig.blockID && ba.getBlockId(x, y, z + 1) != Hooks.cookedPig.blockID && ba.getBlockId(x, y, z + 1) != Hooks.spitSkinnedPig.blockID && ba.getBlockId(x, y, z + 1) != Hooks.burntPig.blockID) {
                                                    if(ba.getBlockId(x, y, z - 1) == Hooks.spitPig.blockID || ba.getBlockId(x, y, z - 1) == Hooks.cookedPig.blockID || ba.getBlockId(x, y, z - 1) == Hooks.spitSkinnedPig.blockID || ba.getBlockId(x, y, z - 1) == Hooks.burntPig.blockID) {
                                                        this.setBlockBounds(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                                                        this.setHardness(500.0F);
                                                    }
                                                } else {
                                                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                                                    this.setHardness(500.0F);
                                                }
                                            } else {
                                                this.setBlockBounds(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                                                this.setHardness(500.0F);
                                            }
                                        } else {
                                            this.setBlockBounds(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
                                            this.setHardness(500.0F);
                                        }
                                    } else {
                                        this.setBlockBounds(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                                        this.setHardness(500.0F);
                                    }
                                } else {
                                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                                    this.setHardness(500.0F);
                                }
                            } else {
                                this.setBlockBounds(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                                this.setHardness(500.0F);
                            }
                        } else {
                            this.setBlockBounds(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
                            this.setHardness(500.0F);
                        }
                    } else {
                        this.setBlockBounds(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F);
                        this.setHardness(500.0F);
                    }
                } else {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F);
                    this.setHardness(500.0F);
                }
            } else {
                this.setBlockBounds(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                this.setHardness(500.0F);
            }
        } else {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F);
            this.setHardness(500.0F);
        }

    }

    @Override
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
        if(par1World.getBlockId(par2, par3, par4 - 1) == Hooks.spitStick.blockID) {
            par1World.destroyBlock(par2, par3, par4 - 1, true);
        } else if(par1World.getBlockId(par2 + 1, par3, par4) == Hooks.spitStick.blockID) {
            par1World.destroyBlock(par2 + 1, par3, par4, true);
        } else if(par1World.getBlockId(par2 - 1, par3, par4) == Hooks.spitStick.blockID) {
            par1World.destroyBlock(par2 - 1, par3, par4, true);
        } else if(par1World.getBlockId(par2, par3, par4 + 1) == Hooks.spitStick.blockID) {
            par1World.destroyBlock(par2, par3, par4 + 1, true);
        }

    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new X2InvEntity();
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
