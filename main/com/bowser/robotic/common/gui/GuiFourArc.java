package com.bowser.robotic.common.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.I18n;
import org.lwjgl.opengl.GL11;

import com.bowser.robotic.common.container.ContainerFourArc;
import com.bowser.robotic.common.tileentity.TileEntityFourArc;

	public class GuiFourArc extends GuiContainer{
		public static final ResourceLocation texture = new ResourceLocation("roboticmod", "textures/gui/arc_furnace.png");
		
		public TileEntityFourArc tileFurnace;
		
		public GuiFourArc(InventoryPlayer invPlayer, TileEntityFourArc entity) {
			super(new ContainerFourArc(invPlayer, entity));
			
			this.tileFurnace = entity;

			this.xSize = 176;
			this.ySize = 165;
		}
		
		public void drawGuiContainerForegroundLayer(int par1, int par2){
			String s = this.tileFurnace.isInvNameLocalized() ? this.tileFurnace.getInvName() : I18n.format(this.tileFurnace.getInvName());
			this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
			this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
		}
		
		public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
			GL11.glColor4f(1F, 1F, 1F, 1F);
			
			Minecraft.getMinecraft().getTextureManager().
			bindTexture(texture);
			
			drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
			
			int i1;

			if(this.tileFurnace.hasPower()){
				i1 = this.tileFurnace.getPowerRemainingScaled(45);
				this.drawTexturedModalRect(guiLeft + 8, guiTop + 53 - i1, 176, 62 - i1, 16, i1);
			}
			
			i1 = this.tileFurnace.getCookProgressScaled(24);
			this.drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 0, i1 + 1, 16);
		}
	}