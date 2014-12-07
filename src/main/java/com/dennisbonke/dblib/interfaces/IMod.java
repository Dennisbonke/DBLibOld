package com.dennisbonke.dblib.interfaces;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * a small interface to be applied onto base mod classes, this is a matter of preference only.
 *
 * @author tgame14
 * @since 11/03/14
 */
public interface IMod {
    public void preInit(FMLPreInitializationEvent event);

    public void init(FMLInitializationEvent event);

    public void postInit(FMLPostInitializationEvent event);
}
