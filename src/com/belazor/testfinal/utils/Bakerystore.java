package com.belazor.testfinal.utils;


import com.belazor.testfinal.bread.Bread;
import com.belazor.testfinal.bun.Bun;
import com.belazor.testfinal.cake.Cake;
import com.belazor.testfinal.product.Bakery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Belazor on 27-Feb-18.
 */
public class Bakerystore {

    public static void putBakeryOnShelf(List<Bakery> bakeries) {
        List<Bakery> selected = new ArrayList<>();
        for (Bakery b: bakeries) {
            selected.add(b);
            System.out.println(b);
        }
    }
}



