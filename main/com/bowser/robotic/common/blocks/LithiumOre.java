package com.bowser.robotic.common.blocks;

import java.util.Random;

import com.bowser.robotic.common.Robotic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LithiumOre extends Block
{
    public LithiumOre(Material material)
    {
        super(material);
        this.setHarvestLevel("pickaxe", 1);
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
