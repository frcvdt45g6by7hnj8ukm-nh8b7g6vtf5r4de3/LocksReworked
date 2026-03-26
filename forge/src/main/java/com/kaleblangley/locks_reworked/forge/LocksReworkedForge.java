package com.kaleblangley.locks_reworked.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.kaleblangley.locks_reworked.LocksReworked;

@Mod(LocksReworked.MOD_ID)
public final class LocksReworkedForge {

    @SuppressWarnings("removal")
    public LocksReworkedForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(LocksReworked.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        LocksReworked.init();
    }
}
