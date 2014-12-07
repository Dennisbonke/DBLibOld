package com.dennisbonke.dblib;

import com.dennisbonke.dblib.reference.Reference;
import com.dennisbonke.dblib.util.version.VersionChecker;

public class Proxy {
    public VersionChecker updater;
    public void checkForUpdate() {
        updater = new VersionChecker(Reference.UPDATE_URL, Reference.MOD_ID, Reference.MOD_NAME, Reference.MAJOR, Reference.MINOR, Reference.REVISION, Reference.BUILD);
        updater.checkForUpdates();
    }
}
