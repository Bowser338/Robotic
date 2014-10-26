package com.bowser.roboticgithub.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.bowser.robotic.common.ContainerFourArc;
import com.bowser.robotic.common.GuiFourArc;
import com.bowser.robotic.common.TileEntityFourArc;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public GuiHandler (){
        
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0){
            TileEntityFourArc tileEntityFourArc = (TileEntityFourArc) world.getTileEntity(x, y, z);
            return new ContainerFourArc(player.inventory, tileEntityFourArc);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0){
            TileEntityFourArc ContainerFourArc = (TileEntityFourArc) world.getTileEntity(x, y, z);
            return new GuiFourArc(player.inventory, ContainerFourArc);
        }
        return null;
    }
    

    


}