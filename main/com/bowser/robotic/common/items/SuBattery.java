package com.bowser.robotic.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SuBattery extends Item{
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		world.playSoundAtEntity(player, "roboticmod:defect", 1.0F, 1.0F);
		return stack;
	}
	

}
