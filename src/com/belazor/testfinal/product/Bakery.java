package com.belazor.testfinal.product;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public abstract class Bakery {
    public float price;
    public float weight;
    public String type;

    public Bakery(float price, float weight, String type) {
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public void displayProduct() {
        System.out.printf("It is " + type, price, weight);
    }
}
