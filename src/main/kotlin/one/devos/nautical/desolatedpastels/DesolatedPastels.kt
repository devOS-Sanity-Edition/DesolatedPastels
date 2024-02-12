package one.devos.nautical.desolatedpastels

import gay.asoji.fmw.FMW
import net.fabricmc.api.ModInitializer
import one.devos.nautical.desolatedpastels.common.Blocks
import one.devos.nautical.desolatedpastels.common.Items
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
        val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    }

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        Items.init()
        Blocks.init()

        LOGGER.info("${MOD_NAME} loaded! ${MOD_NAME} Version ${MOD_VERSION}, paired with ${FMW.getName("softerpastels")} Version ${FMW.getVersionString("softerpastels")}.")
    }
}