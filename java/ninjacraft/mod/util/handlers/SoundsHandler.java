package ninjacraft.mod.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import ninjacraft.mod.util.Reference;

public class SoundsHandler 
{
	public static SoundEvent ITEMS_DAGGER_EFFECT, ENTITY_ONI_CHIEF_AMBIENT, ENTITY_ONI_CHIEF_HURT, ENTITY_ONI_CHIEF_DEATH;
	
	public static void registerSounds()
	{
		ITEMS_DAGGER_EFFECT = registerSound("items.dagger.effect");
		ENTITY_ONI_CHIEF_AMBIENT = registerSound("entity.oni_chief.ambient");
		ENTITY_ONI_CHIEF_HURT = registerSound("entity.oni_chief.hurt");
		ENTITY_ONI_CHIEF_DEATH = registerSound("entity.oni_chief.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
