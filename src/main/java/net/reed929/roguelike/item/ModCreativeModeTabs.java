package net.reed929.roguelike.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Roguelike.MOD_ID);

    //ADD CREATIVE TABS
    public static final Supplier<CreativeModeTab> ROGUELIKE_ITEMS = CREATIVE_MODE_TAB.register("roguelike_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_BLOODSTONE.get()))
                    .title(Component.translatable("creative.roguelike.roguelike_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //ADD ITEMS TO TAB
                        output.accept(ModItems.RAW_BLOODSTONE);

                    }).build());

    public static final Supplier<CreativeModeTab> ROGUELIKE_BLOCKS = CREATIVE_MODE_TAB.register("roguelike_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOODSTONE_ORE.get()))
                    .title(Component.translatable("creative.roguelike.roguelike_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //ADD ITEMS TO TAB
                        output.accept(ModBlocks.BLOODSTONE_ORE);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
