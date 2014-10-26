package com.bowser.robotic.proxy;

import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.TileEntityChargeurSansNoyau;
import com.bowser.robotic.common.TileEntityFourArc;
import com.bowser.robotic.common.TileEntityPipe;
import com.bowser.robotic.proxy.TESRInventoryRenderer.TESRIndex;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRender()
    {
        System.out.println("methode cote client"); 
        
        renderInventoryTESRId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new TESRInventoryRenderer());
        
        
    }
    
    public void registerProxies() {
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
        
    }
    
    public static int renderInventoryTESRId;
    
    @Override
    public void registerTileEntityRender()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFourArc.class, new TileEntityFourArcSpecialRender());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChargeurSansNoyau.class, new TileEntityChargeurSansNoyauSpecialRender());
    
    
        TESRInventoryRenderer.blockByTESR.put(new TESRIndex(Robotic.fourArc, 0), new TileEntityFourArcSpecialRender());
    }
}
