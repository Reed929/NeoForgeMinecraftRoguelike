package net.reed929.roguelike.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, Roguelike.MOD_ID);

    public static final Holder<MobEffect> HEALING_AMP_EFFECT = MOB_EFFECTS.register("healing_amp_effect",
            () -> new HealingAmpEffect(MobEffectCategory.BENEFICIAL, 0xD13656));

    public static void register(IEventBus bus) {
        MOB_EFFECTS.register(bus);
    }
}
