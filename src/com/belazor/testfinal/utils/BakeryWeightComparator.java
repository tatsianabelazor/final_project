package com.belazor.testfinal.utils;

import com.belazor.testfinal.product.Bakery;

import java.util.Comparator;

/**
 * Created by Tatsiana_Belazor on 01-Mar-18.
 */
public class BakeryWeightComparator implements Comparator<Bakery> {
    public int compare(Bakery b1, Bakery b2) {
        return (int) (b1.getWeight() - b2.getWeight());
    }

}
