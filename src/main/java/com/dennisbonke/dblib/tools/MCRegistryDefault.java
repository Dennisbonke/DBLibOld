package com.dennisbonke.dblib.tools;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by lukas on 30.06.14.
 */
public class MCRegistryDefault implements MCRegistry{
    public static final MCRegistryDefault INSTANCE = new MCRegistryDefault();

    @Override
    public Item itemFromID(String itemID)
    {
        return (Item) Item.itemRegistry.getObject(itemID);
    }

    @Override
    public Block blockFromID(String blockID)
    {
        return (Block) Block.blockRegistry.getObject(blockID);
    }
}
