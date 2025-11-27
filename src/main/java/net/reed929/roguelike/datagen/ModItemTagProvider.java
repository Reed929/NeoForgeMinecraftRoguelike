package net.reed929.roguelike.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.ModArmorMaterials;
import net.reed929.roguelike.item.ModItems;
import net.reed929.roguelike.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Roguelike.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RAW_BLOODSTONE.get());

        tag(ModTags.Items.BLOODSTONE_REPAIRABLE)
                .add(ModItems.RAW_BLOODSTONE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.BLOODSTONE_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.BLOODSTONE_PICKAXE.get());

        tag(ItemTags.AXES)
                .add(ModItems.BLOODSTONE_AXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.BLOODSTONE_SHOVEL.get());

        tag(ItemTags.HOES)
                .add(ModItems.BLOODSTONE_HOE.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLOODSTONE_HELMET.get())
                .add(ModItems.BLOODSTONE_CHESTPLATE.get())
                .add(ModItems.BLOODSTONE_LEGGINGS.get())
                .add(ModItems.BLOODSTONE_BOOTS.get());

    }

}