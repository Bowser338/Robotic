package com.bowser.robotic.proxy;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.bowser.robotic.client.IInventoryRenderer;
import com.bowser.robotic.common.FourArc;
import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.TileEntityFourArc;

public class TileEntityFourArcSpecialRender extends TileEntitySpecialRenderer implements IInventoryRenderer
{
    
    private final FourArc model = new FourArc();
    public static final ResourceLocation textureLocation = new ResourceLocation(Robotic.modid, "textures/blocks/fourarc.png");

    public TileEntityFourArcSpecialRender()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

    @Override
    public void renderInventory(double x, double y, double z)
    {
        this.renderTileEntityFourArcAt(null, x, y, z, 0.0F);
        
    }
    
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick)
    {
        // TODO Auto-generated method stub
        this.renderTileEntityFourArcAt((TileEntityFourArc)te, x, y, z, tick);

    }
    
    public void renderTileEntityFourArcAt(TileEntityFourArc te, double x, double y, double z, float tick)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);
        this.bindTexture(textureLocation);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        this.model.render(0.0625F);
        GL11.glPopMatrix();
    }
    
    

}
