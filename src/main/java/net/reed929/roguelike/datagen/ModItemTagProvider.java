package net.reed929.roguelike.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.ModItems;
import net.reed929.roguelike.util.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Roguelike.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RAW_BLOODSTONE.get());


        tag(ItemTags.SWORDS)
                .add(ModItems.BLOODSTONE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BLOODSTONE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BLOODSTONE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.BLOODSTONE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.BLOODSTONE_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLOODSTONE_HELMET.get())
                .add(ModItems.BLOODSTONE_CHESTPLATE.get())
                .add(ModItems.BLOODSTONE_LEGGINGS.get())
                .add(ModItems.BLOODSTONE_BOOTS.get());

    }
}