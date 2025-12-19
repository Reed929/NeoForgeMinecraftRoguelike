package net.reed929.roguelike.worldgen.dimension;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.reed929.roguelike.Roguelike;
import net.reed929.roguelike.worldgen.biome.ModBiomes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final ResourceKey<LevelStem> ROGUELIKEDIM_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "roguelikedim"));
    public static final ResourceKey<Level> ROGUELIKEDIM_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "roguelikedim"));
    public static final ResourceKey<DimensionType> ROGUELIKE_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "roguelike_type"));


    public static void bootstrapType(BootstrapContext<DimensionType> context) {
        context.register(ROGUELIKE_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void bootstrapStem(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseSettingsRegistry = context.lookup(Registries.NOISE_SETTINGS);
        Holder<Biome> dungeonBiome = biomeRegistry.getOrThrow(ModBiomes.DUNGEON_BIOME);

        // Void chunk generator using NoiseBasedChunkGenerator with FixedBiomeSource
        NoiseBasedChunkGenerator voidGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(dungeonBiome),
                noiseSettingsRegistry.getOrThrow(NoiseGeneratorSettings.END));

        // Level stem: link the dimension type with the generator
        LevelStem stem = new LevelStem(
                dimTypes.getOrThrow(ModDimensions.ROGUELIKE_DIM_TYPE),
                voidGenerator);

        context.register(ROGUELIKEDIM_KEY, stem);
    }
}