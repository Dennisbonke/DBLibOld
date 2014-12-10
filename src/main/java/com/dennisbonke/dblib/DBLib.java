package com.dennisbonke.dblib;

import com.dennisbonke.dblib.handler.IMCHandler;
import com.dennisbonke.dblib.reference.Reference;
import com.dennisbonke.dblib.util.EnviromentChecks;
import com.dennisbonke.dblib.util.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    {
        if (Loader.isModLoaded("Advanced Nature")) {
            LogHelper.info("AN found, stay tuned!");
        } else {
            LogHelper.info("AN not found :(");
        }
    }
    {
        EnviromentChecks.checkEnvironement();
    }
    @Instance(Reference.MOD_ID)
    public static DBLib instance;

    public static Logger logger = LogManager.getLogger(Reference.MOD_ID);

    //@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    //public static Proxy Proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        LogHelper.info("Pre Initialization Complete!");
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){

        LogHelper.info("Initialization Complete!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Initialization Complete!");
    }
    @EventHandler
    public void handleIMC(FMLInterModComms.IMCEvent e) {
        IMCHandler.processIMC(e.getMessages());
    }

    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent evt) {
        IMCHandler.processIMC(FMLInterModComms.fetchRuntimeMessages(this));
    }
}
