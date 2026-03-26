package com.kaleblangley.locks_reworked.registries;

import com.kaleblangley.locks_reworked.LocksReworked;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(LocksReworked.MOD_ID, Registries.RECIPE_SERIALIZER);

    public static void init() {
        RECIPE_SERIALIZERS.register();
    }
}
