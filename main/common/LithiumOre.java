package com.bowser.robotic.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LithiumOre extends Block
{
    protected LithiumOre(Material material)
    {
        super(material);
    }
    
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Robotic.lithiumDust;
    }
    
    @Override
    public int quantityDropped(Random rand)
    {
        return 2 + rand.nextInt(4);
    }
    
    
    
}
