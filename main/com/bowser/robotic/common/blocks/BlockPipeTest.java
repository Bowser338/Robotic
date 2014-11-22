package com.bowser.robotic.common.blocks;

import java.util.ArrayList;

import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.tileentity.TileEntityBlockPipeTest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;

public class BlockPipeTest extends Block
{

    public BlockPipeTest(Material material)
    {
        super(material);
    }

    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityBlockPipeTest();
    }

    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getRenderType() {
        return -1;  
    }

    public boolean isOpaqueCube()
    {
        return false;
    }


    private void func_150177_e(World world, int x, int y, int z)
    {

    }
    
    /**public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);

        if (!world.isRemote)
        {
            //this.func_150177_e(world, x, y, z);
            //world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
            //world.notifyBlocksOfNeighborChange(x, y - 1, z, this);

            if (world.getBlock(x - 1, y, z) == Robotic.pipetest)
            {
                this.func_150172_m(world, x, y, z);
            }
            else
            {
                this.func_150172_m(world, x, y, z);
            }
        }
        
    }
    */
}
        
        