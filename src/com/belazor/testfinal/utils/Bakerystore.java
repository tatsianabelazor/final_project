package com.belazor.testfinal.utils;


import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.product.BakeryType;

import java.util.*;

/**
 * Created by Tatsiana_Belazor on 27-Feb-18.
 */
public class Bakerystore {

    public static void putBakeryOnCount(List<Bakery> bakeries, BakeryType type) throws Exception {
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

    /*
    This method is used to sort items by weight
     */
    public static void sortByWeight(ArrayList<Bakery> bakeries) throws WeightException {
        BakeryWeightComparator sorting = new BakeryWeightComparator();
        Collections.sort(bakeries, sorting);
        for (Bakery bakery : bakeries) {
            System.out.println(bakery.getType() + " " + bakery.getName() + " " + bakery.getWeight());
        }
    }

    /*
    This method is used to count the price of all the products on the counter

     */
    public float countTotalPrice(List<Bakery> bakeries) {
        float totalPrice = 0;
        for (Bakery bakery : bakeries) {
            totalPrice += bakery.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
        return totalPrice;
    }

    /*
    This method is used to find an item by weight and price
     */
    public List<Bakery> findItemByRange(List<Bakery> bakeries) {
        List<Bakery> range = new ArrayList<>();
        for (Bakery bakery : bakeries) {
            if (bakery.getWeight() >= 200 && bakery.getPrice() > 100) {
                range.add(bakery);
            }
        }
        System.out.println(range);
        return range;
    }
}
