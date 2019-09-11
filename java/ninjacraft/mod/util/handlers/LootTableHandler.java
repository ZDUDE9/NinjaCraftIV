package ninjacraft.mod.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import ninjacraft.mod.util.Reference;


public class LootTableHandler {


	public static final ResourceLocation MASTER = LootTableList.register(new ResourceLocation(Reference.MODID, "master"));
	public static final ResourceLocation SCOUT = LootTableList.register(new ResourceLocation(Reference.MODID, "scout"));
	public static final ResourceLocation ARCHER = LootTableList.register(new ResourceLocation(Reference.MODID, "archer"));
		
	}

