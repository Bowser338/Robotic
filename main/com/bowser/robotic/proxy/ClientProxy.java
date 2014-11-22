package com.bowser.robotic.proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.entity.EntityGuardian;
import com.bowser.robotic.common.techne.BaseTorse;
import com.bowser.robotic.common.techne.Guardian;
import com.bowser.robotic.common.tileentity.TileEntityBlockPipeTest;
import com.bowser.robotic.common.tileentity.TileEntityChargeurSansNoyau;
import com.bowser.robotic.common.tileentity.TileEntityFourArc;
import com.bowser.robotic.common.tileentity.TileEntityPipe;
import com.bowser.robotic.proxy.TESRInventoryRenderer.TESRIndex;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
    
    @Override
    public void registerRender()
    {
        System.out.println("methode cote client"); 
        
        renderInventoryTESRId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new TESRInventoryRenderer());
        
        RenderingRegistry.registerEntityRenderingHandler(EntityGuardian.class, new RenderGuardian(new Guardian(), 0.5F));
        
        //TEST
        BaseTorse custom_armor = new BaseTorse(-1F);
        BaseTorse custom_legs = new BaseTorse(-1F);
        
        armorModels.put(Robotic.exoSqueletteBaseHelmet, custom_armor);
        armorModels.put(Robotic.exoSqueletteBaseTorse, custom_armor);
        armorModels.put(Robotic.exoSqueletteBaseLegs, custom_legs);
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
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockPipeTest.class, new TileEntityBlockPipeTestSpecialRender());
    
    
        TESRInventoryRenderer.blockByTESR.put(new TESRIndex(Robotic.fourArc, 0), new TileEntityFourArcSpecialRender());
        TESRInventoryRenderer.blockByTESR.put(new TESRIndex(Robotic.chargeurSansNoyau, 0), new TileEntityChargeurSansNoyauSpecialRender());
        TESRInventoryRenderer.blockByTESR.put(new TESRIndex(Robotic.pipetest, 0), new TileEntityBlockPipeTestSpecialRender());
    }
    
    public ModelBiped getArmorModel(int id){ 
        return null; 
        
    }
}
