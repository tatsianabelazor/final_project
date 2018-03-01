package com.belazor.testfinal;

import com.belazor.testfinal.bread.Bread;
import com.belazor.testfinal.bun.Bun;
import com.belazor.testfinal.cake.Cake;
import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.utils.BakeryComparator;
import com.belazor.testfinal.utils.Bakerystore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class TestFinal {
    public static void main(String[] args) {

        Bread bannok = new Bread("Bread", "Bannok", 200, 30);
        Bread buttery = new Bread("Bread", "Buttery", 300, 40);
        Bun bath_bun = new Bun(10, 75, "Bath bun", "Bun");
        Bun beef_bun = new Bun(15, 100, "Beef bun", "Bun");
        Cake brownie = new Cake("Cake", "Brownie", 1000, 60);
        Cake blondie = new Cake("Cake", "Blondie", 600, 50);


        List<Bakery> bakeries = new ArrayList<>();
        bakeries.add(bannok);
        bakeries.add(buttery);
        bakeries.add(bath_bun);
        bakeries.add(beef_bun);
        bakeries.add(brownie);
        bakeries.add(blondie);

        Bakerystore.putBakeryOnShelf(bakeries);


        Bread bread = new Bread("Bread", "Bannok", 200, 30);
        Bread bread1 = new Bread("Bread", "Buttery", 300, 40);
        System.out.println(bread.equals(bread1));

        System.out.println(bread == bread1);

        Comparator<Bakery> pcomp = new BakeryComparator();
        TreeSet<Bakery> bakeries1 = new TreeSet(pcomp);
        bakeries1.add(new Bread("Bread", "Buttery", 100, 20));
        bakeries1.add(new Bread("Bread", "Bannok", 200, 30));

        for(Bakery b : bakeries1){

            System.out.println(b.getPrice());
        }

    }
}
