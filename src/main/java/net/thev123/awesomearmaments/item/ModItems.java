package net.thev123.awesomearmaments.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thev123.awesomearmaments.AwesomeArmaments;
import net.thev123.awesomearmaments.item.custom.*;

public class ModItems {

    //armor upgrades
    public static final Item PLATED_IRON_UPGRADE = registerItem("plated_iron_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item PLATED_DIAMOND_UPGRADE = registerItem("plated_diamond_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item PLATED_NETHERITE_UPGRADE = registerItem("plated_netherite_upgrade",
            new Item(new FabricItemSettings()));

    public static final Item WISE_IRON_UPGRADE = registerItem("wise_iron_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item WISE_DIAMOND_UPGRADE = registerItem("wise_diamond_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item WISE_NETHERITE_UPGRADE = registerItem(
            "wise_netherite_upgrade", new Item(new FabricItemSettings()));

    public static final Item AQUA_DIAMOND_UPGRADE = registerItem("aqua_diamond_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item AQUA_NETHERITE_UPGRADE = registerItem("aqua_netherite_upgrade",
            new Item(new FabricItemSettings()));

    public static final Item BERSERK_DIAMOND_UPGRADE = registerItem("berserk_diamond_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item BERSERK_NETHERITE_UPGRADE = registerItem("berserk_netherite_upgrade",
            new Item(new FabricItemSettings()));

    public static final Item BLOODLUST_UPGRADE = registerItem("bloodlust_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item INFINITE_SIGHT_UPGRADE = registerItem("infinite_sight_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item BULWARK_UPGRADE = registerItem("bulwark_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item NEPTUNE_UPGRADE = registerItem("neptune_upgrade",
            new Item(new FabricItemSettings()));

    //weapon upgrades
    public static final Item WINDCALLER_UPGRADE = registerItem("windcaller_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item STORMCALLER_UPGRADE = registerItem("stormcaller_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item VENOMOUS_UPGRADE = registerItem("venomous_upgrade",
            new Item(new FabricItemSettings()));
    public static final Item WITHERING_UPGRADE = registerItem("withering_upgrade",
            new Item(new FabricItemSettings()));

    //other items
    public static final Item ELDER_GUARDIAN_SCALE = registerItem("elder_guardian_scale",
            new Item(new FabricItemSettings()));
    public static final Item HARDENDED_BLOOD = registerItem("hardened_blood",
            new Item(new FabricItemSettings()));
    public static final Item BLOOD_DIAMOND = registerItem("blood_diamond",
            new Item(new FabricItemSettings()));

    //weapons
    public static final Item WINDCALLER_SWORD = registerItem("windcaller_sword",
            new ModItemWindCallerSword(ModToolMaterial.WINDCALLER, 3, -2.2f, new Item.Settings()));
    public static final Item WINDCALLER_AXE = registerItem("windcaller_axe",
            new ModItemWindCallerAxe(ModToolMaterial.WINDCALLER, 4, -2.8f, new Item.Settings()));
    public static final Item STORMCALLER_SWORD = registerItem("stormcaller_sword",
            new ModItemStormCallerSword(ModToolMaterial.STORMCALLER, 3, -2.1f, new Item.Settings()));
    public static final Item STORMCALLER_AXE = registerItem("stormcaller_axe",
            new ModItemStormCallerAxe(ModToolMaterial.STORMCALLER, 4, -2.7f, new Item.Settings()));
    public static final Item VENOMOUS_SWORD = registerItem("venomous_sword",
            new ModItemVenomousSword(ModToolMaterial.VENOMOUS, 3, -2.4f, new Item.Settings()));
    public static final Item VENOMOUS_AXE = registerItem("venomous_axe",
            new ModItemVenomousAxe(ModToolMaterial.VENOMOUS, 5, -3.0f, new Item.Settings()));

    public static final Item WITHERING_SWORD = registerItem("withering_sword",
            new ModItemWitheringSword(ModToolMaterial.WITHERING, 4, -2.4f, new Item.Settings()));
    public static final Item WITHERING_AXE = registerItem("withering_axe",
            new ModItemWitheringAxe(ModToolMaterial.WITHERING, 5, -3.0f, new Item.Settings()));

    //armor
    public static final Item PLATED_IRON_HELMET = registerItem("plated_iron_helmet",
            new ArmorItem(ModArmorMaterials.PLATED_IRON, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item PLATED_IRON_CHESTPLATE = registerItem("plated_iron_chestplate",
            new ArmorItem(ModArmorMaterials.PLATED_IRON, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item PLATED_IRON_LEGGINGS = registerItem("plated_iron_leggings",
            new ArmorItem(ModArmorMaterials.PLATED_IRON, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item PLATED_IRON_BOOTS = registerItem("plated_iron_boots",
            new ArmorItem(ModArmorMaterials.PLATED_IRON, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));
    public static final Item PLATED_DIAMOND_HELMET = registerItem("plated_diamond_helmet",
            new ArmorItem(ModArmorMaterials.PLATED_DIAMOND, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item PLATED_DIAMOND_CHESTPLATE = registerItem("plated_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.PLATED_DIAMOND, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item PLATED_DIAMOND_LEGGINGS = registerItem("plated_diamond_leggings",
            new ArmorItem(ModArmorMaterials.PLATED_DIAMOND, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item PLATED_DIAMOND_BOOTS = registerItem("plated_diamond_boots",
            new ArmorItem(ModArmorMaterials.PLATED_DIAMOND, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));
    public static final Item PLATED_NETHERITE_HELMET = registerItem("plated_netherite_helmet",
            new ArmorItem(ModArmorMaterials.PLATED_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATED_NETHERITE_CHESTPLATE = registerItem("plated_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.PLATED_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATED_NETHERITE_LEGGINGS = registerItem("plated_netherite_leggings",
            new ArmorItem(ModArmorMaterials.PLATED_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATED_NETHERITE_BOOTS = registerItem("plated_netherite_boots",
            new ArmorItem(ModArmorMaterials.PLATED_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WISE_IRON_HELMET = registerItem("wise_iron_helmet",
            new ModArmorWiseIron(ModArmorMaterials.WISE_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WISE_IRON_CHESTPLATE = registerItem("wise_iron_chestplate",
            new ModArmorWiseIron(ModArmorMaterials.WISE_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WISE_IRON_LEGGINGS = registerItem("wise_iron_leggings",
            new ModArmorWiseIron(ModArmorMaterials.WISE_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WISE_IRON_BOOTS = registerItem("wise_iron_boots",
            new ModArmorWiseIron(ModArmorMaterials.WISE_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WISE_DIAMOND_HELMET = registerItem("wise_diamond_helmet",
            new ModArmorWiseDiamond(ModArmorMaterials.WISE_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WISE_DIAMOND_CHESTPLATE = registerItem("wise_diamond_chestplate",
            new ModArmorWiseDiamond(ModArmorMaterials.WISE_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WISE_DIAMOND_LEGGINGS = registerItem("wise_diamond_leggings",
            new ModArmorWiseDiamond(ModArmorMaterials.WISE_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WISE_DIAMOND_BOOTS = registerItem("wise_diamond_boots",
            new ModArmorWiseDiamond(ModArmorMaterials.WISE_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WISE_NETHERITE_HELMET = registerItem("wise_netherite_helmet",
            new ModArmorWiseNetherite(ModArmorMaterials.WISE_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WISE_NETHERITE_CHESTPLATE = registerItem("wise_netherite_chestplate",
            new ModArmorWiseNetherite(ModArmorMaterials.WISE_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WISE_NETHERITE_LEGGINGS = registerItem("wise_netherite_leggings",
            new ModArmorWiseNetherite(ModArmorMaterials.WISE_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WISE_NETHERITE_BOOTS = registerItem("wise_netherite_boots",
            new ModArmorWiseNetherite(ModArmorMaterials.WISE_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item AQUA_DIAMOND_HELMET = registerItem("aqua_diamond_helmet",
            new ModArmorAquaDiamond(ModArmorMaterials.AQUA_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AQUA_DIAMOND_CHESTPLATE = registerItem("aqua_diamond_chestplate",
            new ModArmorAquaDiamond(ModArmorMaterials.AQUA_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AQUA_DIAMOND_LEGGINGS = registerItem("aqua_diamond_leggings",
            new ModArmorAquaDiamond(ModArmorMaterials.AQUA_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AQUA_DIAMOND_BOOTS = registerItem("aqua_diamond_boots",
            new ModArmorAquaDiamond(ModArmorMaterials.AQUA_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item AQUA_NETHERITE_HELMET = registerItem("aqua_netherite_helmet",
            new ModArmorAquaNetherite(ModArmorMaterials.AQUA_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AQUA_NETHERITE_CHESTPLATE = registerItem("aqua_netherite_chestplate",
            new ModArmorAquaNetherite(ModArmorMaterials.AQUA_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AQUA_NETHERITE_LEGGINGS = registerItem("aqua_netherite_leggings",
            new ModArmorAquaNetherite(ModArmorMaterials.AQUA_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AQUA_NETHERITE_BOOTS = registerItem("aqua_netherite_boots",
            new ModArmorAquaNetherite(ModArmorMaterials.AQUA_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BERSERK_DIAMOND_HELMET = registerItem("berserk_diamond_helmet",
            new ModArmorBerserkDiamond(ModArmorMaterials.BERSERK_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BERSERK_DIAMOND_CHESTPLATE = registerItem("berserk_diamond_chestplate",
            new ModArmorBerserkDiamond(ModArmorMaterials.BERSERK_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BERSERK_DIAMOND_LEGGINGS = registerItem("berserk_diamond_leggings",
            new ModArmorBerserkDiamond(ModArmorMaterials.BERSERK_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BERSERK_DIAMOND_BOOTS = registerItem("berserk_diamond_boots",
            new ModArmorBerserkDiamond(ModArmorMaterials.BERSERK_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BERSERK_NETHERITE_HELMET = registerItem("berserk_netherite_helmet",
            new ModArmorBerserkNetherite(ModArmorMaterials.BERSERK_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BERSERK_NETHERITE_CHESTPLATE = registerItem("berserk_netherite_chestplate",
            new ModArmorBerserkNetherite(ModArmorMaterials.BERSERK_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BERSERK_NETHERITE_LEGGINGS = registerItem("berserk_netherite_leggings",
            new ModArmorBerserkNetherite(ModArmorMaterials.BERSERK_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BERSERK_NETHERITE_BOOTS = registerItem("berserk_netherite_boots",
            new ModArmorBerserkNetherite(ModArmorMaterials.BERSERK_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item BULWARK_HELMET = registerItem("bulwark_helmet",
            new ModArmorBulwark(ModArmorMaterials.BULWARK, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BULWARK_CHESTPLATE = registerItem("bulwark_chestplate",
            new ModArmorBulwark(ModArmorMaterials.BULWARK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BULWARK_LEGGINGS = registerItem("bulwark_leggings",
            new ModArmorBulwark(ModArmorMaterials.BULWARK, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BULWARK_BOOTS = registerItem("bulwark_boots",
            new ModArmorBulwark(ModArmorMaterials.BULWARK, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INFINITE_SIGHT_HELMET = registerItem("infinite_sight_helmet",
            new ModArmorInfiniteSight(ModArmorMaterials.INFINITE_SIGHT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INFINITE_SIGHT_CHESTPLATE = registerItem("infinite_sight_chestplate",
            new ModArmorInfiniteSight(ModArmorMaterials.INFINITE_SIGHT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INFINITE_SIGHT_LEGGINGS = registerItem("infinite_sight_leggings",
            new ModArmorInfiniteSight(ModArmorMaterials.INFINITE_SIGHT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INFINITE_SIGHT_BOOTS = registerItem("infinite_sight_boots",
            new ModArmorInfiniteSight(ModArmorMaterials.INFINITE_SIGHT, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NEPTUNE_HELMET = registerItem("neptune_helmet",
            new ModArmorNeptune(ModArmorMaterials.NEPTUNE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NEPTUNE_CHESTPLATE = registerItem("neptune_chestplate",
            new ModArmorNeptune(ModArmorMaterials.NEPTUNE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item NEPTUNE_LEGGINGS = registerItem("neptune_leggings",
            new ModArmorNeptune(ModArmorMaterials.NEPTUNE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NEPTUNE_BOOTS = registerItem("neptune_boots",
            new ModArmorNeptune(ModArmorMaterials.NEPTUNE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLOODLUST_HELMET = registerItem("bloodlust_helmet",
            new ModArmorBloodlust(ModArmorMaterials.BLOODLUST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLOODLUST_CHESTPLATE = registerItem("bloodlust_chestplate",
            new ModArmorBloodlust(ModArmorMaterials.BLOODLUST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLOODLUST_LEGGINGS = registerItem("bloodlust_leggings",
            new ModArmorBloodlust(ModArmorMaterials.BLOODLUST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLOODLUST_BOOTS = registerItem("bloodlust_boots",
            new ModArmorBloodlust(ModArmorMaterials.BLOODLUST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AwesomeArmaments.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AwesomeArmaments.LOGGER.info("Registering Mod Items for " + AwesomeArmaments.MOD_ID);

    }
}
