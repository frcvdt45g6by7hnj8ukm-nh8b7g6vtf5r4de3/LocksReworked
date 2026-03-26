package com.kaleblangley.locks_reworked;

import com.kaleblangley.locks_reworked.registries.ModItems;
import com.kaleblangley.locks_reworked.registries.ModRecipeSerializers;
import com.kaleblangley.locks_reworked.registries.ModSoundEvents;

public final class LocksReworked {
    public static final String MOD_ID = "locks_reworked";

    public static void init() {
        ModItems.init();
        ModRecipeSerializers.init();
        ModSoundEvents.init();
    }
}
