package net.im_maker.wallpapers.common.events;

import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.item.ModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Wallpapers.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItems.RED_WALLPAPER_ROLL.get(), 2),
                new ItemStack(ModItems.BLUE_WALLPAPER_ROLL.get(), 2),
                new ItemStack(ModItems.PRIMARY_WALLPAPER_ROLL.get(), 16),
                16, 17, 0.7f));
    }
}