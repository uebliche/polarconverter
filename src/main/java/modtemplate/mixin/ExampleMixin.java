package modtemplate.mixin;

import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.gui.screens.TitleScreen;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(TitleScreen.class)
public class ExampleMixin {
    @Shadow @Nullable private SplashRenderer splash;

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleMixin.class);
    
    @Inject(at = @At("TAIL"), method = "init")
    private static void init(CallbackInfo info) {
        LOGGER.info("Code für Minecraft 1.21.7");
    }
}