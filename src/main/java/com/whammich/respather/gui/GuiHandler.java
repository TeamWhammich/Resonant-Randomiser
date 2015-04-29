package com.whammich.respather.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {

	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return ID == 0 ? new ContainerBag(player.inventory) : null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return ID == 0 ? new GuiBasicBag(player.inventory) : null;
				
				//GuiBasicBag(player.getCurrentEquippedItem(), player) : null;
	}

}
