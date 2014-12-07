package com.dennisbonke.dblib.util;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Various utils for generating Random numbers
 */
public class RandomUtils {
    public static Random rnd = new Random();

    //FLOAT
    public static float nextFloat(float min, float max, int dp) {
        float difference = max - min;
        float gen = rnd.nextFloat() * difference;

        BigDecimal bd = new BigDecimal(gen);
        bd = bd.setScale(dp, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue() + min;
    }

    public static float nextFloat(float min, float max) {
        return nextFloat(min, max, 2);
    }

    //DOUBLE
    public static double nextDouble(double min, double max, int dp) {
        double difference = max - min;
        double gen = rnd.nextDouble() * difference;

        BigDecimal bd = new BigDecimal(gen);
        bd = bd.setScale(dp, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue() + min;
    }

    public static double nextDouble(double min, double max) {
        return nextDouble(min, max, 2);
    }

    //INT
    public static int nextInt(int min, int max) {
        int difference = max - min;
        int gen = rnd.nextInt(difference);
        return min + gen;
    }
}
