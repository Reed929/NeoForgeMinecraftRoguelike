package net.reed929.roguelike.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.block.ModBlocks;
import net.reed929.roguelike.item.ModItems;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Roguelike.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        /* ITEMS */
        itemModels.generateFlatItem(ModItems.RAW_BLOODSTONE.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_NETHER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BLOODSTONE_END_ORE.get());

        /* TOOLS */
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BLOODSTONE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        /* BOWS */
        itemModels.createFlatItemModel(ModItems.BLOODSTONE_BOW.get(), ModelTemplates.BOW);
        itemModels.generateBow(ModItems.BLOODSTONE_BOW.get());
    }
}