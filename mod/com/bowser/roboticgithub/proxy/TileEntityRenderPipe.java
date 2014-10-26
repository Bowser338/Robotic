package com.bowser.roboticgithub.proxy;

import org.lwjgl.opengl.GL11;

import com.bowser.robotic.common.Robotic;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import com.bowser.robotic.common.Robotic;

public class TileEntityRenderPipe extends TileEntitySpecialRenderer
{
    
    ResourceLocation texture = new ResourceLocation(Robotic.modid, "textures/models/pipe2.png"); //(Robotic.modid, "textures/models/pipe.png")
    float pixel = 1F/16F;
    float texturePixel = 1F/32F;
    
    @Override
    public void renderTileEntityAt(TileEntity tileentity, double translationX, double translationY, double translationZ, float f)
    {
        GL11.glPushMatrix();
       //System.out.println("YOLO"); 
        GL11.glTranslated(translationX, translationY, translationZ);
        this.bindTexture(texture);
        drawCore(tileentity);
        GL11.glPopMatrix();
    }
    
    public void drawCore(TileEntity tileentity) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
        tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 11*pixel/2, 5*texturePixel, 5*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 11*pixel/2, 5*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 11*pixel/2, 0*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 11*pixel/2, 11*pixel/2, 0*texturePixel, 5*texturePixel);
        }
        tessellator.draw();
    }

}
