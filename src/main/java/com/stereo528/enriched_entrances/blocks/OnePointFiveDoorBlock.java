package com.stereo528.enriched_entrances.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class OnePointFiveDoorBlock extends DoorBlock {
	protected static final VoxelShape SOUTH_AABB;
	protected static final VoxelShape NORTH_AABB;
	protected static final VoxelShape WEST_AABB;
	protected static final VoxelShape EAST_AABB;
	public OnePointFiveDoorBlock(Properties properties, BlockSetType blockSetType) {
		super(properties, blockSetType);
	}

	public @NotNull VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		Direction direction = (Direction)blockState.getValue(FACING);
		boolean bl = !(Boolean)blockState.getValue(OPEN);
		boolean bl2 = blockState.getValue(HINGE) == DoorHingeSide.RIGHT;
		return switch (direction) {
			default -> bl ? EAST_AABB : (bl2 ? NORTH_AABB : SOUTH_AABB);
			case SOUTH -> bl ? SOUTH_AABB : (bl2 ? EAST_AABB : WEST_AABB);
			case WEST -> bl ? WEST_AABB : (bl2 ? SOUTH_AABB : NORTH_AABB);
			case NORTH -> bl ? NORTH_AABB : (bl2 ? WEST_AABB : EAST_AABB);
		};
	}

	static {
		SOUTH_AABB = Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 3.0);
		NORTH_AABB = Block.box(0.0, 0.0, 13.0, 16.0, 12.0, 16.0);
		WEST_AABB = Block.box(13.0, 0.0, 0.0, 16.0, 12.0, 16.0);
		EAST_AABB = Block.box(0.0, 0.0, 0.0, 3.0, 12.0, 16.0);
	}
}
