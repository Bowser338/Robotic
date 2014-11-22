package com.bowser.robotic.proxy;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.bowser.robotic.client.IInventoryRenderer;
import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.techne.FourArc;
import com.bowser.robotic.common.techne.Pipe;
import com.bowser.robotic.common.tileentity.TileEntityBlockPipeTest;
import com.bowser.robotic.common.tileentity.TileEntityFourArc;

public class TileEntityBlockPipeTestSpecialRender extends TileEntitySpecialRenderer implements IInventoryRenderer
{
    
    private final Pipe model = new Pipe();

    public static final ResourceLocation textureLocation = new ResourceLocation(Robotic.modid, "textures/blocks/pipetest.png");

    public TileEntityBlockPipeTestSpecialRender()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

    @Override
    public void renderInventory(double x, double y, double z)
    {
        this.renderTileEntityBlockPipeTestAt(null, x, y, z, 0.0F);
        
    }
    
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f)
    {
        this.renderTileEntityBlockPipeTestAt((TileEntityBlockPipeTest)te, x, y, z, f);

    }
    
    
    
    public void renderTileEntityBlockPipeTestAt(TileEntityBlockPipeTest te, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);
        this.bindTexture(textureLocation);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        if(te!= null) 
        {   
            this.model.core(0.0625F, te.getWorldObj(), (int)x, (int)y, (int)z);
        }
        
        
        GL11.glPopMatrix();
    }
    





    
    

}