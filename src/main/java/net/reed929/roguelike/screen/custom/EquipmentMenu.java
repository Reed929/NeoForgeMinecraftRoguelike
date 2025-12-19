package net.reed929.roguelike.screen.custom;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.reed929.roguelike.screen.ModMenus;

import java.awt.*;

public class EquipmentMenu extends AbstractContainerMenu {
    private final Level level;

    public EquipmentMenu(int containerId, Inventory inventory, RegistryFriendlyByteBuf registryFriendlyByteBuf) {
        super(ModMenus.EQUIPMENT_MENU.get(), containerId);
        this.level = inventory.player.level();

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);
    }

    private void addPlayerInventory(Inventory inv) {
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new net.minecraft.world.inventory.Slot(
                        inv, col + row * 9 + 9,
                        8 + col * 18,
                        84 + row * 18
                ));
            }
        }
    }

    private void addPlayerHotbar(Inventory inv) {
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new net.minecraft.world.inventory.Slot(
                    inv, col,
                    8 + col * 18,
                    142
            ));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}