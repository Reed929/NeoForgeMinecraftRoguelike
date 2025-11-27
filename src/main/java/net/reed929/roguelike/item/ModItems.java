package net.reed929.roguelike.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Roguelike.MOD_ID);

    //ADDING ITEMS
    public static final DeferredItem<Item> RAW_BLOODSTONE = ITEMS.registerSimpleItem("raw_bloodstone");

    //BLOODSTONE TOOLS
    public static final DeferredItem<Item> BLOODSTONE_SWORD = ITEMS.registerItem("bloodstone_sword",
            (properties) -> new Item(properties.sword(ModToolTiers.BLOODSTONE, 5, -2.4f)));
    public static final DeferredItem<Item> BLOODSTONE_PICKAXE = ITEMS.registerItem("bloodstone_pickaxe",
            (properties) -> new Item(properties.pickaxe(ModToolTiers.BLOODSTONE, 5, -2.4f)));
    public static final DeferredItem<Item> BLOODSTONE_AXE = ITEMS.registerItem("bloodstone_axe",
            (properties) -> new AxeItem(ModToolTiers.BLOODSTONE, 5, -2.4f,properties));
    public static final DeferredItem<Item> BLOODSTONE_SHOVEL = ITEMS.registerItem("bloodstone_shovel",
            (properties) -> new ShovelItem(ModToolTiers.BLOODSTONE, 5, -2.4f, properties));
    public static final DeferredItem<Item> BLOODSTONE_HOE = ITEMS.registerItem("bloodstone_hoe",
            (properties) -> new HoeItem(ModToolTiers.BLOODSTONE, 5, -2.4f, properties));
    public static final DeferredItem<Item> BLOODSTONE_BOW = ITEMS.registerItem("bloodstone_bow",
            (properties) -> new BowItem(properties.durability(500)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
