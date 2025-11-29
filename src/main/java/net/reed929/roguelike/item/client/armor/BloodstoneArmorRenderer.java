package net.reed929.roguelike.item.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class BloodstoneArmorRenderer extends GeoArmorRenderer<BloodstoneArmorItem> {
    public BloodstoneArmorRenderer() {
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the assets folders.
        super(new BloodstoneArmorModel());
    }
}
