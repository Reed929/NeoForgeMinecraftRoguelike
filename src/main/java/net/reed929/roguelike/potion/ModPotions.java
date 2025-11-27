package net.reed929.roguelike.potion;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.effect.ModEffects;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(BuiltInRegistries.POTION, Roguelike.MOD_ID);

    public static final Holder<Potion> HEALING_AMP_POTION = POTIONS.register("healing_amp_potion",
            () -> new Potion("healing_amp_potion",new MobEffectInstance(ModEffects.HEALING_AMP_EFFECT, 200,0)));

    public static void  register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}

