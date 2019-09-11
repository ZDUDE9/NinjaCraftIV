package ninjacraft.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ninjacraft.mod.init.ItemInit;

public class NinjaCraftMaterials extends CreativeTabs 
{

	public NinjaCraftMaterials(String label) { super ("ninjacraftmaterials");
	this.setBackgroundImageName("ninjacraftmaterials.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.ROPE); }
	
}
