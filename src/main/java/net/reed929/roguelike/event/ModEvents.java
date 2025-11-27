package net.reed929.roguelike.event;

import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.ModItems;
import net.reed929.roguelike.potion.ModPotions;

@EventBusSubscriber(modid = Roguelike.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        //ADDING POTION RECIPES
        builder.addMix(Potions.AWKWARD, ModItems.RAW_BLOODSTONE.get(), ModPotions.HEALING_AMP_POTION);
    }
}
