package com.bowser.robotic.common.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.bowser.robotic.common.Robotic;
import com.bowser.robotic.proxy.ClientProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExoSqueletteBase extends ItemArmor {

    public ExoSqueletteBase(ArmorMaterial material, int render_idx, int type)
    {
        super(material, render_idx, type);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(1);
        this.setCreativeTab(Robotic.baseRoboticCreativeTabs);
        
    }
    
    
    //TEST
    
    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Robotic.modid, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack){
        return String.format("item.%s%s", Robotic.modid, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){       
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.') + 1));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel (EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot){
        
        ModelBiped armorModel = ClientProxy.armorModels.get(this);
        
        if(armorModel != null){
            armorModel.bipedHead.showModel = armorSlot == 0;
            armorModel.bipedHeadwear.showModel = false;
            armorModel.bipedBody.showModel = armorSlot == 1 /**|| armorSlot == 2*/;
            armorModel.bipedRightArm.showModel = armorSlot == 1;
            armorModel.bipedLeftArm.showModel = armorSlot == 1;
            armorModel.bipedRightLeg.showModel = armorSlot == 2 /**|| armorSlot == 3*/;
            armorModel.bipedLeftLeg.showModel = armorSlot == 2 /**|| armorSlot == 3*/;
            
            armorModel.isSneak = entityLiving.isSneaking();
            armorModel.isRiding = entityLiving.isRiding();
            armorModel.isChild = entityLiving.isChild();
            
            armorModel.heldItemRight = 0;
            armorModel.aimedBow = false;
            
            EntityPlayer player = (EntityPlayer)entityLiving;
            
            ItemStack held_item = player.getEquipmentInSlot(0);
            
            if (held_item != null){
                armorModel.heldItemRight = 1;
                
                if (player.getItemInUseCount() > 0){
                    
                    EnumAction enumaction = held_item.getItemUseAction();
                    
                    if (enumaction == EnumAction.bow){
                        armorModel.aimedBow = true;
                    }else if (enumaction == EnumAction.block){
                        armorModel.heldItemRight = 3;
                    }
                    
                    
                }
                
            }
            
            
        }
        
        
        return armorModel;
    }
    
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
        
        String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
        name = name.substring(0, name.indexOf('_'));
        
        return String.format("roboticmod:textures/models/armor/armor.png", Robotic.modid, name, slot == 2 ? 2 : 1);  //"roboticmod:textures/models/armor/armor.png"
    }
    
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(this.armorType == 1)
        {
            //player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 10));
        }
        
        if(this.armorType == 2 && player.isSprinting() && player.onGround)
        {
            player.motionX *= 1.3F;
            player.motionZ *= 1.3F;
        }
        
        if(this.armorType == 2)
        {
            //player.motionY *= 1.2F;
        	player.addPotionEffect(new PotionEffect(Potion.jump.id, 20, 1));
        }
        
        EntityPlayer entityplayer = (EntityPlayer)world.playerEntities.get(0);
        if( entityplayer.inventory.getStackInSlot(entityplayer.inventory.currentItem) != null && this.armorType == 1)
        {
            String item = entityplayer.inventory.getStackInSlot(entityplayer.inventory.currentItem).toString();
            String check = new ItemStack(Robotic.MKIsword).toString();
            if( item.equals(check) )
            {
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
            }
            else
            {

            }
        }
        else
        {

        }
        
        if( entityplayer.inventory.getStackInSlot(entityplayer.inventory.currentItem) != null && this.armorType == 1)
        {
            String item = entityplayer.inventory.getStackInSlot(entityplayer.inventory.currentItem).toString();
            String check = new ItemStack(Robotic.MKIIsword).toString();
            if( item.equals(check) )
            {
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 1));
            }
            else
            {

            }
        }
        else
        {

        }
        
        
        
    }
    
}
