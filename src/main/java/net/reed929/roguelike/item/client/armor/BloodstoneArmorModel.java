package net.reed929.roguelike.item.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class BloodstoneArmorModel extends GeoModel<BloodstoneArmorItem> {

    @Override
    public ResourceLocation getModelResource(GeoRenderState renderState) {
        return ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "geo/bloodstone_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GeoRenderState renderState) {
        return ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "textures/models/bloodstone_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BloodstoneArmorItem animatable) {
        return null;
    }
}
