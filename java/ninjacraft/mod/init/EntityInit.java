package ninjacraft.mod.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import ninjacraft.mod.Main;
import ninjacraft.mod.entities.EntityOniChief;
import ninjacraft.mod.entities.projectiles.EntityArrowBomb;
import ninjacraft.mod.entities.projectiles.EntityArrowSharpened;
import ninjacraft.mod.util.Reference;

public class EntityInit {
	
	public static void registerEntities()
	{
		registerEntity("oni_chief", EntityOniChief.class, Reference.ENTITY_ONI_CHIEF, 50, 000000, 000000);
		registerArrow("arrow_sharpened", EntityArrowSharpened.class, Reference.ENTITY_ARROW_SHARPENED);
		registerArrow("arrow_bomb", EntityArrowBomb.class, Reference.ENTITY_ARROW_BOMB);
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, 64, 20, true);
	}
	

}
