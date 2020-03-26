package com.landospook.donkeykongmod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("donkeykongmod")
public class SoundList 
{
	public static final SoundEvent DK_RAP = register("music_disc.dk_rap");
	
	private static SoundEvent register(String key)
	{
		return Registry.register(Registry.SOUND_EVENT, key, new SoundEvent(new ResourceLocation(key)));
	}
}
