package ninjacraft.mod.objects.items;

import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;

public class BladeKatana extends ItemSword implements IHasModel {
	
	
	@Nullable
    private float scale = 1.0f;

	

	public BladeKatana(String name, ToolMaterial material) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ninjacraftcombat);

		ItemInit.ITEMS.add(this);
		
		this.setScale(10);

		
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}


	    public Item setScale(float scale) {
	        this.scale = scale;
	        return this;
	    }


}
