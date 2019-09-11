package ninjacraft.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.proxy.ClientProxy;
import ninjacraft.mod.util.IHasModel;

public class PieceBladeLarge extends Item implements IHasModel
{

	public PieceBladeLarge(String name) {
		
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
