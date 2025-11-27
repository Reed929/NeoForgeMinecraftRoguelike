package net.reed929.roguelike.item.custom;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.reed929.roguelike.item.client.armor.BloodstoneArmorRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class BloodstoneArmorItem extends Item implements GeoItem {
    // Create a custom DataTicket to check for the full set being worn

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public BloodstoneArmorItem(ArmorMaterial armorMaterial, ArmorType type, Properties properties) {
        super(properties.humanoidArmor(armorMaterial, type));
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private BloodstoneArmorRenderer<?> renderer;

            public <S extends HumanoidRenderState> @NotNull BloodstoneArmorRenderer<?> getGeoArmorRenderer(@Nullable S renderState, ItemStack itemStack, EquipmentSlot equipmentSlot,
                                                                                                           EquipmentClientInfo.LayerType type, @Nullable HumanoidModel<S> original) {
                // Important that we do this. If we just instantiate it directly in the field it can cause incompatibilities with some mods.
                if(this.renderer == null)
                    this.renderer = new BloodstoneArmorRenderer<>();

                return this.renderer;
            }
        });
    }

    // Let's add our animation controller
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }


}

