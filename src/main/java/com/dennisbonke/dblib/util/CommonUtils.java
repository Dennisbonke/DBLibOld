package com.dennisbonke.dblib.util;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

/**
 * A common Utility class to save you a few chars when
 * checking for Client/Server instances;
 */
public class CommonUtils {
    public static boolean isClient() {
        return getSide() == Side.CLIENT;
    }

    public static boolean isServer() {
        return getSide() == Side.SERVER;
    }

    public static Side getSide() {
        return FMLCommonHandler.instance().getEffectiveSide();
    }
}
