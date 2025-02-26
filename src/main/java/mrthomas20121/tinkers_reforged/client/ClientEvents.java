package mrthomas20121.tinkers_reforged.client;

import mrthomas20121.tinkers_reforged.TinkersReforged;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import slimeknights.tconstruct.shared.CommonsClientEvents;

@Mod.EventBusSubscriber(modid = TinkersReforged.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    static void clientSetup(final FMLClientSetupEvent event) {
        TinkersReforgedBook.REFORGING_GUIDE.fontRenderer = CommonsClientEvents.unicodeFontRender();
    }
}
