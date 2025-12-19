package net.reed929.roguelike.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Roguelike.MOD_ID);

    //ADDING ITEMS
    public static final DeferredItem<Item> RAW_BLOODSTONE = ITEMS.registerSimpleItem("raw_bloodstone");
    public static final DeferredItem<Item> COPPER_COIN = ITEMS.registerSimpleItem("copper_coin");

    //BLOODSTONE TOOLS
    public static final DeferredItem<SwordItem> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(ModToolTiers.BLOODSTONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BLOODSTONE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLOODSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BLOODSTONE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(ModToolTiers.BLOODSTONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BLOODSTONE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> BLOODSTONE_AXE = ITEMS.register("bloodstone_axe",
            () -> new AxeItem(ModToolTiers.BLOODSTONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BLOODSTONE, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(ModToolTiers.BLOODSTONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BLOODSTONE, 0F, -3.0f))));
    public static final DeferredItem<Item> BLOODSTONE_BOW = ITEMS.registerItem("bloodstone_bow",
            (properties) -> new BowItem(properties.durability(500)));


    //BLOODSTONE ARMOR
    public static final DeferredItem<ArmorItem> BLOODSTONE_HELMET = ITEMS.register("bloodstone_helmet",
            () -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> BLOODSTONE_CHESTPLATE = ITEMS.register("bloodstone_chestplate",
            () -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> BLOODSTONE_LEGGINGS = ITEMS.register("bloodstone_leggings",
            () -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> BLOODSTONE_BOOTS = ITEMS.register("bloodstone_boots",
            () -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
