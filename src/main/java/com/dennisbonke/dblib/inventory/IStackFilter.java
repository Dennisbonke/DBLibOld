package com.dennisbonke.dblib.inventory;

import net.minecraft.item.ItemStack;

public interface IStackFilter {
    public boolean matches(ItemStack stack);
}
