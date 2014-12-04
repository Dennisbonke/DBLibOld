package com.dennisbonke.dblib.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by lukas on 30.06.14.
 */
public interface MCRegistry{

    public Item itemFromID(String itemID);

    public Block blockFromID(String blockID);
}

