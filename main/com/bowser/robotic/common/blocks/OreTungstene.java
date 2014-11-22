package com.bowser.robotic.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreTungstene extends Block
{
    public OreTungstene(Material material)
    {
        super(material);
        this.setHarvestLevel("pickaxe", 3);
    }
}
