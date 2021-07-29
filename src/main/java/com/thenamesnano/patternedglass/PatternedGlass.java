package com.thenamesnano.patternedglass;

import com.thenamesnano.patternedglass.util.RegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("patternedglass")
public class PatternedGlass
{
    private static final Logger LOGGER = LogManager.getLogger();

    // Hardcoded Mod Identification
    public static final String MOD_ID = "patternedglass";

    // ItemGroup Declaration
    public static final ItemGroup PATTERNED_GLASS_BLOCKS = new ItemGroup("patternedglass_blocks") {
        @Override
        public ItemStack makeIcon() { return new ItemStack(RegistryHandler.BLACK_PATTERNED_GLASS.get()); }};

    // -4020941818228131454
    // Begin Mod
    public PatternedGlass() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(RegistryHandler.WHITE_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.ORANGE_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.MAGENTA_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.YELLOW_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIME_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PINK_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GRAY_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CYAN_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PURPLE_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLUE_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BROWN_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GREEN_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.RED_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLACK_PATTERNED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.WHITE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.ORANGE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.MAGENTA_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.YELLOW_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIME_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PINK_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GRAY_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CYAN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.PURPLE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLUE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BROWN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GREEN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.RED_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.BLACK_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {}
}
