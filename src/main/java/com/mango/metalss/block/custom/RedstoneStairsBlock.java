package com.mango.metalss.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneStairsBlock extends StairBlock {
    public RedstoneStairsBlock(BlockState baseState, Properties properties) {
        super(baseState, properties);
    }

    @Override
    protected boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected int ownSignal(BlockState state, BlockGetter level, BlockPos pos) {
        return 15;
    }
}
