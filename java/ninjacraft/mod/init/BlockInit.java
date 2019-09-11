package ninjacraft.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ninjacraft.mod.objects.blocks.Lantern;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LANTERN = new Lantern("lantern", Material.GLASS);
}
