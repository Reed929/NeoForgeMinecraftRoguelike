package net.reed929.roguelike.item.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.custom.BloodstoneArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class BloodstoneArmorModel extends GeoModel<BloodstoneArmorItem> {

    @Override
    public ResourceLocation getModelResource(BloodstoneArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "geo/armor/bloodstone_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BloodstoneArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "textures/models/armor/bloodstone_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BloodstoneArmorItem animatable) {
        return null;
    }

}