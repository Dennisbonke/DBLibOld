package com.dennisbonke.dblib.tools;

/**
 * Implement this if your TileEntity or Entity needs special treatment when being moved.
 */
public interface Movable {
    /**
            * Moves the object by the specified amount.
    * Note that implementing this will delete default moving functionality, so you need to do that yourself.
            *
            * @param x The distance to move on the x-axis.
    * @param y The distance to move on the y-axis.
    * @param z The distance to move on the z-axis.
    */
    void move(int x, int y, int z);
}
