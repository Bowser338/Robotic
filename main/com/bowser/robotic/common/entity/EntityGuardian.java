package com.bowser.robotic.common.entity;

import java.util.UUID;

import com.bowser.robotic.common.Robotic;

import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.ZombieEvent.SummonAidEvent;

public class EntityGuardian extends EntityMob
{
    private boolean field_146076_bu = false;
    private float field_146074_bv = -1.0F;
    private float field_146073_bw;

    protected static final IAttribute field_110186_bp = (new RangedAttribute("zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).setDescription("Spawn Reinforcements Chance");
    
    public EntityGuardian(World world)
    {
        super(world);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
        this.setSize(0.6F, 1.8F);
    }
   
    
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
    }
    
    
    

    
    //TEST !!!!!!!!!!!!!!!!!!!
    
  
    protected boolean isAIEnabled()
    {
        return true;
    }
    
    public boolean func_146072_bX()
    {
        return this.field_146076_bu;
    }

    public void func_146070_a(boolean p_146070_1_)
    {
        if (this.field_146076_bu != p_146070_1_)
        {
            this.field_146076_bu = p_146070_1_;

        }
    }
    
    public boolean attackEntityAsMob(Entity entity)
    {
        this.worldObj.setEntityState(this, (byte)4);
        boolean flag = entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));

        if (flag)
        {
            entity.motionY += 0.1D;
        }

        this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
        return flag;
    }
    
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        if (!super.attackEntityFrom(p_70097_1_, p_70097_2_))
        {
            return false;
        }
        else
        {
            EntityLivingBase entitylivingbase = this.getAttackTarget();

            if (entitylivingbase == null && this.getEntityToAttack() instanceof EntityLivingBase)
            {
                entitylivingbase = (EntityLivingBase)this.getEntityToAttack();
            }

            if (entitylivingbase == null && p_70097_1_.getEntity() instanceof EntityLivingBase)
            {
                entitylivingbase = (EntityLivingBase)p_70097_1_.getEntity();
            }


            int i = MathHelper.floor_double(this.posX);
            int j = MathHelper.floor_double(this.posY);
            int k = MathHelper.floor_double(this.posZ);

            
            
            }

            return true;
        
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return null;
    }


    protected String getHurtSound()
    {
        return "mob.irongolem.hit";
    }
    
    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }
    
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.irongolem.walk", 1.0F, 1.0F);
    }

    protected Item getDropItem()
    {
        return Robotic.lithiumDust;
    }
}