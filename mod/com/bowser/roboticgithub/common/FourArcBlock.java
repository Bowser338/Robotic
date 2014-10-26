package com.bowser.roboticgithub.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.bowser.robotic.proxy.ClientProxy;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FourArcBlock extends BlockContainer
{
    
    private static boolean isBurning;
    private final boolean isBurning2;
    private final Random random = new Random();    
    
    
    
    
    
    protected FourArcBlock(Material material, boolean isActive)
    {
        super(material);
        isBurning2 = isActive;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityFourArc();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return ClientProxy.renderInventoryTESRId;
    }


    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        FMLNetworkHandler.openGui(player, Robotic.instance, 0, world, x, y, z);
        return true;
    }

    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(Robotic.fourArc);
    }

    public Item getItem(World world, int par2, int par3, int par4) {
        return Item.getItemFromBlock(Robotic.fourArc);
    }
    
    
    @SideOnly(Side.CLIENT)
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.direction(world, x, y, z);
    }

    private void direction(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block direction = world.getBlock(x, y, z - 1);
            Block direction1 = world.getBlock(x, y, z + 1);
            Block direction2 = world.getBlock(x - 1, y, z);
            Block direction3 = world.getBlock(x + 1, y, z);
            byte byte0 = 3;

            if (direction.func_149730_j() && direction.func_149730_j()) {
                byte0 = 3;
            }

            if (direction1.func_149730_j() && direction1.func_149730_j()) {
                byte0 = 2;
            }

            if (direction2.func_149730_j() && direction2.func_149730_j()) {
                byte0 = 5;
            }

            if (direction3.func_149730_j() && direction3.func_149730_j()) {
                byte0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int direction = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (direction == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (direction == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (direction == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (direction == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (itemstack.hasDisplayName()) {
            ((TileEntityFourArc) world.getTileEntity(x, y, z)).furnaceName(itemstack.getDisplayName());
        }
    }

    public static void updateBlockState(boolean burning, World world, int x, int y, int z) {
        int direction = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isBurning = true;

        if (burning) {
            world.setBlock(x, y, z, Robotic.fourArc);
        } else {
            world.setBlock(x, y, z, Robotic.fourArc);
        }

        isBurning = false;
        world.setBlockMetadataWithNotify(x, y, z, direction, 2);

        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        if (!isBurning) {
            TileEntityFourArc tileentitytutfurnace = (TileEntityFourArc) world.getTileEntity(x, y, z);

            if (tileentitytutfurnace != null) {
                for (int i = 0; i < tileentitytutfurnace.getSizeInventory(); ++i) {
                    ItemStack itemstack = tileentitytutfurnace.getStackInSlot(i);

                    if (itemstack != null) {
                        float f = this.random.nextFloat() * 0.6F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.6F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.6F + 0.1F;

                        while (itemstack.stackSize > 0) {
                            int j = this.random.nextInt(21) + 10;

                            if (j > itemstack.stackSize) {
                                j = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j;
                            EntityItem entityitem = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound()) {
                                entityitem.getEntityItem().setTagCompound(((NBTTagCompound) itemstack.getTagCompound().copy()));
                            }

                            float f3 = 0.025F;
                            entityitem.motionX = (double) ((float) this.random.nextGaussian() * f3);
                            entityitem.motionY = (double) ((float) this.random.nextGaussian() * f3 + 0.1F);
                            entityitem.motionZ = (double) ((float) this.random.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }
                world.func_147453_f(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        if (this.isBurning2) {
            int direction = world.getBlockMetadata(x, y, z);

            float xx = (float) x + 0.5F, yy = (float) y + random.nextFloat() * 6.0F / 16.0F, zz = (float) z + 0.5F, xx2 = random.nextFloat() * 0.3F - 0.2F, zz2 = 0.5F;

            if (direction == 4) {
                world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
                world.spawnParticle("flame", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
            } else if (direction == 5) {
                world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
                world.spawnParticle("flame", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
            } else if (direction == 3) {
                world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
                world.spawnParticle("flame", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
            } else if (direction == 2) {
                world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
                world.spawnParticle("flame", (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
