package com.bitl.chrysalis.items;

import com.bitl.chrysalis.Chrysalis;
import net.minecraft.item.ItemFood;

public class ItemUnbreadedChickenNugget extends ItemFood
{
    public ItemUnbreadedChickenNugget(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setCreativeTab(Chrysalis.CHRISSY_TAB);
    }
}