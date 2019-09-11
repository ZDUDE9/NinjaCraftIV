package ninjacraft.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ninjacraft.mod.init.ItemInit;

public class NinjaCraftCombat extends CreativeTabs 
{

	public NinjaCraftCombat(String label) { super ("ninjacraftcombat");
	this.setBackgroundImageName("ninjacraftcombat.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.HELMET_NINJA); }
	
}
