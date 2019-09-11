package ninjacraft.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;
import ninjacraft.mod.util.ydlibs.LibRegistry;

public class Rope extends Item implements IHasModel
{

	public Rope(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ninjacraftmaterials);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}




}
