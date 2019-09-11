package ninjacraft.mod.objects.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ninjacraft.mod.Main;
import ninjacraft.mod.entities.projectiles.EntityArrowBomb;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.IHasModel;

public class ArrowBomb extends ItemArrow implements IHasModel {
	public ArrowBomb(String name) {

			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.ninjacraftcombat);


			ItemInit.ITEMS.add(this);

		}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		
		EntityArrowBomb entityArrowBomb = new EntityArrowBomb(worldIn, shooter);
		return entityArrowBomb;
		
	}
	
	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
