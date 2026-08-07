package com.mango.metalss.datagen;

import com.mango.metalss.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.family(Blocks.IRON_BLOCK)
                .slab(ModBlocks.IRON_SLAB)
                .stairs(ModBlocks.IRON_STAIRS);

        blockModelGenerators.family(Blocks.GOLD_BLOCK)
                .slab(ModBlocks.GOLD_SLAB)
                .stairs(ModBlocks.GOLD_STAIRS);

        blockModelGenerators.family(Blocks.DIAMOND_BLOCK)
                .slab(ModBlocks.DIAMOND_SLAB)
                .stairs(ModBlocks.DIAMOND_STAIRS);

        blockModelGenerators.family(Blocks.NETHERITE_BLOCK)
                .slab(ModBlocks.NETHERITE_SLAB)
                .stairs(ModBlocks.NETHERITE_STAIRS);

        blockModelGenerators.family(Blocks.EMERALD_BLOCK)
                .slab(ModBlocks.EMERALD_SLAB)
                .stairs(ModBlocks.EMERALD_STAIRS);

        blockModelGenerators.family(Blocks.LAPIS_BLOCK)
                .slab(ModBlocks.LAPIS_SLAB)
                .stairs(ModBlocks.LAPIS_STAIRS);

        blockModelGenerators.family(Blocks.AMETHYST_BLOCK)
                .slab(ModBlocks.AMETHYST_SLAB)
                .stairs(ModBlocks.AMETHYST_STAIRS);

        blockModelGenerators.family(Blocks.REDSTONE_BLOCK)
                .slab(ModBlocks.REDSTONE_SLAB)
                .stairs(ModBlocks.REDSTONE_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
