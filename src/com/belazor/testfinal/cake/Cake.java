package com.belazor.testfinal.cake;

import com.belazor.testfinal.product.Bakery;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class Cake extends Bakery {

    public Cake(String name, String type, float weight, int price) {
        super(price, weight, type, name);
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.printf("It is a %s%n", getName());
    }
}


