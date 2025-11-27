package net.reed929.roguelike.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.ModItems;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Roguelike.MOD_ID);

    public static final DeferredBlock<Block> BLOODSTONE_ORE = registerBlock("bloodstone_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLOODSTONE_DEEPSLATE_ORE = registerBlock("bloodstone_deepslate_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> BLOODSTONE_NETHER_ORE = registerBlock("bloodstone_nether_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)));
    public static final DeferredBlock<Block> BLOODSTONE_END_ORE = registerBlock("bloodstone_end_ore",
            (properties) -> new DropExperienceBlock(UniformInt.of(1, 3),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
