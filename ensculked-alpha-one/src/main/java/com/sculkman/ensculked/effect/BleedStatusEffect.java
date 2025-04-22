package com.sculkman.ensculked.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.lwjgl.system.linux.Stat;

public class BleedStatusEffect extends StatusEffect {


    protected BleedStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExhaustion(1  << amplifier);
        }
    }
}
