package net.reed929.roguelike.screen.custom;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.reed929.roguelike.Roguelike;
import org.jetbrains.annotations.NotNull;

public class EquipmentScreen extends Screen {
    private static final ResourceLocation BACKGROUND =
            ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "textures/gui/equipment_gui.png");

    private static final int TEXTURE_WIDTH = 193;
    private static final int TEXTURE_HEIGHT = 133;

    public EquipmentScreen() {
        super(Component.literal("Equipment"));
    }

    @Override
    public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {

        this.renderBackground(guiGraphics, mouseX, mouseY,  partialTick);

        super.render(guiGraphics, mouseX, mouseY, partialTick);

        // Center the GUI
        int x = (this.width - TEXTURE_WIDTH) / 2;
        int y = (this.height - TEXTURE_HEIGHT) / 2;

        // Add texture
        guiGraphics.blit(BACKGROUND, x, y, 0, 0, TEXTURE_WIDTH, TEXTURE_HEIGHT);

        // Add title text
        guiGraphics.drawCenteredString(this.font, this.title, this.width / 2, y - 10 , 0xFFFFFF);

        // Add Button
        this.addRenderableWidget(Button.builder(Component.literal(""),
                (button) -> {
                    System.out.println("Button clicked!");

                })
                .pos(x+140,y+74)
                .size(44,12)
                .build());
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
