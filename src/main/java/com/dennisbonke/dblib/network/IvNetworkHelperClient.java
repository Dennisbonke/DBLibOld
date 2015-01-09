package com.dennisbonke.dblib.network;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by lukas on 25.09.14.
 */
public class IvNetworkHelperClient {
    @Deprecated
    public static <ETileEntity extends TileEntity & ClientEventHandler> void sendTileEntityUpdatePacket(ETileEntity tileEntity, String context, SimpleNetworkWrapper network, Object... params)
    {
        sendTileEntityEventPacket(tileEntity, context, network, params);
    }

    public static <ETileEntity extends TileEntity & ClientEventHandler> void sendTileEntityEventPacket(ETileEntity tileEntity, String context, SimpleNetworkWrapper network, Object... params)
    {
        if (!(tileEntity.getWorldObj().isRemote))
            throw new UnsupportedOperationException();

        network.sendToServer(PacketTileEntityClientEvent.packetEntityData(tileEntity, context, params));
    }
}
