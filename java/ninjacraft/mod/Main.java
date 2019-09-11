package ninjacraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ninjacraft.mod.proxy.CommonProxy;
import ninjacraft.mod.tabs.NinjaCraftCombat;
import ninjacraft.mod.tabs.NinjaCraftMaterials;
import ninjacraft.mod.util.Reference;
import ninjacraft.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;

	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs ninjacraftcombat = new NinjaCraftCombat("ninjacraftcombat");
	public static final CreativeTabs ninjacraftmaterials = new NinjaCraftMaterials("ninjacraftmaterials");


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries(event);

	}
}
