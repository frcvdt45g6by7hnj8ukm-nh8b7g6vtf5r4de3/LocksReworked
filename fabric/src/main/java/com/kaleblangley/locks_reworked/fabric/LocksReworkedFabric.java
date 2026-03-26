package com.kaleblangley.locks_reworked.fabric;

import net.fabricmc.api.ModInitializer;

import com.kaleblangley.locks_reworked.LocksReworked;

public final class LocksReworkedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        LocksReworked.init();
    }
}
