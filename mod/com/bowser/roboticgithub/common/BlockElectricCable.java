package com.bowser.roboticgithub.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockElectricCable extends BlockContainer
{

    protected BlockElectricCable()
    {
        super(Material.ground);
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