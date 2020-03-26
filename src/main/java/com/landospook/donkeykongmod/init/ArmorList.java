package com.landospook.donkeykongmod.init;

import com.landospook.donkeykongmod.Main;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;

public enum ArmorList implements IArmorMaterial
{
	TIE("tie", 1000000, new int[] {0, 0, 1, 0}, 25, ItemList.CRYSTAL_COCONUT, "item.armor.equip_leather", 0f);
	
	private static final int[] max_damage_array = new int[] {1, 1, 1, 1};
	private String name, equipSound;
	private int durability, enchantability;
	private RegistryObject<Item> repairItem;
	private int[] damageReductionAmount;
	private float toughness;
	
// pbbbbbbbbbbbbbbbbbbbbbbbt //
	
	private ArmorList(String name, int durability, int[] damageReductionAmount, int enchantability, RegistryObject<Item> repairItem, String equipSound, float toughness)
	{
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmount = damageReductionAmount;
		this.toughness = toughness;
		
	}
	@Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return max_damage_array[slotIn.getIndex()] * this.durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(this.repairItem.get());
    }

    @Override
    public String getName()
    {
        return Main.MODID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }
}