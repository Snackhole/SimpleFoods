package com.snackhole.simplefoods.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemFoodBase porkSandwich = new ItemFoodBase("pork_sandwich", 10, (float) 12, false);
    public static ItemFoodBase beefSandwich = new ItemFoodBase("beef_sandwich", 10, (float) 12, false);
    public static ItemFoodBase muttonSandwich = new ItemFoodBase("mutton_sandwich", 10, (float) 12, false);
    public static ItemFoodBase salmonSandwich = new ItemFoodBase("salmon_sandwich", 10, (float) 12, false);
    public static ItemFoodBase fishSandwich = new ItemFoodBase("fish_sandwich", 10, (float) 12, false);
    public static ItemFoodBase chickenSandwich = new ItemFoodBase("chicken_sandwich", 10, (float) 12, false);
    public static ItemFoodBase rabbitSandwich = new ItemFoodBase("rabbit_sandwich", 10, (float) 12, false);
    public static ItemFoodBase overloadedPotato = new ItemFoodBase("overloaded_potato", 10, (float) 12, false);
    public static ItemFoodBase roastedCarrot = new ItemFoodBase("roasted_carrot", 5, (float) 5.4, false);
    public static ItemFoodBase bakedApple = new ItemFoodBase("baked_apple", 6, (float) 3.6, false);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(porkSandwich, beefSandwich, muttonSandwich, salmonSandwich, fishSandwich, chickenSandwich, rabbitSandwich, overloadedPotato, roastedCarrot, bakedApple);
    }

    public static void registerModels() {
        porkSandwich.registerItemModel();
        beefSandwich.registerItemModel();
        muttonSandwich.registerItemModel();
        salmonSandwich.registerItemModel();
        fishSandwich.registerItemModel();
        chickenSandwich.registerItemModel();
        rabbitSandwich.registerItemModel();
        overloadedPotato.registerItemModel();
        roastedCarrot.registerItemModel();
        bakedApple.registerItemModel();
    }
}
