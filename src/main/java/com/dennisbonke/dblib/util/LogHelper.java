package com.dennisbonke.dblib.util;

import com.dennisbonke.dblib.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

import java.util.logging.Logger;

public class LogHelper {
    protected Logger logger;
    protected String modID;
    protected boolean hasSubName = false;
    protected String subName;
    protected boolean canLog = true;

    public LogHelper()
    {
        this(Reference.MOD_ID);
    }

    public LogHelper(String modID)
    {
        this.modID = modID;
        logger = Logger.getLogger(modID);
    }

    public LogHelper setSubName(String name)
    {
        this.hasSubName = true;
        this.subName = name;
        return this;
    }

    public LogHelper setCanLog(boolean value)
    {
        this.canLog = value;
        return this;
    }

    protected String getName()
    {
        String name = "[" + this.modID + "] ";
        if (hasSubName)
            name += "[" + this.subName + "] ";

        return name;
    }
    
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void info2(String s, int xCoord, int yCoord, Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }

    public static void warn2(String s, Object object, int i, int xCoord)
    {
        log(Level.WARN, object);
    }

    public static void warn4(String s, Object object, int i, int xCoord)
    {
        log(Level.WARN, object);
    }

    public static void warn3(String s, String s1) {
        log(Level.WARN);
    }

    private static void log(Level warn) {

    }

    public static void fatal2(String s, int i) {
        log(Level.FATAL);
    }

    public static void warn1(String s, String s1, int i, int i1) {
        log(Level.WARN);
    }
}
