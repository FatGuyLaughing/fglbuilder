package com.fatguylaughing.fglbuilder;

import com.fatguylaughing.fglbuilder.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The following @Mod annotation informs Forge that the following class is a mod.
 */
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION)
public class Main {
	public static final String MODID = "fglbuilder";
	public static final String MODNAME = "FGL Builder";
	public static final String MODVERSION = "1.0.0";

	// Forge uses this instance to have a reference to your mod in order to communicate with it.
	// If we don't create the instance on our own, Forge creates one for us. The problem with Forge creating the
	// instance for us is that we will not have access to the instance anymore.
	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "com.fatguylaughing.fglbuilder.proxies.ClientProxy", serverSide = "com.fatguylaughing.fglbuilder.proxies.ServerProxy")
	public static CommonProxy proxy;

	// The preInit handler is called at the begging of the startup. In this method we read the config file, create
	// blocks, items, etc. and register them with the GameRegistry.
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}

	// The init Handler is called after the preInit Handler. In this method we can build up data structures, add
	// Crafting Recipes and register new handler.
	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
	}

	// The postInit Handler is called at the very end. Its used to communicate with other mods and adjust your setup
	// based on this.
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
}
