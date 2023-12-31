package net.thev123.awesomearmaments.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import java.util.UUID;

public class Waterborn extends StatusEffect {
    private int healingCooldown = 0;
    private static final int MAX_COOLDOWN = 12; // 12 ticks (.6 seconds) between regen

    private static final UUID HEALTH_MODIFIER_ID = UUID.fromString("f669e5a0-df49-11eb-ba80-0242ac130004");
    private static final double HEALTH_INCREASE_AMOUNT = 4.0; // 2 hearts increase (each heart is 2 health points)
    private static int timeOutsideWater = 0;

    protected Waterborn(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getWorld().isClient()) {
            PlayerEntity player = (PlayerEntity) pLivingEntity;
            World world = player.getWorld();
            EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
            EntityAttributeModifier healthModifier = new EntityAttributeModifier(
                    HEALTH_MODIFIER_ID,
                    "Underwater Health Increase",
                    HEALTH_INCREASE_AMOUNT,
                    EntityAttributeModifier.Operation.ADDITION
            );
            if(player.isSubmergedInWater() || player.isSwimming() || player.isTouchingWater() || player.isInsideWaterOrBubbleColumn()){
                timeOutsideWater = 0;
                player.removeStatusEffect(StatusEffects.POISON);
                player.removeStatusEffect(StatusEffects.WEAKNESS);
                if (attributeInstance != null && !attributeInstance.hasModifier(healthModifier)) {
                    attributeInstance.addTemporaryModifier(healthModifier);
                }
                if(healingCooldown <= 0){
                    player.heal(1.0f);
                    healingCooldown = MAX_COOLDOWN;
                }
                else{
                    healingCooldown --;
                }
            }
            else{
                if (attributeInstance != null && attributeInstance.hasModifier(healthModifier)) {
                    attributeInstance.removeModifier(healthModifier);
                    attributeInstance.removeModifier(HEALTH_MODIFIER_ID);
                }
                if(timeOutsideWater >= 400){
                    if(!player.hasStatusEffect(StatusEffects.WEAKNESS)){
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
                    }
                }
                timeOutsideWater++;
                if(timeOutsideWater >= 10000){
                    if(!player.hasStatusEffect(StatusEffects.POISON)){
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0));
                    }
                }
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier){
        return true;
    }
}
