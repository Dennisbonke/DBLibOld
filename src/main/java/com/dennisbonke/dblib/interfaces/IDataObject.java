package com.dennisbonke.dblib.interfaces;

import net.minecraft.nbt.NBTTagCompound;

public interface IDataObject {
    public void readFromNBT(NBTTagCompound nbt);

    public void writeToNBT(NBTTagCompound nbt);
}
