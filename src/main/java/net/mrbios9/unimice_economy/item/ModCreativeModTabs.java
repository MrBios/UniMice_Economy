package net.mrbios9.unimice_economy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrbios9.unimice_economy.UniMice_Economy;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UniMice_Economy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECONOMY_TAB = CREATIVE_MOD_TABS.register("unimice_economy_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.COIN.get()))
            .title(Component.translatable("creativetab.unimice_economy_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.COIN.get());
            })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
