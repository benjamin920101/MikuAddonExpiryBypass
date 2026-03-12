package com.example.expirybypass;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpiryBypassMod implements ModInitializer {

    public static final String MOD_ID = "expirybypass";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("ExpiryBypass loaded.");
    }
}
