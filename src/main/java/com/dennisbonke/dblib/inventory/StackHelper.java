package com.dennisbonke.dblib.inventory;

import net.minecraft.item.ItemStack;

public class StackHelper {
    private static StackHelper instance;

    public static StackHelper instance() {
        if (instance == null) {
            instance = new StackHelper();
        }
        return instance;
    }

    public static void setInstance(StackHelper inst) {
        instance = inst;
    }

    protected StackHelper() {
    }

    /* STACK MERGING */
    /**
     * Checks if two ItemStacks are identical enough to be merged
     *
     * @param stack1 - The first stack
     * @param stack2 - The second stack
     * @return true if stacks can be merged, false otherwise
     */
    public boolean canStacksMerge(ItemStack stack1, ItemStack stack2) {
        if (stack1 == null || stack2 == null)
            return false;
        if (!stack1.isItemEqual(stack2))
            return false;
        if (!ItemStack.areItemStackTagsEqual(stack1, stack2))
            return false;
        return true;

    }
}
