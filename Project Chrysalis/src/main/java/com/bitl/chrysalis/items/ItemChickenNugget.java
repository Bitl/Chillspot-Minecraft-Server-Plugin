package com.bitl.chrysalis.items;

import com.bitl.chrysalis.Chrysalis;
import net.minecraft.item.ItemFood;

public class ItemChickenNugget extends ItemFood
{
    public ItemChickenNugget(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setCreativeTab(Chrysalis.CHRISSY_TAB);
    }
}