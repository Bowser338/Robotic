package com.bowser.robotic.common.blocks;

import com.bowser.robotic.common.tileentity.TileEntityPipe;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockElectricCable extends BlockContainer
{

    public BlockElectricCable()
    {
        super(Material.ground);
        
        float pixel = 1F/16F;
        this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2);
        this.useNeighborBrightness=true;
        
    }
    
    public int getRenderType() {
        return -1;  
    }
    
    public boolean isOpaqueCube() {
        return false; //false
    }
    
    public boolean renderAsNormalBlock(){
        return false;
    }


    @Override
    public TileEntity createNewTileEntity(World world, int i)
    {
        return new TileEntityPipe();
    }
    
}