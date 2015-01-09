package com.dennisbonke.dblib.models;

import java.util.List;

public class Material extends Attributes{
    private static int counter = 0;

    public String id;

    /**
     * Create an empty material
     */
    public Material()
    {
        this("mtl" + (++counter));
    }

    /**
     * Create an empty material
     */
    public Material(final String id)
    {
        this.id = id;
    }

    /**
     * Create a material with the specified attributes
     */
    public Material(final Attribute... attributes)
    {
        this();
        set(attributes);
    }

    /**
     * Create a material with the specified attributes
     */
    public Material(final String id, final Attribute... attributes)
    {
        this(id);
        set(attributes);
    }

    /**
     * Create a material with the specified attributes
     */
    public Material(final List<Attribute> attributes)
    {
        this();
        set(attributes);
    }

    /**
     * Create a material with the specified attributes
     */
    public Material(final String id, final List<Attribute> attributes)
    {
        this(id);
        set(attributes);
    }

    /**
     * Create a material which is an exact copy of the specified material
     */
    public Material(final Material copyFrom)
    {
        this(copyFrom.id, copyFrom);
    }

    /**
     * Create a material which is an exact copy of the specified material
     */
    public Material(final String id, final Material copyFrom)
    {
        this(id);
        for (Attribute attr : copyFrom)
            set(attr.copy());
    }

    /**
     * Create a copy of this material
     */
    public final Material copy()
    {
        return new Material(this);
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() + 3 * id.hashCode();
    }
}
