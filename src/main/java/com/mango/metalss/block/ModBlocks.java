package com.mango.metalss.block;

import com.mango.metalss.MetalSlabsStairs;
import com.mango.metalss.block.custom.RedstoneSlabBlock;
import com.mango.metalss.block.custom.RedstoneStairsBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.function.Function;

public class ModBlocks {
    public static final Block IRON_SLAB = registerBlock("iron_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.IRON)));
    public static final Block IRON_STAIRS = registerBlock("iron_stairs", properties -> new StairBlock(Blocks.IRON_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.IRON)));

    public static final Block GOLD_SLAB = registerBlock("gold_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(3.0f, 6.0f).sound(SoundType.METAL)));
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs", properties -> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(3.0f, 6.0f).sound(SoundType.METAL)));

    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));
    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs", properties -> new StairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)));

    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK)));
    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs", properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK)));

    public static final Block EMERALD_SLAB = registerBlock("emerald_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT)));
    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs", properties -> new StairBlock(Blocks.EMERALD_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT)));

    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs", properties -> new StairBlock(Blocks.LAPIS_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(3.0f, 3.0f)));

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab", properties -> new SlabBlock(properties.requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.AMETHYST).noOcclusion()));
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs", properties -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(1.5f).sound(SoundType.AMETHYST).noOcclusion()));

    public static final Block REDSTONE_SLAB = registerBlock("redstone_slab", properties -> new RedstoneSlabBlock(properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL).isRedstoneConductor(Blocks::never)));
    public static final Block REDSTONE_STAIRS = registerBlock("redstone_stairs", properties -> new RedstoneStairsBlock(Blocks.REDSTONE_BLOCK.defaultBlockState(), properties.requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL).isRedstoneConductor(Blocks::never)));


    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MetalSlabsStairs.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MetalSlabsStairs.MOD_ID, name), toRegister);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MetalSlabsStairs.MOD_ID, name), new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MetalSlabsStairs.MOD_ID, name))).useBlockDescriptionPrefix()));
    }

    public static ResourceKey<Block> getResourceKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        MetalSlabsStairs.LOGGER.info("Registering Blocks for " + MetalSlabsStairs.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(ModBlocks.IRON_SLAB);
            output.accept(ModBlocks.IRON_STAIRS);
            output.accept(ModBlocks.GOLD_SLAB);
            output.accept(ModBlocks.GOLD_STAIRS);
            output.accept(ModBlocks.DIAMOND_STAIRS);
            output.accept(ModBlocks.DIAMOND_SLAB);
            output.accept(ModBlocks.NETHERITE_STAIRS);
            output.accept(ModBlocks.NETHERITE_SLAB);
            output.accept(ModBlocks.EMERALD_STAIRS);
            output.accept(ModBlocks.EMERALD_SLAB);
            output.accept(ModBlocks.LAPIS_STAIRS);
            output.accept(ModBlocks.LAPIS_SLAB);
            output.accept(ModBlocks.AMETHYST_STAIRS);
            output.accept(ModBlocks.AMETHYST_SLAB);
            output.accept(ModBlocks.REDSTONE_STAIRS);
            output.accept(ModBlocks.REDSTONE_SLAB);
        });
    }
}
