package com.belazor.testfinal.utils;

import com.belazor.testfinal.product.Bakery;

import java.util.Comparator;

/**
 * Created by Tatsiana_Belazor on 02-Mar-18.
 */
public class BakeryPriceComparator implements Comparator<Bakery> {
    public int compare(Bakery b1, Bakery b2) {
        return (int) (b1.getPrice() - b2.getPrice());
    }

}
