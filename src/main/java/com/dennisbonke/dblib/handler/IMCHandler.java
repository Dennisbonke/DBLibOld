package com.dennisbonke.dblib.handler;

import cpw.mods.fml.common.event.FMLInterModComms;

import java.util.List;

public final class IMCHandler {
    private IMCHandler() {}
    public static void processIMC(List<FMLInterModComms.IMCMessage> messages)
    {
        for(FMLInterModComms.IMCMessage message : messages) {
            String type = message.key;
            if (type == null || type.isEmpty())
                continue;
        }
    }
}
