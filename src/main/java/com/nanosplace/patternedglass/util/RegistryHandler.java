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
package com.nanosplace.patternedglass.util;

import com.nanosplace.patternedglass.PatternedGlass;
import com.nanosplace.patternedglass.init.blocks.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PatternedGlass.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PatternedGlass.MOD_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }

    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(PatternedGlass.MOD_ID, "blocks"), builder ->
                builder.title(Component.translatable("itemGroup." + PatternedGlass.MOD_ID + ".blocks"))
                        .icon(() -> new ItemStack(RegistryHandler.BLACK_PATTERNED_GLASS.get()))
                        .displayItems((enabledFlags, populator, hasPermissions) -> {
                            for (RegistryObject<Item> item : ITEMS.getEntries()) {
                                populator.accept(item.get());
                            }
                            for (RegistryObject<Block> block : BLOCKS.getEntries()) {
                                populator.accept(block.get());
                            }
                        })
        );
    }

    // Blocks ----------------------------------------------------------------------------------------------------------
    public static final RegistryObject<PatternedGlassBlock> WHITE_PATTERNED_GLASS = BLOCKS.register("white_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.WHITE));
    public static final RegistryObject<PatternedGlassBlock> ORANGE_PATTERNED_GLASS = BLOCKS.register("orange_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.ORANGE));
    public static final RegistryObject<PatternedGlassBlock> MAGENTA_PATTERNED_GLASS = BLOCKS.register("magenta_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.MAGENTA));
    public static final RegistryObject<PatternedGlassBlock> LIGHT_BLUE_PATTERNED_GLASS = BLOCKS.register("light_blue_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<PatternedGlassBlock> YELLOW_PATTERNED_GLASS = BLOCKS.register("yellow_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.YELLOW));
    public static final RegistryObject<PatternedGlassBlock> LIME_PATTERNED_GLASS = BLOCKS.register("lime_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.LIME));
    public static final RegistryObject<PatternedGlassBlock> PINK_PATTERNED_GLASS = BLOCKS.register("pink_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.PINK));
    public static final RegistryObject<PatternedGlassBlock> GRAY_PATTERNED_GLASS = BLOCKS.register("gray_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.GRAY));
    public static final RegistryObject<PatternedGlassBlock> LIGHT_GRAY_PATTERNED_GLASS = BLOCKS.register("light_gray_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<PatternedGlassBlock> CYAN_PATTERNED_GLASS = BLOCKS.register("cyan_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.CYAN));
    public static final RegistryObject<PatternedGlassBlock> PURPLE_PATTERNED_GLASS = BLOCKS.register("purple_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.PURPLE));
    public static final RegistryObject<PatternedGlassBlock> BLUE_PATTERNED_GLASS = BLOCKS.register("blue_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.BLUE));
    public static final RegistryObject<PatternedGlassBlock> BROWN_PATTERNED_GLASS = BLOCKS.register("brown_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.BROWN));
    public static final RegistryObject<PatternedGlassBlock> GREEN_PATTERNED_GLASS = BLOCKS.register("green_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.GREEN));
    public static final RegistryObject<PatternedGlassBlock> RED_PATTERNED_GLASS = BLOCKS.register("red_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.RED));
    public static final RegistryObject<PatternedGlassBlock> BLACK_PATTERNED_GLASS = BLOCKS.register("black_patterned_glass",
            () -> new PatternedGlassBlock(DyeColor.BLACK));

    public static final RegistryObject<PatternedGlassPaneBlock> WHITE_PATTERNED_GLASS_PANE = BLOCKS.register("white_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.WHITE));
    public static final RegistryObject<PatternedGlassPaneBlock> ORANGE_PATTERNED_GLASS_PANE = BLOCKS.register("orange_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.ORANGE));
    public static final RegistryObject<PatternedGlassPaneBlock> MAGENTA_PATTERNED_GLASS_PANE = BLOCKS.register("magenta_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.MAGENTA));
    public static final RegistryObject<PatternedGlassPaneBlock> LIGHT_BLUE_PATTERNED_GLASS_PANE = BLOCKS.register("light_blue_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<PatternedGlassPaneBlock> YELLOW_PATTERNED_GLASS_PANE = BLOCKS.register("yellow_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.YELLOW));
    public static final RegistryObject<PatternedGlassPaneBlock> LIME_PATTERNED_GLASS_PANE = BLOCKS.register("lime_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.LIME));
    public static final RegistryObject<PatternedGlassPaneBlock> PINK_PATTERNED_GLASS_PANE = BLOCKS.register("pink_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.PINK));
    public static final RegistryObject<PatternedGlassPaneBlock> GRAY_PATTERNED_GLASS_PANE = BLOCKS.register("gray_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.GRAY));
    public static final RegistryObject<PatternedGlassPaneBlock> LIGHT_GRAY_PATTERNED_GLASS_PANE = BLOCKS.register("light_gray_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<PatternedGlassPaneBlock> CYAN_PATTERNED_GLASS_PANE = BLOCKS.register("cyan_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.CYAN));
    public static final RegistryObject<PatternedGlassPaneBlock> PURPLE_PATTERNED_GLASS_PANE = BLOCKS.register("purple_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.PURPLE));
    public static final RegistryObject<PatternedGlassPaneBlock> BLUE_PATTERNED_GLASS_PANE = BLOCKS.register("blue_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.BLUE));
    public static final RegistryObject<PatternedGlassPaneBlock> BROWN_PATTERNED_GLASS_PANE = BLOCKS.register("brown_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.BROWN));
    public static final RegistryObject<PatternedGlassPaneBlock> GREEN_PATTERNED_GLASS_PANE = BLOCKS.register("green_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.GREEN));
    public static final RegistryObject<PatternedGlassPaneBlock> RED_PATTERNED_GLASS_PANE = BLOCKS.register("red_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.RED));
    public static final RegistryObject<PatternedGlassPaneBlock> BLACK_PATTERNED_GLASS_PANE = BLOCKS.register("black_patterned_glass_pane",
            () -> new PatternedGlassPaneBlock(DyeColor.BLACK));


    // Block Items -----------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> WHITE_PATTERNED_GLASS_ITEM = ITEMS.register("white_patterned_glass",
            () -> new BlockItemBase(WHITE_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> ORANGE_PATTERNED_GLASS_ITEM = ITEMS.register("orange_patterned_glass",
            () -> new BlockItemBase(ORANGE_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> MAGENTA_PATTERNED_GLASS_ITEM = ITEMS.register("magenta_patterned_glass",
            () -> new BlockItemBase(MAGENTA_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PATTERNED_GLASS_ITEM = ITEMS.register("light_blue_patterned_glass",
            () -> new BlockItemBase(LIGHT_BLUE_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> YELLOW_PATTERNED_GLASS_ITEM = ITEMS.register("yellow_patterned_glass",
            () -> new BlockItemBase(YELLOW_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> LIME_PATTERNED_GLASS_ITEM = ITEMS.register("lime_patterned_glass",
            () -> new BlockItemBase(LIME_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> PINK_PATTERNED_GLASS_ITEM = ITEMS.register("pink_patterned_glass",
            () -> new BlockItemBase(PINK_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> GRAY_PATTERNED_GLASS_ITEM = ITEMS.register("gray_patterned_glass",
            () -> new BlockItemBase(GRAY_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PATTERNED_GLASS_ITEM = ITEMS.register("light_gray_patterned_glass",
            () -> new BlockItemBase(LIGHT_GRAY_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> CYAN_PATTERNED_GLASS_ITEM = ITEMS.register("cyan_patterned_glass",
            () -> new BlockItemBase(CYAN_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> PURPLE_PATTERNED_GLASS_ITEM = ITEMS.register("purple_patterned_glass",
            () -> new BlockItemBase(PURPLE_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> BLUE_PATTERNED_GLASS_ITEM = ITEMS.register("blue_patterned_glass",
            () -> new BlockItemBase(BLUE_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> BROWN_PATTERNED_GLASS_ITEM = ITEMS.register("brown_patterned_glass",
            () -> new BlockItemBase(BROWN_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> GREEN_PATTERNED_GLASS_ITEM = ITEMS.register("green_patterned_glass",
            () -> new BlockItemBase(GREEN_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> RED_PATTERNED_GLASS_ITEM = ITEMS.register("red_patterned_glass",
            () -> new BlockItemBase(RED_PATTERNED_GLASS.get()));
    public static final RegistryObject<Item> BLACK_PATTERNED_GLASS_ITEM = ITEMS.register("black_patterned_glass",
            () -> new BlockItemBase(BLACK_PATTERNED_GLASS.get()));

    public static final RegistryObject<Item> WHITE_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("white_patterned_glass_pane",
            () -> new BlockItemBase(WHITE_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> ORANGE_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("orange_patterned_glass_pane",
            () -> new BlockItemBase(ORANGE_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> MAGENTA_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("magenta_patterned_glass_pane",
            () -> new BlockItemBase(MAGENTA_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("light_blue_patterned_glass_pane",
            () -> new BlockItemBase(LIGHT_BLUE_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> YELLOW_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("yellow_patterned_glass_pane",
            () -> new BlockItemBase(YELLOW_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> LIME_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("lime_patterned_glass_pane",
            () -> new BlockItemBase(LIME_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> PINK_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("pink_patterned_glass_pane",
            () -> new BlockItemBase(PINK_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> GRAY_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("gray_patterned_glass_pane",
            () -> new BlockItemBase(GRAY_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("light_gray_patterned_glass_pane",
            () -> new BlockItemBase(LIGHT_GRAY_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> CYAN_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("cyan_patterned_glass_pane",
            () -> new BlockItemBase(CYAN_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> PURPLE_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("purple_patterned_glass_pane",
            () -> new BlockItemBase(PURPLE_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> BLUE_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("blue_patterned_glass_pane",
            () -> new BlockItemBase(BLUE_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> BROWN_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("brown_patterned_glass_pane",
            () -> new BlockItemBase(BROWN_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> GREEN_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("green_patterned_glass_pane",
            () -> new BlockItemBase(GREEN_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> RED_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("red_patterned_glass_pane",
            () -> new BlockItemBase(RED_PATTERNED_GLASS_PANE.get()));
    public static final RegistryObject<Item> BLACK_PATTERNED_GLASS_PANE_ITEM = ITEMS.register("black_patterned_glass_pane",
            () -> new BlockItemBase(BLACK_PATTERNED_GLASS_PANE.get()));
}
