package com.fatguylaughing.fglbuilder.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item modItem;

	public static void createItems() {
		GameRegistry.registerItem(modItem = new BasicItem("test_item"), "test_item");
	}
}
