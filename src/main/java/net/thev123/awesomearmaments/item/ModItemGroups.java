package net.thev123.awesomearmaments.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thev123.awesomearmaments.AwesomeArmaments;
import net.minecraft.registry.Registry;

public class ModItemGroups {
    public static final ItemGroup UPGRADE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AwesomeArmaments.MOD_ID, "awesome_armaments"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.awesomearmaments"))
                    .icon(() -> new ItemStack(ModItems.BLOODLUST_HELMET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ELDER_GUARDIAN_SCALE);
                        entries.add(ModItems.HARDENDED_BLOOD);
                        entries.add(ModItems.BLOOD_DIAMOND);

                        entries.add(ModItems.WINDCALLER_UPGRADE);
                        entries.add(ModItems.WINDCALLER_SWORD);
                        entries.add(ModItems.WINDCALLER_AXE);

                        entries.add(ModItems.STORMCALLER_UPGRADE);
                        entries.add(ModItems.STORMCALLER_SWORD);
                        entries.add(ModItems.STORMCALLER_AXE);

                        entries.add(ModItems.VENOMOUS_UPGRADE);
                        entries.add(ModItems.VENOMOUS_SWORD);
                        entries.add(ModItems.VENOMOUS_AXE);

                        entries.add(ModItems.WITHERING_UPGRADE);
                        entries.add(ModItems.WITHERING_SWORD);
                        entries.add(ModItems.WITHERING_AXE);

                        entries.add(ModItems.PLATED_IRON_UPGRADE);
                        entries.add(ModItems.PLATED_IRON_HELMET);
                        entries.add(ModItems.PLATED_IRON_CHESTPLATE);
                        entries.add(ModItems.PLATED_IRON_LEGGINGS);
                        entries.add(ModItems.PLATED_IRON_BOOTS);

                        entries.add(ModItems.PLATED_DIAMOND_UPGRADE);
                        entries.add(ModItems.PLATED_DIAMOND_HELMET);
                        entries.add(ModItems.PLATED_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.PLATED_DIAMOND_LEGGINGS);
                        entries.add(ModItems.PLATED_DIAMOND_BOOTS);

                        entries.add(ModItems.PLATED_NETHERITE_UPGRADE);
                        entries.add(ModItems.PLATED_NETHERITE_HELMET);
                        entries.add(ModItems.PLATED_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.PLATED_NETHERITE_LEGGINGS);
                        entries.add(ModItems.PLATED_NETHERITE_BOOTS);

                        entries.add(ModItems.WISE_IRON_UPGRADE);
                        entries.add(ModItems.WISE_IRON_HELMET);
                        entries.add(ModItems.WISE_IRON_CHESTPLATE);
                        entries.add(ModItems.WISE_IRON_LEGGINGS);
                        entries.add(ModItems.WISE_IRON_BOOTS);

                        entries.add(ModItems.WISE_DIAMOND_UPGRADE);
                        entries.add(ModItems.WISE_DIAMOND_HELMET);
                        entries.add(ModItems.WISE_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.WISE_DIAMOND_LEGGINGS);
                        entries.add(ModItems.WISE_DIAMOND_BOOTS);

                        entries.add(ModItems.WISE_NETHERITE_UPGRADE);
                        entries.add(ModItems.WISE_NETHERITE_HELMET);
                        entries.add(ModItems.WISE_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.WISE_NETHERITE_LEGGINGS);
                        entries.add(ModItems.WISE_NETHERITE_BOOTS);

                        entries.add(ModItems.AQUA_DIAMOND_UPGRADE);
                        entries.add(ModItems.AQUA_DIAMOND_HELMET);
                        entries.add(ModItems.AQUA_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.AQUA_DIAMOND_LEGGINGS);
                        entries.add(ModItems.AQUA_DIAMOND_BOOTS);

                        entries.add(ModItems.AQUA_NETHERITE_UPGRADE);
                        entries.add(ModItems.AQUA_NETHERITE_HELMET);
                        entries.add(ModItems.AQUA_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.AQUA_NETHERITE_LEGGINGS);
                        entries.add(ModItems.AQUA_NETHERITE_BOOTS);

                        entries.add(ModItems.BERSERK_DIAMOND_UPGRADE);
                        entries.add(ModItems.BERSERK_DIAMOND_HELMET);
                        entries.add(ModItems.BERSERK_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.BERSERK_DIAMOND_LEGGINGS);
                        entries.add(ModItems.BERSERK_DIAMOND_BOOTS);

                        entries.add(ModItems.BERSERK_NETHERITE_UPGRADE);
                        entries.add(ModItems.BERSERK_NETHERITE_HELMET);
                        entries.add(ModItems.BERSERK_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.BERSERK_NETHERITE_LEGGINGS);
                        entries.add(ModItems.BERSERK_NETHERITE_BOOTS);

                        entries.add(ModItems.BULWARK_UPGRADE);
                        entries.add(ModItems.BULWARK_HELMET);
                        entries.add(ModItems.BULWARK_CHESTPLATE);
                        entries.add(ModItems.BULWARK_LEGGINGS);
                        entries.add(ModItems.BULWARK_BOOTS);

                        entries.add(ModItems.INFINITE_SIGHT_UPGRADE);
                        entries.add(ModItems.INFINITE_SIGHT_HELMET);
                        entries.add(ModItems.INFINITE_SIGHT_CHESTPLATE);
                        entries.add(ModItems.INFINITE_SIGHT_LEGGINGS);
                        entries.add(ModItems.INFINITE_SIGHT_BOOTS);

                        entries.add(ModItems.NEPTUNE_UPGRADE);
                        entries.add(ModItems.NEPTUNE_HELMET);
                        entries.add(ModItems.NEPTUNE_CHESTPLATE);
                        entries.add(ModItems.NEPTUNE_LEGGINGS);
                        entries.add(ModItems.NEPTUNE_BOOTS);

                        entries.add(ModItems.BLOODLUST_UPGRADE);
                        entries.add(ModItems.BLOODLUST_HELMET);
                        entries.add(ModItems.BLOODLUST_CHESTPLATE);
                        entries.add(ModItems.BLOODLUST_LEGGINGS);
                        entries.add(ModItems.BLOODLUST_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        AwesomeArmaments.LOGGER.info("Registering Item Groups for " + AwesomeArmaments.MOD_ID);
    }
}
