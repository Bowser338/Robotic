package com.bowser.robotic.common.blocks;

import java.util.Random;

import com.bowser.robotic.common.Robotic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OreManganese extends Block {
    public OreManganese(Material material)
    {
        super(material);
        this.setHarvestLevel("pickaxe", 2);
    }
    
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Robotic.manganeseChunk;
    }
    
    @Override
    public int quantityDropped(Random rand)
    {
        return 1 + rand.nextInt(2);
    }

}
