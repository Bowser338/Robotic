package com.bowser.robotic.proxy;

import net.minecraft.client.model.ModelBiped;

import com.bowser.robotic.common.Robotic;

import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy
{
    public void registerRender()
    {
        System.out.println("methode cote serveur");
    }
    
    
    public void registerTileEntityRender()
    {
        
    }


    public void registerGuiHandler(Robotic instance, GuiHandler guiHandler)
    {
        // TODO Auto-generated method stub
        NetworkRegistry.INSTANCE.registerGuiHandler(Robotic.modid, new GuiHandler());
    }
    
    public ModelBiped getArmorModel(int id){ 
        return null; 
    
    }
}
