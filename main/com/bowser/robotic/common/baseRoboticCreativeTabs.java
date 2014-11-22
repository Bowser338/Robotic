package com.bowser.robotic.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class baseRoboticCreativeTabs extends CreativeTabs
{
    

    public baseRoboticCreativeTabs(String label)
    {
         super(label);
         //this.setBackgroundImageName("robotic_mod.png");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Robotic.fourArc);
    }
    
    
    
    
}
