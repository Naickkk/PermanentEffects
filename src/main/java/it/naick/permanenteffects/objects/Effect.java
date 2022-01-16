package it.naick.permanenteffects.objects;

import lombok.Getter;
import org.bukkit.potion.PotionEffectType;

public class Effect {

    @Getter private final PotionEffectType effectType;
    @Getter private final Integer level;

    public Effect(PotionEffectType effectType, Integer level) {
        this.effectType = effectType;
        this.level = level;
    }
}
