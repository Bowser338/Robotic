package com.bowser.roboticgithub.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorCopper implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {

        switch(world.provider.dimensionId)
        {
            
        case -1:
            this.generateNether(world, chunkX * 16, chunkZ * 16, random);
                
        case 0:
            this.generateSurface(world, chunkX * 16, chunkZ * 16, random);
           // break;
            
        case 1:
            this.generateEnd(world, chunkX * 16, chunkZ * 16, random);
        }
        
        
    }
    private void generateNether(World world, int i, int j, Random random)
    {
        // TODO Auto-generated method stub
        
    }
    private void generateEnd(World world, int i, int j, Random random)
    {
        // TODO Auto-generated method stub
        
    }
    private void generateSurface(World world, int x, int z, Random rand)
    {
        
        
        
        
        //GENERATION DE CUIVRE
        
        for(int i = 0; i < 20; i++) //20 = frequence de generation
        {
            //(new WorldGenMinable(Robotic.cuivreOre.blockID, 0, 5, 1)).generate(world, rand, x + rand.nextInt(16), rand.nextInt(128), z + rand.nextInt(16));
        
            int yMin = 4;
            int yMax = 128;
            
            int firstBlockX = x + rand.nextInt(16);
            int firstBlockY = yMin + rand.nextInt(yMax - yMin);
            int firstBlockZ = z + rand.nextInt(16);
            
            (new WorldGenMinable(Robotic.cuivreOre, 12)).generate(world, rand, firstBlockX, firstBlockY, firstBlockZ);
        }
        
        for(int i = 0; i < 20; i++) //20 = frequence de generation
        {
            int x1 = x + rand.nextInt(16);
            int y1 = rand.nextInt(128);
            int z1 = z + rand.nextInt(16);
            
            (new WorldGeneration()).generate(world, rand, x1, y1, z1);
        
        }
        
        {

            //GENERATION DE LITHIUM
            if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.deepOcean))
            {
                 //Code de génération
                for(int i = 0; i < 50; i++) //20 = frequence de generation
                {
                    int yMin = 15;
                    int yMax = 128;
                    
                    int firstBlockX = x + rand.nextInt(16);
                    int firstBlockY = yMin + rand.nextInt(yMax - yMin);
                    int firstBlockZ = z + rand.nextInt(16);
                    
                    (new WorldGenMinable(Robotic.lithiumOre, 12)).generate(world, rand, firstBlockX, firstBlockY, firstBlockZ);
                }
            }
            
            if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.ocean))
            {
                 //Code de génération
                for(int i = 0; i < 50; i++) //20 = frequence de generation
                {
                    int yMin = 15;
                    int yMax = 128;
                    
                    int firstBlockX = x + rand.nextInt(16);
                    int firstBlockY = yMin + rand.nextInt(yMax - yMin);
                    int firstBlockZ = z + rand.nextInt(16);
                    
                    (new WorldGenMinable(Robotic.lithiumOre, 12)).generate(world, rand, firstBlockX, firstBlockY, firstBlockZ);
                }
            }
            
            
                
        }
        
        
        
        
    }



}
