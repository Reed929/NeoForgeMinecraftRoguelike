package net.reed929.roguelike.worldgen.portal;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.resources.ResourceLocation;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.block.ModBlocks;
import net.reed929.roguelike.item.ModItems;

public class ModPortals {

    public static void register() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.BLOODSTONE_ORE.get())
                .lightWithItem(ModItems.RAW_BLOODSTONE.get())
                .destDimID(ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "roguelikedim"))
                .tintColor(120, 0, 200)
                .registerPortal();

        System.out.println("[ROGUELIKE] Portal registration complete!");
    }
}