package com.mango.metalss.datagen;

import com.mango.metalss.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Blocks.IRON_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SLAB, Blocks.NETHERITE_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_SLAB, Blocks.REDSTONE_BLOCK);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS, Blocks.IRON_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS, Blocks.GOLD_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIRS, Blocks.DIAMOND_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_STAIRS, Blocks.NETHERITE_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_STAIRS, Blocks.EMERALD_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_STAIRS, Blocks.LAPIS_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_STAIRS, Blocks.REDSTONE_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Blocks.IRON_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SLAB, Blocks.NETHERITE_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_SLAB, Blocks.REDSTONE_BLOCK, 2);

                stairBuilder(ModBlocks.GOLD_STAIRS, Ingredient.of(Blocks.GOLD_BLOCK))
                        .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                        .group("gold")
                        .save(output);

                stairBuilder(ModBlocks.IRON_STAIRS, Ingredient.of(Blocks.IRON_BLOCK))
                        .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                        .group("iron")
                        .save(output);

                stairBuilder(ModBlocks.DIAMOND_STAIRS, Ingredient.of(Blocks.DIAMOND_BLOCK))
                        .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                        .group("diamond")
                        .save(output);

                stairBuilder(ModBlocks.NETHERITE_STAIRS, Ingredient.of(Blocks.NETHERITE_BLOCK))
                        .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK), has(Blocks.NETHERITE_BLOCK))
                        .group("netherite")
                        .save(output);

                stairBuilder(ModBlocks.EMERALD_STAIRS, Ingredient.of(Blocks.EMERALD_BLOCK))
                        .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                        .group("emerald")
                        .save(output);

                stairBuilder(ModBlocks.LAPIS_STAIRS, Ingredient.of(Blocks.LAPIS_BLOCK))
                        .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                        .group("lapis")
                        .save(output);

                stairBuilder(ModBlocks.AMETHYST_STAIRS, Ingredient.of(Blocks.AMETHYST_BLOCK))
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .group("amethyst")
                        .save(output);

                stairBuilder(ModBlocks.REDSTONE_STAIRS, Ingredient.of(Blocks.REDSTONE_BLOCK))
                        .unlockedBy(getHasName(Blocks.REDSTONE_BLOCK), has(Blocks.REDSTONE_BLOCK))
                        .group("redstone")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
