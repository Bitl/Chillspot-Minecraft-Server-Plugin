package com.bitl.chrysalis.items;

import com.bitl.chrysalis.Chrysalis;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFryingOil extends Item
{
    public ItemFryingOil()
    {
        setCreativeTab(Chrysalis.CHRISSY_TAB);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return 300; // same value as vanilla log
    }
}
