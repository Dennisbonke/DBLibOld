package com.dennisbonke.dblib.interfaces;

/**
 * an interface used to apply on Compatibility proxies
 * the compatibility proxy system is a loading code bits section
 *
 * @author tgame14
 * @since 12/03/14
 */
public interface IProxy {
    public void preInit();

    public void init();

    public void postInit();
}
