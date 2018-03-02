package com.belazor.testfinal;

import com.belazor.testfinal.bread.Bread;
import com.belazor.testfinal.bun.Bun;
import com.belazor.testfinal.cake.Cake;
import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.product.BakeryType;
import com.belazor.testfinal.utils.BakeryWeightComparator;
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

        Bread bannok = new Bread(100, 300, "Buttery", BakeryType.Bread);
        Bread buttery = new Bread(120, 250, "Bannok", BakeryType.Bread);
        Bun bath_bun = new Bun(70, 100, "Bath bun", BakeryType.Bun);
        Bun beef_bun = new Bun(45, 75, "Beef bun", BakeryType.Bun);
        Cake brownie = new Cake(200, 600, "Brownie", BakeryType.Cake);
        Cake blondie = new Cake(250, 500, "Blondie", BakeryType.Cake);


        List<Bakery> bakeries = new ArrayList<>();
        bakeries.add(bannok);
        bakeries.add(buttery);
        bakeries.add(bath_bun);
        bakeries.add(beef_bun);
        bakeries.add(brownie);
        bakeries.add(blondie);

        Bakerystore.putBakeryOnCount(bakeries, BakeryType.Bread);
        Bakerystore.putBakeryOnCount(bakeries, BakeryType.Bun);
        Bakerystore.putBakeryOnCount(bakeries, BakeryType.Cake);

        Bakerystore.putBakeryOnCount(bakeries);

        Bread bread = new Bread(100, 300, "Buttery", BakeryType.Bread);
        Bread bread1 = new Bread(120, 250, "Bannok", BakeryType.Bread);
        System.out.println(bread.equals(bread1));

        System.out.println(bread == bread1);

        Comparator<Bakery> pcomp = new BakeryWeightComparator();
        TreeSet<Bakery> bakeries1 = new TreeSet(pcomp);
        bakeries1.add(new Bread(100, 300, "Buttery", BakeryType.Bread));
        bakeries1.add(new Bread(120, 250, "Bannok", BakeryType.Bread));
        bakeries1.add(new Bread(70, 100, "Bath bun", BakeryType.Bun));
        bakeries1.add(new Bread(45, 75, "Beef bun", BakeryType.Bun));
        bakeries1.add(new Bread(200, 600, "Brownie", BakeryType.Cake));
        bakeries1.add(new Bread(250, 500, "Blondie", BakeryType.Cake));

        for (Bakery b : bakeries1) {

            System.out.println(b.getType() + " " + b.getName() + " " + b.getWeight());
        }
    }
}
