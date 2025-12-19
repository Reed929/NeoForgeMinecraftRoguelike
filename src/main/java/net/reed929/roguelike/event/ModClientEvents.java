package net.reed929.roguelike.event;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.item.ModItems;
import net.reed929.roguelike.util.KeyBindings;
import net.reed929.roguelike.screen.custom.EquipmentScreen;

@EventBusSubscriber(modid = Roguelike.MOD_ID, value =  Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onKeyInput(InputEvent.Key event) {
        Minecraft minecraft = Minecraft.getInstance();
        if(KeyBindings.INSTANCE.OPEN_EQUIPMENT.isDown()){
            KeyBindings.INSTANCE.OPEN_EQUIPMENT.consumeClick();
            assert minecraft.player != null;
            minecraft.setScreen(new EquipmentScreen());
        }
    }

    @SubscribeEvent
    public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
        if(event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == ModItems.BLOODSTONE_BOW.get()) {
            float fovModifier = 1f;
            int ticksUsingItem = event.getPlayer().getTicksUsingItem();
            float deltaTicks = (float)ticksUsingItem / 20f;
            if(deltaTicks > 1f) {
                deltaTicks = 1f;
            } else {
                deltaTicks *= deltaTicks;
            }
            fovModifier *= 1f - deltaTicks * 0.15f;
            event.setNewFovModifier(fovModifier);
        }
    }
}