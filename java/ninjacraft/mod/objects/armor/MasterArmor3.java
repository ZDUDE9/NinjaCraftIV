package ninjacraft.mod.objects.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.Actions;
import ninjacraft.mod.util.IHasModel;
import ninjacraft.mod.util.ydlibs.Conditions;

public class MasterArmor3 extends ItemArmor implements IHasModel {

	public MasterArmor3(String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);

		ItemInit.ITEMS.add(this);

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.HEAD) {

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.CHEST && Conditions.secondsGoneBy(world, 3)) {
			Actions.addPotionEffect(player, MobEffects.FIRE_RESISTANCE, 89, 3, false);

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.LEGS) {

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.FEET) {
			Actions.addPotionEffect(player, MobEffects.SPEED, 29, 1, false);
			Actions.addPotionEffect(player, MobEffects.JUMP_BOOST, 29, 1, false);
		}

		super.onArmorTick(world, player, itemStack);
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}

}
