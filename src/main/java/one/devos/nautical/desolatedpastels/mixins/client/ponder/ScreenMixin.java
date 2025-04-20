package one.devos.nautical.desolatedpastels.mixins.client.ponder;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import one.devos.nautical.desolatedpastels.client.ponder.DesolatedScreenExtension;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Screen.class)
public abstract class ScreenMixin implements DesolatedScreenExtension {
    @Unique private Screen desolated$parent;

    @Override
    public void desolated_setParent(@Nullable Screen parent) {
        this.desolated$parent = parent;
    }

    @ModifyArg(method = "onClose", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;setScreen(Lnet/minecraft/client/gui/screens/Screen;)V"))
    private Screen desolated$closeToParent(Screen original) {
        if (desolated$parent != null) {
            return desolated$parent;
        } else {
            return original;
        }
    }
}
