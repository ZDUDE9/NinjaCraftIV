package ninjacraft.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.BlockInit;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;

public class Lantern extends Block implements IHasModel 
{

	public Lantern(String name, Material material)
	{
		 
		 super(material);
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(Main.ninjacraftmaterials);
		 
		 BlockInit.BLOCKS.add(this);
		 ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		 
	 }
	
	
	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
	
	

 