package com.dennisbonke.dblib.tools;

/**
 * Implement this if you TileEntity or Entity needs special treatment when being transformed.
 */
public interface Transformable {
    /**
     * Transforms the object inside a certain bounds.
     * Note that implementing this will delete default transforming functionality, so you need to do that yourself.
     * Take a look at {@link net.minecraftforge.common.util.RotationHelper} and AxisAlignedTransform2D for default rotation implementations.
     *
     * @param rotation The amount of times to rotate.
     * @param mirrorX If x is being mirrored.
     * @param inBounds The bounds of the area the transformation should take place in.
     */
    void transform(int rotation, boolean mirrorX, int[] inBounds);
}
