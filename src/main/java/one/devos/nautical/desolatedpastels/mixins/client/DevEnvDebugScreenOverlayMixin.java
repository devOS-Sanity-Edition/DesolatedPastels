package one.devos.nautical.desolatedpastels.mixins.client;

import gay.asoji.fmw.FMW;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import one.devos.nautical.desolatedpastels.DesolatedPastels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(DebugScreenOverlay.class)
public class DevEnvDebugScreenOverlayMixin {
    private static final String sp = "softerpastels";

    @Inject(method = "getSystemInformation", at = @At("RETURN"))
    private void appendInfo(CallbackInfoReturnable<List<String>> cir) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            List<String> messages = cir.getReturnValue();

            messages.add("");
            messages.add("[" + FMW.getName(DesolatedPastels.INSTANCE.getMOD_ID()) + " - Development Environment]");
            messages.add(FMW.getName(sp) + " Version: " + FMW.getVersion(sp));
            messages.add("Internal Library Version: " + FMW.getVersion("innerpastels"));
        }
    }
}

