package io.github.saltyyyx.softdrinks;

import io.github.saltyyyx.softdrinks.init.CreativeTabInit;
import io.github.saltyyyx.softdrinks.init.ItemInit;
import io.github.saltyyyx.softdrinks.init.BlockInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier;

@Mod(SoftDrinks.MODID)
public class SoftDrinks {
    public static final String MODID = "softdrinks";

    public SoftDrinks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
