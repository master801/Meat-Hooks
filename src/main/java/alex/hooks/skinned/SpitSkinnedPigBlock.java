package alex.hooks.skinned;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

import alex.hooks.Hooks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpitSkinnedPigBlock extends BlockContainer {

   public SpitSkinnedPigBlock(int id) {
      super(id, Material.iron);
      this.setCreativeTab(null);
      this.setUnlocalizedName("spitSkinnedPig");
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
      }

   }

   @Override
   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      SpitSkinnedPigEntity a = (SpitSkinnedPigEntity)par1World.getBlockTileEntity(par2, par3, par4);
      AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox((double)par2, (double)(par3 - 2), (double)par4, (double)(par2 + 1), (double)(par3 - 1), (double)(par4 + 1));
      if(par1World.isBoundingBoxBurning(aabb)) {
         if(a.angle != 0.0F) {
            par1World.setBlock(par2, par3, par4, Hooks.cookedPig.blockID, par1World.getBlockMetadata(par2, par3, par4), 2);
         } else {
            par1World.setBlock(par2, par3, par4, Hooks.burntPig.blockID, par1World.getBlockMetadata(par2, par3, par4), 2);
         }
      }

   }

   @Override
   public int idDropped(int metadata, Random random, int fortune) {
      return Hooks.pigMeat.itemID;
   }

   @Override
   public int quantityDropped(int meta, int fortune, Random random) {
      int amount = 2 + random.nextInt(3) + fortune;
      return amount;
   }

   @Override
   public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
      par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
   }

   @Override
   public TileEntity createNewTileEntity(World world) {
      return new SpitSkinnedPigEntity();
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
