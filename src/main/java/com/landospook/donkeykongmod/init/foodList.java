package com.landospook.donkeykongmod.init;

import com.landospook.donkeykongmod.Main;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class foodList extends Item
{
	public foodList(String name, int hunger, float saturation, ItemGroup DonkeyKongItemGroup)
	{
		super(new Properties().group(DonkeyKongItemGroup).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
		this.setRegistryName(new ResourceLocation(Main.MODID, name));
	}
	
	public static Food banana_food = (new Food.Builder()).hunger((int) 4).saturation(0.7f).build();
	public static Food banana_barrel_food = (new Food.Builder()).hunger((int) 10).saturation(1f).build();
	public static Food enchanted_banana_food = (new Food.Builder()).hunger((int) 6).saturation(0.9f).build();
}
