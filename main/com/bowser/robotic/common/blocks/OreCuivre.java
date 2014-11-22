package com.bowser.robotic.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCuivre extends Block
{
    public OreCuivre(Material material)
    {
        super(material);
        this.setHarvestLevel("pickaxe", 1);
    }
}
