package com.belazor.testfinal.bun;

import com.belazor.testfinal.product.Bakery;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class Bun extends Bakery {

    public String name;

    public Bun(float price, float weight, String type, String name) {
        super(price, weight, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.printf("It is a %s%n", getName());
    }

}
