package com.belazor.testfinal.utils;


import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.product.BakeryType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tatsiana_Belazor on 27-Feb-18.
 */
public class Bakerystore {

    public static void putBakeryOnCount(List<Bakery> bakeries, BakeryType type) {
        List<Bakery> selected = new ArrayList<>();
        for (Bakery b : bakeries) {
            if (type == b.getType()) {
                selected.add(b);
            }
        }
        if (selected.size() > 0) {
            for (Bakery bakery : selected) {
                System.out.println(bakery);
            }
        } else {
            System.out.println("not found");
        }
    }

    public static void putBakeryOnCount(List<Bakery> bakeries) {
        Set<BakeryType> typeSet = new HashSet<>();
        for (Bakery b : bakeries) {
            typeSet.add(b.getType());
        }
        for (BakeryType type : typeSet) {
            System.out.println(type);
        }
    }

}



