package com.littlet6109.numiscan;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(com.littlet6109.numiscan.NumiScan.MODID)
public class NumiScan {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "numiscan";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public NumiScan(IEventBus modEventBus, ModContainer modContainer) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        LOGGER.info("Hello, world!");
    }
}
