package ninjacraft.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import ninjacraft.mod.Main;
import ninjacraft.mod.objects.armor.DragonArmor;
import ninjacraft.mod.objects.armor.MasterArmor2;
import ninjacraft.mod.objects.armor.MasterArmor3;
import ninjacraft.mod.objects.armor.Master_Armor;
import ninjacraft.mod.objects.armor.NinjaArmor2;
import ninjacraft.mod.objects.armor.Ninja_Armor;
import ninjacraft.mod.objects.items.ArrowBomb;
import ninjacraft.mod.objects.items.ArrowSharpened;
import ninjacraft.mod.objects.items.BladeKatana;
import ninjacraft.mod.objects.items.BowBomb;
import ninjacraft.mod.objects.items.BowDouble;
import ninjacraft.mod.objects.items.Dagger;
import ninjacraft.mod.objects.items.DyeBlack;
import ninjacraft.mod.objects.items.HandleSteel;
import ninjacraft.mod.objects.items.HandleWooden;
import ninjacraft.mod.objects.items.IronMelted;
import ninjacraft.mod.objects.items.Knuckles;
import ninjacraft.mod.objects.items.LeatherReinforced;
import ninjacraft.mod.objects.items.PieceBladeLarge;
import ninjacraft.mod.objects.items.Rope;
import ninjacraft.mod.objects.items.Scythe;
import ninjacraft.mod.objects.items.Steel;
import ninjacraft.mod.objects.items.SwordHeavy;
import ninjacraft.mod.util.Reference;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* Materials  */
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 2, 379, 7.0F, 2.5F, 22);
	public static final ToolMaterial TOOL_OBSIDIAN = EnumHelper.addToolMaterial("tool_obsidian", 3, 1623, 10.0F, 3.5F, 7);
	public static final ToolMaterial TOOL_DAVE = EnumHelper.addToolMaterial("tool_dave", 2, 143, 5.5F, 2F, 17);

	public static final ArmorMaterial ARMOR_NINJA = EnumHelper.addArmorMaterial("ninja", Reference.MODID + "ninja", 18, new int[] {3, 5, 6, 3}, 23, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.1F);
	public static final ArmorMaterial ARMOR_NINJA_2 = EnumHelper.addArmorMaterial("ninja_2", Reference.MODID + ":ninja_2", 18, new int[] {3, 5, 6, 3}, 23, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.1F);
	public static final ArmorMaterial ARMOR_MASTER = EnumHelper.addArmorMaterial("master", Reference.MODID + ":master", 33, new int[] { 3, 6, 8, 3}, 19, SoundEvents.ENTITY_HORSE_SADDLE, 2.0F);
	public static final ArmorMaterial ARMOR_MASTER_2 = EnumHelper.addArmorMaterial("master_2", Reference.MODID + ":master_2", 33, new int[] { 3, 6, 8, 3}, 19, SoundEvents.ENTITY_HORSE_SADDLE, 2.0F);
	public static final ArmorMaterial ARMOR_MASTER_3 = EnumHelper.addArmorMaterial("master_3", Reference.MODID + ":master_3", 33, new int[] { 3, 6, 8, 3}, 19, SoundEvents.ENTITY_HORSE_SADDLE, 2.0F);
	public static final ArmorMaterial ARMOR_DRAGON = EnumHelper.addArmorMaterial("dragon", Reference.MODID + ":dragon", 33, new int[] { 3, 6, 8, 3}, 19, SoundEvents.ENTITY_HORSE_SADDLE, 2.0F);

	/* Items  */
	public static final Item ROPE = new Rope("rope");	
	public static final Item PIECE_BLADE_LARGE = new PieceBladeLarge ("piece_blade_large");	
	public static final Item HANDLE_WOODEN = new HandleWooden ("handle_wooden");	
	public static final Item HANDLE_STEEL = new HandleSteel ("handle_steel");	
	public static final Item STEEL = new Steel ("steel");	
	public static final Item LEATHER_REINFORCED = new LeatherReinforced ("leather_reinforced");	
	public static final Item IRON_MELTED = new IronMelted ("iron_melted");	
	public static final Item DYE_BLACK = new DyeBlack ("dye_black");	
	
	/* Weapons  */
	public static final Item BLADE_KATANA = new BladeKatana("blade_katana", TOOL_STEEL);	
	public static final Item SWORD_HEAVY = new SwordHeavy("sword_heavy", TOOL_OBSIDIAN);	
	public static final Item SCYTHE = new Scythe("scythe", TOOL_OBSIDIAN);	
	public static final Item DAGGER = new Dagger("dagger", TOOL_DAVE);	
	public static final Item KNUCKLES = new Knuckles("knuckles", TOOL_DAVE);	
		
	/* Armor  */
	public static final Item HELMET_NINJA = new Ninja_Armor("helmet_ninja", Main.ninjacraftcombat, ARMOR_NINJA, 1, EntityEquipmentSlot.HEAD);	
	public static final Item CHESTPLATE_NINJA = new Ninja_Armor("chestplate_ninja", Main.ninjacraftcombat, ARMOR_NINJA, 1, EntityEquipmentSlot.CHEST);	
	public static final Item LEGGINGS_NINJA = new Ninja_Armor("leggings_ninja", Main.ninjacraftcombat, ARMOR_NINJA, 2, EntityEquipmentSlot.LEGS);	
	public static final Item BOOTS_NINJA = new Ninja_Armor("boots_ninja", Main.ninjacraftcombat, ARMOR_NINJA, 1, EntityEquipmentSlot.FEET);	
	
	public static final Item HELMET_NINJA_2 = new NinjaArmor2("helmet_ninja_2", Main.ninjacraftcombat, ARMOR_NINJA_2, 1, EntityEquipmentSlot.HEAD);	
	public static final Item CHESTPLATE_NINJA_2 = new NinjaArmor2("chestplate_ninja_2", Main.ninjacraftcombat, ARMOR_NINJA_2, 1, EntityEquipmentSlot.CHEST);	
	public static final Item LEGGINGS_NINJA_2 = new NinjaArmor2("leggings_ninja_2", Main.ninjacraftcombat, ARMOR_NINJA_2, 2, EntityEquipmentSlot.LEGS);	
	public static final Item BOOTS_NINJA_2 = new NinjaArmor2("boots_ninja_2", Main.ninjacraftcombat, ARMOR_NINJA_2, 1, EntityEquipmentSlot.FEET);	
	
	public static final Item HELMET_MASTER = new Master_Armor("helmet_master", Main.ninjacraftcombat, ARMOR_MASTER, 1, EntityEquipmentSlot.HEAD);	
	public static final Item CHESTPLATE_MASTER = new Master_Armor("chestplate_master", Main.ninjacraftcombat, ARMOR_MASTER, 1, EntityEquipmentSlot.CHEST);	
	public static final Item LEGGINGS_MASTER = new Master_Armor("leggings_master", Main.ninjacraftcombat, ARMOR_MASTER, 2, EntityEquipmentSlot.LEGS);	
	public static final Item BOOTS_MASTER = new Master_Armor("boots_master", Main.ninjacraftcombat, ARMOR_MASTER, 1, EntityEquipmentSlot.FEET);	
	
	public static final Item HELMET_MASTER_2 = new MasterArmor2("helmet_master_2", Main.ninjacraftcombat, ARMOR_MASTER_2, 1, EntityEquipmentSlot.HEAD);	
	public static final Item CHESTPLATE_MASTER_2 = new MasterArmor2("chestplate_master_2", Main.ninjacraftcombat, ARMOR_MASTER_2, 1, EntityEquipmentSlot.CHEST);	
	public static final Item LEGGINGS_MASTER_2 = new MasterArmor2("leggings_master_2", Main.ninjacraftcombat, ARMOR_MASTER_2, 2, EntityEquipmentSlot.LEGS);	
	
	public static final Item CHESTPLATE_MASTER_3 = new MasterArmor3("chestplate_master_3", Main.ninjacraftcombat, ARMOR_MASTER_3, 1, EntityEquipmentSlot.CHEST);	
	public static final Item LEGGINGS_MASTER_3 = new MasterArmor3("leggings_master_3", Main.ninjacraftcombat, ARMOR_MASTER_3, 2, EntityEquipmentSlot.LEGS);	

	public static final Item DRAGON_HELMET = new DragonArmor("helmet_dragon", Main.ninjacraftcombat, ARMOR_DRAGON, EntityEquipmentSlot.HEAD);
	
	
	public static final Item BOW_DOUBLE = new BowDouble("bow_double");
	public static final Item BOW_BOMB = new BowBomb("bow_bomb");
//	public static final Item BOW_ICE = new BowIce("bow_ice");
//	public static final Item BOW_WITHER = new BowWither("bow_wither");
	public static final Item ARROW_SHARPENED = new ArrowSharpened("arrow_sharpened");
	public static final Item ARROW_BOMB = new ArrowBomb("arrow_bomb");
//	public static final Item ARROW_BOMB = new ArrowSharpened("arrow_sharpened");
	//public static final Item ARROW_BOMB = new ArrowSharpened("arrow_sharpened");
	
}
