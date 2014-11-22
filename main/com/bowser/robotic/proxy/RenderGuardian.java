package com.bowser.robotic.proxy;

import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.common.techne.Guardian;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;

public class RenderGuardian extends RenderLiving
{
    public RenderGuardian(Guardian par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        return new ResourceLocation(Robotic.modid, "textures/entity/guardian.png");
    }
    
    
}