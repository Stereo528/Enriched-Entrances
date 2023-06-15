package com.stereo528.enriched_entrances;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnrichedEntrances implements ModInitializer {
	public static final String MODID = "enriched_entrances";
	public static final Logger LOGGER = LoggerFactory.getLogger("EnrichedEntrances");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
		Blocks.init();
	}
}
