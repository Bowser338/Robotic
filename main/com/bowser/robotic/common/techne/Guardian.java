package com.bowser.robotic.common.techne;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Guardian extends ModelBase
{
  //fields
    ModelRenderer jambe;
    ModelRenderer jambed;
    ModelRenderer pied;
    ModelRenderer piedd;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer epaule_gauche;
    ModelRenderer avant_bras;
    ModelRenderer avant_brasd;
    ModelRenderer epaule_droite;
    ModelRenderer base_cou;
  
  public Guardian()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      jambe = new ModelRenderer(this, 0, 0);
      jambe.addBox(0F, 0F, 0F, 3, 8, 4);
      jambe.setRotationPoint(2.5F, 16F, -3F);
      jambe.setTextureSize(64, 32);
      jambe.mirror = true;
      setRotation(jambe, 0.122173F, 0F, 0F);
      jambed = new ModelRenderer(this, 0, 0);
      jambed.addBox(0F, 0F, 0F, 3, 8, 4);
      jambed.setRotationPoint(-5.5F, 16F, -3F); 
      jambed.setTextureSize(64, 32);
      jambed.mirror = true;
      setRotation(jambed, 0.122173F, 0F, 0F);
      pied = new ModelRenderer(this, 0, 0);
      pied.addBox(0F, 0F, 0F, 4, 3, 5);
      pied.setRotationPoint(2F, 21F, -3F); //(2F, 21F, -3F)
      pied.setTextureSize(64, 32);
      pied.mirror = true;
      setRotation(pied, 0F, 0F, 0F);
      piedd = new ModelRenderer(this, 0, 0);
      piedd.addBox(0F, 0F, 0F, 4, 3, 5);
      piedd.setRotationPoint(-6F, 21F, -3F); //(-6F, 21F, -3F)
      piedd.setTextureSize(64, 32);
      piedd.mirror = true;
      setRotation(piedd, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 8, 2, 6);
      Shape1.setRotationPoint(-4F, -10F, -3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape2.setRotationPoint(2F, -10F, -3.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape3.setRotationPoint(-4F, -10F, -3.5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-4F, 0F, -2F, 12, 13, 8);
      body.setRotationPoint(-2F, -3F, -2F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.1919862F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-4F, 0F, -2F, 4, 10, 4);
      rightarm.setRotationPoint(-8F, -5F, 1F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.1745329F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(0F, 0F, -2F, 4, 10, 4);
      leftarm.setRotationPoint(8F, -5F, 1F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.1745329F);
      rightleg = new ModelRenderer(this, 0, 0);
      rightleg.addBox(0F, 0F, 0F, 4, 7, 4);
      rightleg.setRotationPoint(-6F, 9F, -1F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, -0.296706F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 0);
      leftleg.addBox(0F, 0F, 0F, 4, 7, 4);
      leftleg.setRotationPoint(2F, 9F, -1F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, -0.296706F, 0F, 0F);
      epaule_gauche = new ModelRenderer(this, 0, 0);
      epaule_gauche.addBox(-11F, 0F, 0F, 11, 3, 6);
      epaule_gauche.setRotationPoint(14F, -7F, -2F);
      epaule_gauche.setTextureSize(64, 32);
      epaule_gauche.mirror = true;
      setRotation(epaule_gauche, 0F, 0F, 0.1570796F);
      avant_bras = new ModelRenderer(this, 0, 0);
      avant_bras.addBox(0F, 0F, 0F, 3, 9, 4);
      avant_bras.setRotationPoint(10F, 3F, -1F);
      avant_bras.setTextureSize(64, 32);
      avant_bras.mirror = true;
      setRotation(avant_bras, -0.5235988F, 0F, 0F);
      avant_brasd = new ModelRenderer(this, 0, 0);
      avant_brasd.addBox(0F, 0F, 0F, 3, 9, 4);
      avant_brasd.setRotationPoint(-13F, 3F, -1F);
      avant_brasd.setTextureSize(64, 32);
      avant_brasd.mirror = true;
      setRotation(avant_brasd, -0.5235988F, 0F, 0F);
      epaule_droite = new ModelRenderer(this, 0, 0);
      epaule_droite.addBox(0F, 0F, 0F, 11, 3, 6);
      epaule_droite.setRotationPoint(-14F, -7F, -2F);
      epaule_droite.setTextureSize(64, 32);
      epaule_droite.mirror = true;
      setRotation(epaule_droite, 0F, 0F, -0.1570796F);
      base_cou = new ModelRenderer(this, 3, 18);
      base_cou.addBox(0F, 0F, -4F, 12, 6, 8);
      base_cou.setRotationPoint(-6F, -8.7F, 0F);
      base_cou.setTextureSize(64, 32);
      base_cou.mirror = true;
      setRotation(base_cou, 0.0174533F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    jambe.render(f5);
    jambed.render(f5);
    pied.render(f5);
    piedd.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    epaule_gauche.render(f5);
    avant_bras.render(f5);
    avant_brasd.render(f5);
    epaule_droite.render(f5);
    base_cou.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
      
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    //this.rightleg.rotateAngleX = MathHelper.cos((180F / (float)Math.PI)) * -3.8F * f1;
    //this.leftleg.rotateAngleX = MathHelper.cos((180F / (float)Math.PI)) * 3.8F * f1;
    
    //TEST
    //this.rightleg.rotateAngleX = MathHelper.cos(f * -0.296706F) * 1.4F * f1; //1.4F
    //this.piedd.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    //this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    //this.pied.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    //this.rightleg.rotateAngleY = 0.0F;
    //this.leftleg.rotateAngleY = 0.0F;
    //this.pied.rotateAngleY = 0.0F;
    //this.piedd.rotateAngleY = 0.0F;
    //this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    //this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}