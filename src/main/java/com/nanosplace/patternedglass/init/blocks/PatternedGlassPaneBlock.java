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

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

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
