package net.reed929.roguelike.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.reed929.roguelike.Roguelike;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> BLOODSTONE_ARMOR_MATERIAL = register("bloodstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 5);
            }),
            16,                       // durability multiplier
            SoundEvents.ARMOR_EQUIP_NETHERITE,       // equip sound
            2.0f,                                    // toughness
            0.1f,                                    // knockback resistance
            () -> ModItems.RAW_BLOODSTONE.get()      // repair item
    );

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int durabilityMultiplier,
                                                  Holder<SoundEvent> equipSound,
                                                  float toughness,
                                                  float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, name);
        Supplier<Ingredient> repairIngredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(
                        typeProtection,
                        durabilityMultiplier,
                        equipSound,
                        repairIngredient,
                        layers,
                        toughness,
                        knockbackResistance
                )
        );
    }
}