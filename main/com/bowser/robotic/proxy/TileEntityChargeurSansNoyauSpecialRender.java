package com.bowser.robotic.proxy;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.bowser.robotic.client.IInventoryRenderer;
import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.techne.ChargeurSansNoyau;
import com.bowser.robotic.common.tileentity.TileEntityChargeurSansNoyau;

public class TileEntityChargeurSansNoyauSpecialRender extends TileEntitySpecialRenderer implements IInventoryRenderer
{
    private final ChargeurSansNoyau model = new ChargeurSansNoyau();
    public static final ResourceLocation textureLocation = new ResourceLocation(Robotic.modid, "textures/blocks/chargeur_sans_noyau.png");


    public TileEntityChargeurSansNoyauSpecialRender()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }
    
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick)
    {
        this.renderTileEntityChargeurSansNoyauAt((TileEntityChargeurSansNoyau)te, x, y, z, tick);

    }

    @Override
    public void renderInventory(double x, double y, double z)
    {
        this.renderTileEntityChargeurSansNoyauAt(null, x, y, z, 0.0F);
        
    }
    
    public void renderTileEntityChargeurSansNoyauAt(TileEntityChargeurSansNoyau te, double x, double y, double z, float tick)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);
        this.bindTexture(textureLocation);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.model.render(0.0625F);
        GL11.glPopMatrix();
        
    }

}
