package net.reed929.roguelike.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.reed929.roguelike.Roguelike;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BLOODSTONE_TOOL = createTag("needs_bloodstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOODSTONE_TOOL = createTag("incorrect_for_bloodstone_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> BLOODSTONE_REPAIRABLE = createTag("bloodstone_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, name));
        }
    }
}
