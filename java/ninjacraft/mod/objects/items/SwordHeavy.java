package ninjacraft.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;

public class SwordHeavy extends ItemSword implements IHasModel {

	
	
	
	public SwordHeavy(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ninjacraftcombat);
		
		ItemInit.ITEMS.add(this);
		
		
		
		
		
	}


	
	
	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}


	

}
