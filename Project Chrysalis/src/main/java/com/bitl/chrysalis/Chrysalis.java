package com.bitl.chrysalis;

import com.bitl.chrysalis.gui.QueenChrysalisesLovelyCreativeTabWithChickenNuggies;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.bitl.chrysalis.proxy.IProxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Chrysalis.MODID, name = Chrysalis.NAME, version = Chrysalis.VERSION, acceptedMinecraftVersions = Chrysalis.MC_VERSION)
public class Chrysalis
{
    public static final String MODID = "projectchrysalis";
    public static final String NAME = "Bitl's Chillspot Server Plugin";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final Logger LOGGER = LogManager.getLogger(Chrysalis.MODID);

    public static final String CLIENT = "com.bitl.chrysalis.proxy.ClientProxy";
    public static final String SERVER = "com.bitl.chrysalis.proxy.ServerProxy";
    @SidedProxy(clientSide = Chrysalis.CLIENT, serverSide = Chrysalis.SERVER)
    public static IProxy proxy;

    public static final CreativeTabs CHRISSY_TAB = new QueenChrysalisesLovelyCreativeTabWithChickenNuggies();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LOGGER.info(event.getModLog());
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
