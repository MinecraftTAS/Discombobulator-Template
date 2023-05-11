package com.minecrafttas.disco_template.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiMainMenu;

@Mixin(GuiMainMenu.class)
public class MixinMinceraft {
	
	@Shadow
	//#def
//$$	@org.spongepowered.asm.mixin.Mutable
//$$	private float minceraftRoll;
	//#1.10.2
//$$	private float updateCounter;
	//#end
	
	@Inject(method = "initGui", at = @At("HEAD"))
	public void inject_initGui(CallbackInfo ci) {
		//#def
//$$		minceraftRoll = 0;
		//#1.10.2
//$$		updateCounter = 0;
		//#end
	}
}
