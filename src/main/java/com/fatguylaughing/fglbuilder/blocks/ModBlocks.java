package com.fatguylaughing.fglbuilder.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block modBlock;

	public static void createBlocks() {
		GameRegistry.registerBlock(modBlock = new BasicBlock("test_block"), "test_block");
	}
}
