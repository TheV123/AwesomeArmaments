package net.thev123.awesomearmaments.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import java.util.function.Supplier;

public enum  ModToolMaterial implements ToolMaterial {

    //enum format credits = https://github.com/Tutorials-By-Kaupenjoe/Fabric-Tutorial-1.20.X/blob/15-tools/src/main/java/net/kaupenjoe/tutorialmod/item/ModToolMaterial.java

//DIAMOND(MiningLevels.DIAMOND, 1561, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
//NETHERITE(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    WINDCALLER(MiningLevels.DIAMOND, 1562, 10f, 2.5f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),

    STORMCALLER(MiningLevels.NETHERITE, 2031, 12f, 3.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    VENOMOUS(MiningLevels.DIAMOND, 1562, 8f, 3.0f, 8, () -> Ingredient.ofItems(Items.DIAMOND)),
    WITHERING(MiningLevels.NETHERITE, 2031, 9f, 3.0f, 12, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
