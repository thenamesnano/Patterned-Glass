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
package com.nanosplace.patternedglass.init.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PatternedGlassBlock extends AbstractGlassBlock implements BeaconBeamBlock {

    private final DyeColor color;
    static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PatternedGlassBlock(DyeColor color) {
        super(Block.Properties.of()
                .strength(0.3F)
                .sound(SoundType.GLASS)
                .noOcclusion()
                .isValidSpawn((state, getter, pos, entity) -> false)
                .isRedstoneConductor((state, getter, pos) -> false)
                .isSuffocating((state, getter, pos) -> false)
                .isViewBlocking((state, getter, pos) -> false));

        this.color = color;
    }

    private static boolean never(BlockState state, LevelReader reader, BlockPos pos) {
        return false;
    }

    private static boolean never(BlockState state, LevelReader reader, BlockPos pos, EntityType<?> entityType) {
        return false;
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    /*@Override
    @OnlyIn(Dist.CLIENT)
    public boolean skipRendering(BlockState state1, BlockState state2, Direction dir) {
        return state2.is(this) ? true : super.skipRendering(state1, state2, dir);
    }*/

    /*@Override
    public PushReaction getPistonPushReaction() {
        return PushReaction.PUSH_ONLY;
    }*/

    /*@Override
    public VoxelShape getVisualShape(BlockGetter getter, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }*/

    @OnlyIn(Dist.CLIENT)
    public float getShadeBrightness(BlockState state, LevelReader reader, BlockPos pos) {
        return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    @Override
    public DyeColor getColor() {
        return this.color;
    }
}
