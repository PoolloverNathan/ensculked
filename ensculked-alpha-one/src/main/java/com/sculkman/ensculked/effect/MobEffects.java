package com.sculkman.ensculked.effect;

import com.sculkman.ensculked.Ensculked;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MobEffects {
    public static StatusEffect registerBleedEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Ensculked.MOD_ID, name),
                new BleedStatusEffect(StatusEffectCategory.HARMFUL, 1582940));
    }
    public static StatusEffect registerEidolonEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Ensculked.MOD_ID, name),
            new EidolonStatusEffect(StatusEffectCategory.HARMFUL, 1582940));
    }
    public static StatusEffect BLEED;
    public static StatusEffect EIDOLON;

    public static void registerEffects(){
        BLEED = registerBleedEffect("bleed");
        EIDOLON = registerEidolonEffect("eidolon");
    }
}
