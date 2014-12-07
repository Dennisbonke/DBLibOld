package com.dennisbonke.dblib.pulsar.config;

// Credits SlimeKing

import com.dennisbonke.dblib.pulsar.pulse.PulseMeta;

/**
 * Interface for config handler.
 *
 * @author Arkan <arkan@drakon.io>
 */

public interface IConfiguration {

    /**
     * Perform any configuration loading required.
     */
    public void load();

    /**
     * Gets whether the given module is enabled in the config.
     *
     * @param meta The pulse metadata.
     * @return Whether the module is enabled.
     */
    public boolean isModuleEnabled(PulseMeta meta);

    /**
     * Flush configuration to disk/database/whatever.
     */
    public void flush();
}
