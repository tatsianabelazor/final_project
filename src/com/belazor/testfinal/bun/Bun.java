package com.belazor.testfinal.bun;

import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.product.BakeryType;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class Bun extends Bakery {

    public Bun(float price, float weight, String name, BakeryType type) {
        super(price, weight, name, type);
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.printf("It is a %s%n", getName());
    }

}
