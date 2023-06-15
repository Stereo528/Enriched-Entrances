package com.stereo528.enriched_entrances;

import com.stereo528.enriched_entrances.blocks.HalfDoorBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;

import static com.stereo528.enriched_entrances.EnrichedEntrances.MODID;

public class Blocks {


	public static final Block OAK_HALF_DOOR = register("oak_one_point_five_door" , new HalfDoorBlock(BlockBehaviour.Properties.of().mapColor(OAK_PLANKS.defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(3.0F).noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));

	public static void init() {
	}

	public static Block register(String name, Block block) {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new QuiltItemSettings()));
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
	}
}
