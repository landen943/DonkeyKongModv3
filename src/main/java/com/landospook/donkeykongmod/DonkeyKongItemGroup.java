package com.landospook.donkeykongmod;

import com.landospook.donkeykongmod.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DonkeyKongItemGroup extends ItemGroup
{	
	public static final DonkeyKongItemGroup donkeykong = new DonkeyKongItemGroup(ItemGroup.GROUPS.length, "donkeykong");
	
	public DonkeyKongItemGroup(int index, String label)
	{
		super(index, label);
	}
	
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemList.BANANA.get());
	}
}