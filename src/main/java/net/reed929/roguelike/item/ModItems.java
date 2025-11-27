package net.reed929.roguelike.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.client.armor.BloodstoneArmorRenderer;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;

import javax.annotation.Nullable;
import java.util.function.Consumer;

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

    //BLOODSTONE ARMOR
    public static final DeferredItem<Item> BLOODSTONE_HELMET = ITEMS.registerItem("bloodstone_helmet",
            (properties) -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL,ArmorType.HELMET,properties));
    public static final DeferredItem<Item> BLOODSTONE_CHESTPLATE = ITEMS.registerItem("bloodstone_chestplate",
            (properties) -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL,ArmorType.CHESTPLATE,properties));
    public static final DeferredItem<Item> BLOODSTONE_LEGGINGS = ITEMS.registerItem("bloodstone_leggings",
            (properties) -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL,ArmorType.LEGGINGS,properties));
    public static final DeferredItem<Item> BLOODSTONE_BOOTS = ITEMS.registerItem("bloodstone_boots",
            (properties) -> new BloodstoneArmorItem(ModArmorMaterials.BLOODSTONE_ARMOR_MATERIAL,ArmorType.BOOTS,properties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
