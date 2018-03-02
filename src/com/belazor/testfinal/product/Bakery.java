package com.belazor.testfinal.product;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public abstract class Bakery {

    public float price;
    public float weight;
    public String type;
    public String name;

    public Bakery(float price, float weight, String type, String name) {
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayProduct() {
        System.out.printf("It is " + type, price, weight);
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "price=" + price +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
