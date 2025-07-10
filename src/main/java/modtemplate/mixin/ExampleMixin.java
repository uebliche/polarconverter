package modtemplate.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(TitleScreen.class)
public class ExampleMixin {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleMixin.class);
    
    @Inject(at = @At("TAIL"), method = "init")
    private static void init(CallbackInfo info) {
        LOGGER.info("Code für Minecraft 1.21.7");
    }
}