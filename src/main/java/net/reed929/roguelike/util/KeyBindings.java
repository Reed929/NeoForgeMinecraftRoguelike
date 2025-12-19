package net.reed929.roguelike.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;

public final class KeyBindings {
    public static final KeyBindings INSTANCE = new KeyBindings();
    private KeyBindings() {}

    public final KeyMapping OPEN_EQUIPMENT = new KeyMapping("key.roguelike.open_equipment",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_I, -1),
            KeyMapping.CATEGORY_INVENTORY);
}
