// Date: 25/10/2014 11:52:47
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.bowser.robotic.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ChargeurSansNoyau extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape17;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ChargeurSansNoyau()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 47);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape1.setRotationPoint(-8F, 23F, -8F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 16);
      Shape2.addBox(0F, 0F, 0F, 1, 15, 16);
      Shape2.setRotationPoint(-8F, 8F, -8F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 16);
      Shape3.addBox(0F, 0F, 0F, 1, 15, 16);
      Shape3.setRotationPoint(7F, 8F, -8F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 47, 38);
      Shape4.addBox(0F, 0F, 0F, 3, 4, 4);
      Shape4.setRotationPoint(-7F, 13F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 47, 38);
      Shape5.addBox(-3F, 0F, 0F, 3, 4, 4);
      Shape5.setRotationPoint(7F, 13F, -2F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 14, 15, 1);
      Shape8.setRotationPoint(-7F, 8F, -8F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 46, 3);
      Shape9.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape9.setRotationPoint(-2F, 13F, -7F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 46, 9);
      Shape10.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape10.setRotationPoint(-2.5F, 14.5F, -6.6F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 31, 13);
      Shape11.addBox(0F, 0F, 0F, 14, 1, 1);
      Shape11.setRotationPoint(-7F, 14.5F, -7.6F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 65, 0);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape12.setRotationPoint(6.6F, 14.5F, -7F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 65, 0);
      Shape13.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape13.setRotationPoint(-7.6F, 14.5F, -7F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 47, 30);
      Shape14.addBox(0F, 0F, 0F, 4, 3, 4);
      Shape14.setRotationPoint(-2F, 20F, -2F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 58, 4);
      Shape15.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape15.setRotationPoint(-0.5F, 19F, -0.5F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 35, 22);
      Shape17.addBox(0F, 0F, 0F, 6, 1, 3);
      Shape17.setRotationPoint(-3F, 20F, 7F);
      Shape17.setTextureSize(64, 32);
      Shape17.mirror = true;
      setRotation(Shape17, -1.570796F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 67, 9);
      Shape6.addBox(0F, 0F, 0F, 14, 0, 15);
      Shape6.setRotationPoint(-7F, 8F, -7F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 66, 26);
      Shape7.addBox(0F, 0F, 0F, 14, 15, 0);
      Shape7.setRotationPoint(-7F, 8F, 8F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void render(float f)
  {
    Shape1.render(f);
    Shape2.render(f);
    Shape3.render(f);
    Shape4.render(f);
    Shape5.render(f);
    Shape8.render(f);
    Shape9.render(f);
    Shape10.render(f);
    Shape11.render(f);
    Shape12.render(f);
    Shape13.render(f);
    Shape14.render(f);
    Shape15.render(f);
    Shape17.render(f);
    Shape6.render(f);
    Shape7.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  


}