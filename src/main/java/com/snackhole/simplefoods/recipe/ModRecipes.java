package com.snackhole.simplefoods.recipe;

import com.snackhole.simplefoods.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(Items.CARROT, new ItemStack(ModItems.roastedCarrot), (float) 0.1);
        GameRegistry.addSmelting(Items.APPLE, new ItemStack(ModItems.bakedApple), (float) 0.1);
    }
}
