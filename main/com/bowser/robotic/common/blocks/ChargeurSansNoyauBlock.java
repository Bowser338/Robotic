package com.bowser.robotic.common.blocks;

import com.bowser.robotic.common.tileentity.TileEntityChargeurSansNoyau;
import com.bowser.robotic.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChargeurSansNoyauBlock extends Block
{

    public ChargeurSansNoyauBlock(Material material)
    {
        super(material);
    }

    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityChargeurSansNoyau();
    }

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





}
