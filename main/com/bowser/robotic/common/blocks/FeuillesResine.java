package com.bowser.robotic.common.blocks;

import java.util.Random;

import com.bowser.robotic.common.Robotic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FeuillesResine extends BlockLeaves
{
    
    protected IIcon fastIcon;   
    
    @Override   
    public void registerBlockIcons(IIconRegister iconregister)  
    {       
        blockIcon = iconregister.registerIcon(this.getTextureName());       
        fastIcon = iconregister.registerIcon(this.getTextureName() + "_opaque");    
    }
    
    
    @Override
    public IIcon getIcon(int side, int metadata) 
        {
        return(isOpaqueCube() ? fastIcon : blockIcon);  
    }

    @Override
    public String[] func_150125_e() 
        {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return Blocks.leaves.isOpaqueCube();
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockaccess, int x, int y, int z, int side)
    {
        return !this.isOpaqueCube() ? true : super.shouldSideBeRendered(blockaccess, x, y, z, side);
    }

@Override
    public boolean isLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

@Override  
public int getBlockColor()  
{       
    return -1;  
}

    @Override   
public int getRenderColor(int par1) 
{       
    return -1;  
}   

@Override   
public int quantityDropped(Random random)   
{       
    return random.nextInt(20) == 0 ? 1 : 0; 
}   

@Override   
public Item getItemDropped(int metadata, Random random, int par3)   
{       
    return Item.getItemFromBlock(Robotic.pousseResine);   
    
    
}

@Override  
public void dropBlockAsItemWithChance(World world, int x, int y, int z, int metadata, float par6, int par7) 
{       
    if(!world.isRemote)     
    {           
        if(world.rand.nextInt(20) == 0)         
        {               
            Item splingid = this.getItemDropped(metadata, world.rand, par7);                
            this.dropBlockAsItem(world, x, y, z, new ItemStack(splingid, 1, this.damageDropped(metadata)));         
        }       
        
    }   
    
}





}
