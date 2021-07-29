package com.thenamesnano.patternedglass.util;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.init.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PatternedGlass.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PatternedGlass.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
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
