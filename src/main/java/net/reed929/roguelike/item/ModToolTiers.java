package net.reed929.roguelike.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.reed929.roguelike.util.ModTags;

public class ModToolTiers {
    public static final Tier BLOODSTONE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BLOODSTONE_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.RAW_BLOODSTONE));
}
