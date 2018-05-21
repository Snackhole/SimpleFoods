package com.snackhole.simplefoods.items;

import com.snackhole.simplefoods.SimpleFoodsMain;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {
    protected String name;

    public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        SimpleFoodsMain.proxy.registerItemRenderer(this, 0, name);
    }
}
