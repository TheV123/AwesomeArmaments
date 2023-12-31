package net.thev123.awesomearmaments.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.thev123.awesomearmaments.effect.ModEffects;
import net.thev123.awesomearmaments.item.ModArmorMaterials;
import java.util.Map;

public class ModArmorNeptune extends ArmorItem {
    public static final int effectDuration = 200;
    public static final int amplifier = 0;

    private static final int REPAIR_TICKS = 200;  // Number of ticks between repairs
    private static final int REPAIR_AMOUNT = 3;   // Amount of durability to repair per tick
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.NEPTUNE,
                            new StatusEffectInstance(StatusEffects.LUCK, effectDuration, amplifier)).build();

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP2 =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.NEPTUNE,
                            new StatusEffectInstance(StatusEffects.LUCK, effectDuration, amplifier)).build();

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP3 =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.NEPTUNE,
                            new StatusEffectInstance(StatusEffects.LUCK, effectDuration, amplifier)).build();

    public ModArmorNeptune(ArmorMaterial material, ArmorItem.Type slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;

                if(hasFullSuitOfArmorOn(player)) {
                    evaluateArmorEffects(player);
                }

                if(player.isSwimming() || player.isTouchingWater() || player.isSubmergedInWater() || player.isInsideWaterOrBubbleColumn())
                if (world.getTime() % REPAIR_TICKS == 0) {
                    if (stack.getDamage() > 0) {
                        stack.setDamage(stack.getDamage() - REPAIR_AMOUNT);
                    }
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = ModArmorMaterials.NEPTUNE;
            StatusEffectInstance mapStatusEffect = new StatusEffectInstance(ModEffects.WATERBORN,
                    effectDuration, amplifier, false, false, false);

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
        for(Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP2.entrySet()) {
            ArmorMaterial mapArmorMaterial = ModArmorMaterials.NEPTUNE;
            StatusEffectInstance mapStatusEffect = new StatusEffectInstance(StatusEffects.CONDUIT_POWER,
                    effectDuration, amplifier, false, false, false);

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
        for(Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP3.entrySet()) {
            ArmorMaterial mapArmorMaterial = ModArmorMaterials.NEPTUNE;
            StatusEffectInstance mapStatusEffect = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,
                    effectDuration, amplifier, false, false, false);

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(ModEffects.WATERBORN,
                    effectDuration, amplifier, false, false, false));
        }
        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,
                    effectDuration, amplifier, false, false, false));
        }
        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,
                    effectDuration, 1, false, false, false));
        }

        // effect repeat issue fix
        if (player.getActiveStatusEffects().containsKey(ModEffects.WATERBORN)) {
            if (player.getActiveStatusEffects().get(mapStatusEffect.getEffectType()).getDuration() < 100) {
                player.addStatusEffect(new StatusEffectInstance(ModEffects.WATERBORN,
                        effectDuration, amplifier, false, false, false));
            }
        }
        if (player.getActiveStatusEffects().containsKey(StatusEffects.CONDUIT_POWER)) {
            if (player.getActiveStatusEffects().get(mapStatusEffect.getEffectType()).getDuration() < 100) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER,
                        effectDuration, amplifier, false, false, false));
            }
        }
        if (player.getActiveStatusEffects().containsKey(StatusEffects.DOLPHINS_GRACE)) {
            if (player.getActiveStatusEffects().get(mapStatusEffect.getEffectType()).getDuration() < 100) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,
                        effectDuration, amplifier, false, false, false));
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean doesArmorHaveMaterial(ArmorMaterial material, PlayerEntity player) {
        for (int i=0; i<4; i++) {
            try{
                ((ArmorItem)player.getInventory().getArmorStack(i).getItem()).getMaterial();
            }catch(Exception e){
                return false;
            }
        }

        return true;
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        if (!doesArmorHaveMaterial(material, player)) {
            return false;
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
