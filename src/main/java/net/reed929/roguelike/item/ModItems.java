package net.reed929.roguelike.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Roguelike.MOD_ID);

    //ADDING ITEMS
    public static final DeferredItem<Item> RAW_BLOODSTONE = ITEMS.registerItem("raw_bloodstone",
            Item::new, new Item.Properties());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
