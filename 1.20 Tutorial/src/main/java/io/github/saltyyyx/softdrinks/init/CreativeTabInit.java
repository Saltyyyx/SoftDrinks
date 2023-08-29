package io.github.saltyyyx.softdrinks.init;

import io.github.saltyyyx.softdrinks.SoftDrinks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;




public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoftDrinks.MODID);
    public static final RegistryObject<CreativeModeTab> SOFT_DRINKS = TABS.register("soft_drinks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.soft_drinks_tab"))
                    .icon()
                    .displayItems((displayParams,output) -> {
                      output.accept(ItemInit.EXAMPLE_BLOCKS.get());
                      output.accept(ItemInit.EXAMPLE_ITEM.get());

                    })
                    .build());
}
