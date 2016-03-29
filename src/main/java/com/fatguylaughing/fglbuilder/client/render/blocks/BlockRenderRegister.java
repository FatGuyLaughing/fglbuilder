package com.fatguylaughing.fglbuilder.client.render.blocks;

import com.fatguylaughing.fglbuilder.Main;
import com.fatguylaughing.fglbuilder.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static String modid = Main.MODID;

	public static void registerBlockRenderer() {
		reg(ModBlocks.modBlock);
	}

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
