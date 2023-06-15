package com.stereo528.enriched_entrances;

import eu.midnightdust.lib.config.MidnightConfig;
import com.stereo528.enriched_entrances.Config.ModConfig;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import static com.stereo528.enriched_entrances.EnrichedEntrances.MODID;

public class EnrichedEntrancesClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		MidnightConfig.init(MODID, ModConfig.class);
	}
}
