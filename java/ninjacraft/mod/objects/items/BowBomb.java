package ninjacraft.mod.objects.items;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;

public class BowBomb extends ItemBow implements IHasModel {

	public BowBomb(String name) {

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ninjacraftcombat);
		setMaxDamage(10);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);

	}

	@Override
	public int getItemEnchantability() {

		return 10;

	}
	
	@Override
	protected boolean isArrow(ItemStack stack) {
		
		if(stack.getItem() == ItemInit.ARROW_BOMB) {
			return true;
		}
		return false;
	}
	

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
