package com.dennisbonke.dblib.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * A interface for some object types that need extra information to be communicated
 * between the client and server on client input.
 */
public interface ClientEventHandler {
    /**
     * Called on the client when constructing the event packet.
     * Data should be added to the provided stream.
     *
     * @param buffer The packet data stream
     */
    void assembleClientEvent(ByteBuf buffer, String context, Object... params);

    /**
     * Called on the server when it receives an update packet.
     * Data should be read out of the stream in the same way as it was written.
     *
     * @param buffer The packet data stream
     */
    void onClientEvent(ByteBuf buffer, String context, EntityPlayerMP player);
}
