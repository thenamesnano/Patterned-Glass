/*
    GNU LGPL v3.0
    Copyright (C) 2022 Nano (thenamesnano)

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program; if not, write to the Free Software Foundation,
    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  0211
*/
package com.nanosplace.patternedglass;

import com.nanosplace.patternedglass.util.RegistryHandler;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PatternedGlass.MOD_ID)
public class PatternedGlass {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "patternedglass";
    public static final CreativeModeTab PATTERNED_GLASS_BLOCKS = new CreativeModeTab("patternedglass_blocks") {
        @Override public ItemStack makeIcon() { return new ItemStack(RegistryHandler.BLACK_PATTERNED_GLASS.get()); }};

    // -4020941818228131454
    public PatternedGlass() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);

        RegistryHandler.init(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.WHITE_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.ORANGE_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.MAGENTA_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.YELLOW_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIME_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PINK_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GRAY_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.CYAN_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PURPLE_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLUE_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BROWN_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GREEN_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.RED_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLACK_PATTERNED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.WHITE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.ORANGE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.MAGENTA_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.YELLOW_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIME_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PINK_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GRAY_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.CYAN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PURPLE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLUE_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BROWN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GREEN_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.RED_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLACK_PATTERNED_GLASS_PANE.get(), RenderType.translucent());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}

    /*@SubscribeEvent
    public void onServerStarting(FMLServerStartingContext event) {}*/

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {}
}
