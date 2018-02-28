package com.belazor.testfinal.bread;

import com.belazor.testfinal.product.Bakery;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class Bread extends Bakery {
    public String name;

    public Bread(String name, String type, int weight, int price) {
        super(price, weight, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayProduct() {
        super.displayProduct();
        System.out.printf("It is a %s%n", getName());
    }

}