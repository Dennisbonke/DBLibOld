package com.dennisbonke.dblib;

import com.dennisbonke.dblib.reference.Reference;
import com.dennisbonke.dblib.util.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, canBeDeactivated = false)
public class DBLib {
    {
        if (Loader.isModLoaded("Advanced Foods")) {
            LogHelper.info("AF found, stay tuned!");
        } else {
            LogHelper.info("AF not found :(");
        }
    }

    {
        if (Loader.isModLoaded("Advanced Tools")) {
            LogHelper.info("AT found, stay tuned!");
        } else {
            LogHelper.info("AT not found :(");
        }
    }
    @Mod.Instance(Reference.MOD_ID)
    public static DBLib instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Initialization Complete!");
    }
}
