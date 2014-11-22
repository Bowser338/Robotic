package com.bowser.robotic.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreSilicium extends Block
{
    public OreSilicium(Material material)
    {
        super(material);
        this.setHarvestLevel("pickaxe", 2);
    }
}