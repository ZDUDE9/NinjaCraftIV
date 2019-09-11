package ninjacraft.mod.objects.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
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

public class DragonArmor extends ItemArmor implements IHasModel {

	public DragonArmor(String name, CreativeTabs tab, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {

		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(1);

		ItemInit.ITEMS.add(this);

	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.getEquipmentSlot() == EntityEquipmentSlot.HEAD) {
		Actions.addPotionEffect(player, MobEffects.STRENGTH, 29, 1, false);

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.CHEST && Conditions.secondsGoneBy(world, 3)) {

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.LEGS) {

		} else if (this.getEquipmentSlot() == EntityEquipmentSlot.FEET) {

		}

		super.onArmorTick(world, player, itemStack);
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {

		if (itemStack != ItemStack.EMPTY) {

			if (itemStack.getItem() instanceof ItemArmor) {

				ModelDragonArmor model = new ModelDragonArmor();

				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;

				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;

				return model;

			}

		}

		return null;

	}

}
