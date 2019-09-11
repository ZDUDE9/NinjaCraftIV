package ninjacraft.mod.objects.items;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import ninjacraft.mod.Main;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.Actions;
import ninjacraft.mod.util.IHasModel;
import ninjacraft.mod.util.handlers.SoundsHandler;

public class Scythe extends ItemSword implements IHasModel {

	private float scale;



	public Scythe(String name, ToolMaterial material) {

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

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		Random random = new Random();
		int rand = random.nextInt(5) + 3;

		int chance = random.nextInt(100);

		if (chance <= 90 && chance >= 1) {

			Actions.playSound(target, SoundsHandler.ITEMS_DAGGER_EFFECT, 1, 10000);
			target.knockBack(target, 5, -target.motionX, -target.motionZ);

		}

		target.playSound(SoundsHandler.ITEMS_DAGGER_EFFECT, 1, 100);

		target.knockBack(target, 0.1F, -+target.motionX, -+target.motionZ);
		return super.hitEntity(stack, target, attacker);
	}

}
