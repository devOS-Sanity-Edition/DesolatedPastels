package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.sounds.RegisterSounds
import net.minecraft.sounds.SoundEvent
import one.devos.nautical.desolatedpastels.DesolatedPastels

object DesolatedPastelsSoundEvents {
    val MALLARD_DEATH: SoundEvent = RegisterSounds.registerSoundEvent(DesolatedPastels.MOD_ID, "entity.mallard.death")

    val MALLARD_QUACKS: SoundEvent = RegisterSounds.registerSoundEvent(DesolatedPastels.MOD_ID, "entity.mallard.quacks")

    fun init() { }
}