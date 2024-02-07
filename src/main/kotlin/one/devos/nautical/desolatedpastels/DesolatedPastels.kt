package one.devos.nautical.desolatedpastels

import gay.asoji.fmw.FMW
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.fabricmc.loader.api.metadata.ModDependency
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DesolatedPastels : ModInitializer {
    companion object {
        val MOD_ID: String = "desolatedpastels"
        val MOD_VERSION: String = FMW.getVersionString(MOD_ID)
        val MOD_NAME: String = FMW.getName(MOD_ID)

        // This logger is used to write text to the console and the log file.
        // It is considered best practice to use your mod id as the logger's name.
        // That way, it's clear which mod wrote info, warnings, and errors.
        val LOGGER: Logger = LoggerFactory.getLogger("desolatedpastels")
    }

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("${MOD_NAME} loaded! Versions ${MOD_VERSION}")
    }
}