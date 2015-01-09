package com.dennisbonke.dblib.models;

import java.util.ArrayList;
import java.util.List;

public class Animation {
    /** the unique id of the animation **/
    public String id;
    /** the duration in seconds **/
    public float duration;
    /** the animation curves for individual nodes **/
    public final List<NodeAnimation> nodeAnimations = new ArrayList<>();
}
