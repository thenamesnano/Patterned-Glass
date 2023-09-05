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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PatternedGlass.MOD_ID)
public class PatternedGlass {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "patternedglass";

    // -4020941818228131454
    public PatternedGlass() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {}
}
