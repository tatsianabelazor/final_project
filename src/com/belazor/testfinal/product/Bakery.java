package com.belazor.testfinal.product;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public abstract class Bakery {

    public float price;
    public float weight;
    public String name;
    public BakeryType type;

    public Bakery(float price, float weight, String name, BakeryType type) {
        this.price = price;
        this.weight = weight;
        this.name = name;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BakeryType getType() {
        return type;
    }

    public void setType(BakeryType type) {
        this.type = type;
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
