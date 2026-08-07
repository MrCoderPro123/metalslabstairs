package com.mango.metalss;

import com.mango.metalss.datagen.ModBlockTagsProvider;
import com.mango.metalss.datagen.ModLootTableProvider;
import com.mango.metalss.datagen.ModModelsProvider;
import com.mango.metalss.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MetalSlabsStairsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
	}
}
