package net.reed929.roguelike.item.client.armor;

import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public final class BloodstoneArmorRenderer<R extends HumanoidRenderState & GeoRenderState> extends GeoArmorRenderer<BloodstoneArmorItem, R>
{
    public BloodstoneArmorRenderer() {
        super(new BloodstoneArmorModel());
    }
}
