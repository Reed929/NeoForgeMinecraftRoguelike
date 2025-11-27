package net.reed929.roguelike.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.block.ModBlocks;
import net.reed929.roguelike.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Roguelike.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLOODSTONE_ORE.get())
                .add(ModBlocks.BLOODSTONE_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLOODSTONE_NETHER_ORE.get())
                .add(ModBlocks.BLOODSTONE_END_ORE.get());


        tag(ModTags.Blocks.NEEDS_BLOODSTONE_TOOL)
                .add(ModBlocks.BLOODSTONE_ORE.get())
                .add(ModBlocks.BLOODSTONE_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLOODSTONE_NETHER_ORE.get())
                .add(ModBlocks.BLOODSTONE_END_ORE.get());

    }
}