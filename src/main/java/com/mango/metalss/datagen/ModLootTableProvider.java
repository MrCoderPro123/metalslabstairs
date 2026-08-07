package com.mango.metalss.datagen;

import com.mango.metalss.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        add(ModBlocks.IRON_SLAB, this::createSlabItemTable);
        add(ModBlocks.GOLD_SLAB, this::createSlabItemTable);
        add(ModBlocks.DIAMOND_SLAB, this::createSlabItemTable);
        add(ModBlocks.NETHERITE_SLAB, this::createSlabItemTable);
        add(ModBlocks.EMERALD_SLAB, this::createSlabItemTable);
        add(ModBlocks.LAPIS_SLAB, this::createSlabItemTable);
        add(ModBlocks.AMETHYST_SLAB, this::createSlabItemTable);
        add(ModBlocks.REDSTONE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.IRON_STAIRS);
        dropSelf(ModBlocks.GOLD_STAIRS);
        dropSelf(ModBlocks.DIAMOND_STAIRS);
        dropSelf(ModBlocks.NETHERITE_STAIRS);
        dropSelf(ModBlocks.EMERALD_STAIRS);
        dropSelf(ModBlocks.LAPIS_STAIRS);
        dropSelf(ModBlocks.AMETHYST_STAIRS);
        dropSelf(ModBlocks.REDSTONE_STAIRS);
    }
}
