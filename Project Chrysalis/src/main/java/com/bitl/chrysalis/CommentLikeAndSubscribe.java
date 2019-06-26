package com.bitl.chrysalis;
import com.bitl.chrysalis.items.ItemChickenNugget;
import com.bitl.chrysalis.items.ItemFryingOil;
import com.bitl.chrysalis.items.ItemUnbreadedChickenNugget;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Chrysalis.MODID)
public final class CommentLikeAndSubscribe
{
    @SubscribeEvent
    public static void registerItems(Register<Item> event)
    {
        final Item[] items = {
                new ItemChickenNugget(3,0.6F, true).setRegistryName("chicken_nuggies").setUnlocalizedName(Chrysalis.MODID + "." + "chicken_nuggies"),
                new ItemUnbreadedChickenNugget(2, 0.4F, true).setRegistryName("unbreaded_chicken_nuggies").setUnlocalizedName(Chrysalis.MODID + "." + "unbreaded_chicken_nuggies"),
                new ItemFryingOil().setRegistryName("frying_oil").setUnlocalizedName(Chrysalis.MODID + "." + "frying_oil"),
        };

        event.getRegistry().registerAll(items);
    }
}
