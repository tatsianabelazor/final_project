package com.belazor.testfinal.product;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public abstract class Bakery {

    public double price;
    public double weight;
    public String name;
    public BakeryType type;

    public Bakery(float price, float weight, String name, BakeryType type) {
        this.price = price;
        this.weight = weight;
        this.name = name;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public BakeryType getType() {
        return type;
    }

    public void displayProduct() {
        System.out.printf("It is " + name, price, weight);
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
