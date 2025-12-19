package net.reed929.roguelike.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingHealEvent;

@EventBusSubscriber
public class HealingAmpEffect extends MobEffect {
    protected HealingAmpEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @SubscribeEvent
    public static void onPlayerHeal(LivingHealEvent event) {
        LivingEntity entity = event.getEntity();

        if (entity.hasEffect(ModEffects.HEALING_AMP_EFFECT)) {
            int amplifier = entity.getEffect(ModEffects.HEALING_AMP_EFFECT).getAmplifier();
            float multiplier = 1f + 0.25f * (amplifier + 1f);
            event.setAmount(event.getAmount() * multiplier);
        }
    }
}
