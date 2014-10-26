package com.bowser.roboticgithub.common;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneration extends WorldGenerator implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        // TODO Auto-generated method stub

    }
    
    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        if(world.getBlock(x, y - 1, z) == Blocks.grass && world.isAirBlock(x, y , z))
        {

            new com.bowser.robotic.common.GenResinTree(true).generate(world, random, x, y, z);
            return true;
        }

                else
                {
            return false;
                }

        }

}
