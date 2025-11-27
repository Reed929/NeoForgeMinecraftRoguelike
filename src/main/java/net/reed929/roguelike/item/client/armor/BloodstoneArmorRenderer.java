package net.reed929.roguelike.item.client.armor;

import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class BloodstoneArmorRenderer extends GeoArmorRenderer<BloodstoneArmorIteme>
{
    public BloodstoneArmorRenderer() {
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the assets folders.
        super(new BloodstoneArmorModel());
    }
}
