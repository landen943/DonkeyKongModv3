package com.landospook.donkeykongmod;

import com.landospook.donkeykongmod.init.ItemList;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("donkeykongmod")
public class Main 
{

	public static final String MODID = "donkeykongmod";
	public static Main instance;
	
	public Main() 
	{
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientRegistries);
		
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
		ItemList.ITEMS.register(modEventBus);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		
	}
	
	private void clientRegistries(final FMLClientSetupEvent event)
	{
		
	}
	
	public void Server(final FMLServerStartingEvent event)
	{
		
	}
	
	public void loadComplete(final FMLLoadCompleteEvent event)
	{
		
	}
	
}
