package com.bowser.robotic.proxy;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.bowser.robotic.common.Robotic;

public class TileEntityRenderPipe extends TileEntitySpecialRenderer
{
    
    //ResourceLocation texture = new ResourceLocation(Robotic.modid, "textures/blocks/pipe");
    public static final ResourceLocation textureLocation = new ResourceLocation(Robotic.modid, "textures/blocks/pipe.png");
    float pixel = 1F/16;
    float texturePixel = 1F/32F;
    
    @Override
    public void renderTileEntityAt(TileEntity tileentity, double translationX, double translationY, double translationZ, float f)
    {
        GL11.glPushMatrix();
       //System.out.println("YOLO"); 
        GL11.glTranslated(translationX, translationY, translationZ);
        GL11.glDisable(GL11.GL_LIGHTING);
        this.bindTexture(textureLocation);
        drawCore(tileentity);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glTranslated(-translationX, -translationY, -translationZ);
        GL11.glPopMatrix();
    }
    
    public void drawCore(TileEntity tileentity) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
        tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 1-11*pixel/2, 5*texturePixel, 5*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 5*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 0*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 11*pixel/2, 1-11*pixel/2, 0*texturePixel, 5*texturePixel);
        
        tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 11*pixel/2, 5*texturePixel, 5*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 11*pixel/2, 5*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 0*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 1-11*pixel/2, 0*texturePixel, 5*texturePixel);
        
        tessellator.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 1-11*pixel/2, 5*texturePixel, 5*texturePixel);
        tessellator.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 5*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 0*texturePixel, 0*texturePixel);
        tessellator.addVertexWithUV(11*pixel/2, 11*pixel/2, 1-11*pixel/2, 0*texturePixel, 5*texturePixel);
        }
        tessellator.draw();
    }

}
