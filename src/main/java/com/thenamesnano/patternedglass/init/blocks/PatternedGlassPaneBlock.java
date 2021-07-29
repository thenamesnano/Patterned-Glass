package com.thenamesnano.patternedglass.init.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PatternedGlassPaneBlock extends PaneBlock implements IBeaconBeamColorProvider {

    private final DyeColor color;

    public PatternedGlassPaneBlock(DyeColor color) {
        super(Properties.of(Material.GLASS)
                .strength(0.3F)
                .sound(SoundType.GLASS)
                .noOcclusion()
                .isValidSpawn(PatternedGlassPaneBlock::never)
                .isRedstoneConductor(PatternedGlassPaneBlock::never)
                .isSuffocating(PatternedGlassPaneBlock::never)
                .isViewBlocking(PatternedGlassPaneBlock::never));
        this.color = color;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(NORTH, Boolean.valueOf(false))
                .setValue(EAST, Boolean.valueOf(false))
                .setValue(SOUTH, Boolean.valueOf(false))
                .setValue(WEST, Boolean.valueOf(false))
                .setValue(WATERLOGGED, Boolean.valueOf(false)));

    }

    private static boolean never(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    private static boolean never(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entityType) {
        return false;
    }

    public DyeColor getColor() {
        return this.color;
    }
}
