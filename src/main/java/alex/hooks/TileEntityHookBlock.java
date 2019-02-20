package alex.hooks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityHookBlock extends BlockContainer {

   public TileEntityHookBlock(int id) {
      super(id, Material.wood);
      this.setCreativeTab(CreativeTabs.tabBlock);
      this.setBlockBounds(0.3F, 0.5F, 0.3F, 0.7F, 0.9F, 0.7F);
      this.setUnlocalizedName("hook");
      this.setHardness(1.0F);
   }

   @Override
   public void onBlockPlacedBy(final World par1World, final int xCoord, final int yCoord, final int zCoord, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
      int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
      switch(l) {
      case 0:
         if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord - 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord + 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 3, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord - 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord + 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 2, 2);
         } else {
            par1World.destroyBlock(xCoord, yCoord, zCoord, true);
         }
         break;
      case 1:
         if(Block.isNormalCube(par1World.getBlockId(xCoord + 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord + 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord - 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 3, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord - 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 2, 2);
         } else {
            par1World.destroyBlock(xCoord, yCoord, zCoord, true);
         }
         break;
      case 2:
         if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord + 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord - 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord + 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord - 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 2, 2);
         } else {
            par1World.destroyBlock(xCoord, yCoord, zCoord, true);
         }
         break;
      case 3:
         if(Block.isNormalCube(par1World.getBlockId(xCoord - 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord - 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l + 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord, yCoord, zCoord + 1))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 1, 2);
         } else if(Block.isNormalCube(par1World.getBlockId(xCoord + 1, yCoord, zCoord))) {
            par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l - 2, 2);
         } else {
            par1World.destroyBlock(xCoord, yCoord, zCoord, true);
         }
      }

   }

   @Override
   public TileEntity createNewTileEntity(final World world) {
      return new TileEntityHookEntity();
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
