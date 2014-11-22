package com.bowser.robotic.common.gen;

import java.util.Random;

import com.bowser.robotic.common.Robotic;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GenResinTree extends  WorldGenerator
{

    public GenResinTree(boolean par1)
    {
    super(par1);
}

public boolean generate(World world, Random rand, int x, int y, int z) 
{
    //où nous ajouterons les blocs à générer
    
    world.setBlock(x , y , z , Robotic.boisResine);
    world.setBlock(x , y+1 , z , Robotic.boisResine);
    world.setBlock(x , y+2 , z , Robotic.boisResine);
    world.setBlock(x , y+3 , z , Robotic.boisResine);
    world.setBlock(x , y+4 , z , Robotic.boisResine);
    world.setBlock(x , y+5 , z , Robotic.boisResine);
    
    world.setBlock(x , y+3 , z+1 , Robotic.feuillesResine);
    world.setBlock(x , y+3 , z+2 , Robotic.feuillesResine);
    world.setBlock(x , y+3 , z-1 , Robotic.feuillesResine);
    world.setBlock(x , y+3 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x-1 , y+3 , z+1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+3 , z+2 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+3 , z-1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+3 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x+1 , y+3 , z+1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+3 , z+2 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+3 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+3 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x+1 , y+3 , z , Robotic.feuillesResine);
    world.setBlock(x+2 , y+3 , z , Robotic.feuillesResine);

    world.setBlock(x-1 , y+3 , z , Robotic.feuillesResine);
    world.setBlock(x-2 , y+3 , z , Robotic.feuillesResine);
    
    
    
    world.setBlock(x+1 , y+3 , z+1 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+3 , z+1 , Robotic.feuillesResine);

    world.setBlock(x-1 , y+3 , z+1 , Robotic.feuillesResine);
    world.setBlock(x-2 , y+3 , z+1 , Robotic.feuillesResine);
    
    
    world.setBlock(x+1 , y+3 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+3 , z-1 , Robotic.feuillesResine);

    world.setBlock(x-1 , y+3 , z-1 , Robotic.feuillesResine);
    world.setBlock(x-2 , y+3 , z-1 , Robotic.feuillesResine);
    
    
    
    
    
    
    
    world.setBlock(x , y+4 , z+1 , Robotic.feuillesResine);
    world.setBlock(x , y+4 , z+2 , Robotic.feuillesResine);
    world.setBlock(x , y+4 , z-1 , Robotic.feuillesResine);
    world.setBlock(x , y+4 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x-1 , y+4 , z+1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+4 , z+2 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+4 , z-1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+4 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x+1 , y+4 , z+1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+4 , z+2 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+4 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+4 , z-2 , Robotic.feuillesResine);
    
    world.setBlock(x+1 , y+4 , z , Robotic.feuillesResine);
    world.setBlock(x+2 , y+4 , z , Robotic.feuillesResine);

    world.setBlock(x-1 , y+4 , z , Robotic.feuillesResine);
    world.setBlock(x-2 , y+4 , z , Robotic.feuillesResine);
    
    
    
    world.setBlock(x+1 , y+4 , z+1 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+4 , z+1 , Robotic.feuillesResine);

    world.setBlock(x-1 , y+4 , z+1 , Robotic.feuillesResine);
    world.setBlock(x-2 , y+4 , z+1 , Robotic.feuillesResine);
    
    
    world.setBlock(x+1 , y+4 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+4 , z-1 , Robotic.feuillesResine);

    world.setBlock(x-1 , y+4 , z-1 , Robotic.feuillesResine);
    world.setBlock(x-2 , y+4 , z-1 , Robotic.feuillesResine);
    
    world.setBlock(x-2 , y+4 , z-2 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+4 , z+2 , Robotic.feuillesResine);
    
    world.setBlock(x-2 , y+4 , z+2 , Robotic.feuillesResine);
    world.setBlock(x+2 , y+4 , z-2 , Robotic.feuillesResine);
    
    
    
    world.setBlock(x , y+6 , z , Robotic.feuillesResine);
    world.setBlock(x , y+6 , z+1 , Robotic.feuillesResine);
    world.setBlock(x , y+6 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+6 , z , Robotic.feuillesResine);
    world.setBlock(x-1 , y+6 , z , Robotic.feuillesResine);
    
    world.setBlock(x , y+5 , z+1 , Robotic.feuillesResine);
    world.setBlock(x , y+5 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+5 , z , Robotic.feuillesResine);
    world.setBlock(x-1 , y+5 , z , Robotic.feuillesResine);
    
    world.setBlock(x+1 , y+5 , z+1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+5 , z-1 , Robotic.feuillesResine);
    world.setBlock(x+1 , y+5 , z-1 , Robotic.feuillesResine);
    world.setBlock(x-1 , y+5 , z+1 , Robotic.feuillesResine);
    
    return true;
}
}
