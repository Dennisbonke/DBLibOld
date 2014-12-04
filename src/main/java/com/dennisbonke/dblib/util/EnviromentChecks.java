package com.dennisbonke.dblib.util;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;

public class EnviromentChecks {
    public static boolean hasOptifine;

    protected static final String obf = "OBF=false";

    public static void checkEnvironement()
    {
        if (FMLCommonHandler.instance().getSidedDelegate().getSide() == Side.CLIENT && ((FMLClientHandler.instance().hasOptifine()) || Loader.isModLoaded("optifine")))
        {
            hasOptifine = true;
            LogHelper.warn("Optifine has been detected on your Minecraft installation, this can cause (rendering) issues");
        }
    }

    public static boolean isObfuscated()
    {
        return Boolean.parseBoolean(obf.substring(obf.indexOf('=') + 1));
    }
}
