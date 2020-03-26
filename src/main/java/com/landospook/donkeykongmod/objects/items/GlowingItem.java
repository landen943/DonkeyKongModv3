package com.landospook.donkeykongmod.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GlowingItem extends Item
{
	public GlowingItem(Properties builder) 
	{
		super(builder);
	}
	
	@Override 
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
}
