package com.belazor.testfinal;

import com.belazor.testfinal.bread.Bread;
import com.belazor.testfinal.bun.Bun;
import com.belazor.testfinal.cake.Cake;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class TestFinal {
    public static void main(String[] args) {

        Cake cake1 = new Cake("Cake", "Brownie", 1000, 60);
        Cake cake2 = new Cake("Cake", "Blondie", 600, 50);
        Bread bread1 = new Bread("Bread", "Buttery", 300, 40);
        Bread bread2 = new Bread("Bread", "Bannok", 200, 30);
        Bun bun1 = new Bun(15, 100, "Beef bun", "Bun");
        Bun bun2 = new Bun(10, 75, "BBath bun", "Bun");

        

}
}
