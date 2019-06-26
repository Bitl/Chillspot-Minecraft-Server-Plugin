package com.bitl.chrysalis.gui;

import com.bitl.chrysalis.ChrissyItems;
import com.bitl.chrysalis.Chrysalis;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class QueenChrysalisesLovelyCreativeTabWithChickenNuggies extends CreativeTabs
{
    public QueenChrysalisesLovelyCreativeTabWithChickenNuggies()
    {
        super(Chrysalis.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ChrissyItems.CHICKEN_NUGGIES);
    }
}
