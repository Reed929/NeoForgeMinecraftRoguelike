package net.reed929.roguelike.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.*;
import net.reed929.roguelike.Roguelike;

public class ModBiomes {
    public static final ResourceKey<Biome> DUNGEON_BIOME = ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(Roguelike.MOD_ID, "dungeon_biome"));

    public static void boostrap(BootstrapContext<Biome> context) {
        context.register(DUNGEON_BIOME, dungeonBiome(context));
    }


    public static Biome dungeonBiome(BootstrapContext<Biome> context) {
        // No mob spawning
        MobSpawnSettings spawnSettings = new MobSpawnSettings.Builder().build();

        BiomeGenerationSettings generationSettings = new BiomeGenerationSettings.Builder(
                context.lookup(Registries.PLACED_FEATURE),
                context.lookup(Registries.CONFIGURED_CARVER)
        ).build();

        // Void sky and fog settings
        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
                .skyColor(0x000000)       // black sky
                .fogColor(0x000000)       // black fog
                .waterColor(0x000000)     // optional
                .waterFogColor(0x000000)  // optional
                .build();

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(0.0f)
                .downfall(0.0f)
                .generationSettings(generationSettings)
                .mobSpawnSettings(spawnSettings)
                .specialEffects(effects)  // make sure this is not null
                .build();
    }

}
