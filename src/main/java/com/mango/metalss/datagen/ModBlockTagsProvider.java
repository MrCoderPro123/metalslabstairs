package com.mango.metalss.datagen;

import com.mango.metalss.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_SLAB));

        builder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_STAIRS));

        builder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_STAIRS));

        builder(BlockTags.STAIRS)
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_STAIRS))
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_STAIRS));

        builder(BlockTags.SLABS)
                .add(ModBlocks.getResourceKey(ModBlocks.GOLD_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.DIAMOND_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.NETHERITE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.EMERALD_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.LAPIS_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.AMETHYST_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.REDSTONE_SLAB))
                .add(ModBlocks.getResourceKey(ModBlocks.IRON_SLAB));
    }
}
