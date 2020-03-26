package com.landospook.donkeykongmod.init;

import com.landospook.donkeykongmod.DonkeyKongItemGroup;
import com.landospook.donkeykongmod.Main;
import com.landospook.donkeykongmod.objects.items.CustomMusicDiscItem;
import com.landospook.donkeykongmod.objects.items.GlowingItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList 
{	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties().food(foodList.banana_food).group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> BANANA_BARREL = ITEMS.register("banana_barrel", () -> new Item(new Item.Properties().food(foodList.banana_barrel_food).group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> ENCHANTED_BANANA = ITEMS.register("enchanted_banana", () -> new GlowingItem(new Item.Properties().food(foodList.enchanted_banana_food).group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> CRYSTAL_COCONUT = ITEMS.register("crystal_coconut", () -> new GlowingItem(new Item.Properties().group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> TIE = ITEMS.register("tie", () -> new ArmorItem(ArmorList.TIE, EquipmentSlotType.CHEST, new Item.Properties().group(DonkeyKongItemGroup.donkeykong)));
	
	public static final RegistryObject<Item> DONKEY_KONG_64 = ITEMS.register("donkey_kong_64", () -> new CustomMusicDiscItem(7, SoundList.DK_RAP, new Item.Properties().maxStackSize(1).group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> DONKEY_KONG_COUNTRY = ITEMS.register("donkey_kong_country", () -> new CustomMusicDiscItem(7, SoundList.DK_RAP, new Item.Properties().maxStackSize(1).group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> GAMEBOY = ITEMS.register("gameboy", () -> new Item(new Item.Properties().group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> SNES_CONTROLLER = ITEMS.register("snes_controller", () -> new Item(new Item.Properties().group(DonkeyKongItemGroup.donkeykong)));
	public static final RegistryObject<Item> NES_CONTROLLER = ITEMS.register("nes_controller", () -> new Item(new Item.Properties().group(DonkeyKongItemGroup.donkeykong)));
}