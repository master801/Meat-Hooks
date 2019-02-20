package alex.hooks.spit;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

import alex.hooks.Hooks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitCowBlock extends BlockContainer {

   public SpitCowBlock(int id) {
      super(id, Material.iron);
      this.setCreativeTab(null);
      this.setUnlocalizedName("spitCow");
      this.setHardness(500.0F);
      this.setTickRandomly(true);
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
         break;
      }
   }

   @Override
   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      SpitCowEntity a = (SpitCowEntity)par1World.getBlockTileEntity(par2, par3, par4);
      AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)par2, (double)(par3 - 2), (double)par4, (double)(par2 + 1), (double)(par3 - 1), (double)(par4 + 1));
      if(par5Random.nextInt(1) == 0 && par1World.isBoundingBoxBurning(aabb)) {
         if(a.angle != 0.0F) {
            par1World.setBlock(par2, par3, par4, Hooks.cookedCow.blockID, par1World.getBlockMetadata(par2, par3, par4), 2);
         } else {
            par1World.setBlock(par2, par3, par4, Hooks.burntCow.blockID, par1World.getBlockMetadata(par2, par3, par4), 2);
         }
      }

   }

   @Override
   public TileEntity createNewTileEntity(World world) {
      return new SpitCowEntity();
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
