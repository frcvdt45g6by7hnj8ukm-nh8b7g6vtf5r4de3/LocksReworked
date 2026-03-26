package com.kaleblangley.locks_reworked.registries;

import com.kaleblangley.locks_reworked.LocksReworked;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(LocksReworked.MOD_ID, Registries.SOUND_EVENT);

    public static void init() {
        SOUND_EVENTS.register();
    }
}
