package com.kaleblangley.locks_reworked.registries;

import com.kaleblangley.locks_reworked.LocksReworked;
import com.kaleblangley.locks_reworked.item.KeyItem;
import com.kaleblangley.locks_reworked.item.KeyRingItem;
import com.kaleblangley.locks_reworked.item.LockItem;
import com.kaleblangley.locks_reworked.item.LockPickItem;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModItems {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(LocksReworked.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(LocksReworked.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<KeyItem> KEY = ITEMS.register("key", () -> new KeyItem(new Item.Properties()));
    public static final RegistrySupplier<LockItem> LOCK = ITEMS.register("lock", () -> new LockItem(new Item.Properties()));
    public static final RegistrySupplier<LockPickItem> LOCK_PICK = ITEMS.register("lock_pick", () -> new LockPickItem(new Item.Properties()));
    public static final RegistrySupplier<Item> KEY_RING = ITEMS.register("key_ring", () -> new KeyRingItem(new Item.Properties()));

    public static final RegistrySupplier<CreativeModeTab> TAB = TABS.register("creative_tab", () -> CreativeTabRegistry.create(builder -> {
        builder.title(Component.translatable("itemGroup." + LocksReworked.MOD_ID));
        builder.icon(() -> new ItemStack(LOCK.get()));
        builder.displayItems((parameters, output) -> {
            for (RegistrySupplier<Item> item : ITEMS) {
                output.accept(item.get());
            }
        });
    }));

    public static void init() {
        ITEMS.register();
        TABS.register();
    }
}
