package com.belazor.testfinal;

import com.belazor.testfinal.bread.Bread;
import com.belazor.testfinal.bun.Bun;
import com.belazor.testfinal.cake.Cake;
import com.belazor.testfinal.product.Bakery;
import com.belazor.testfinal.product.BakeryType;
import com.belazor.testfinal.utils.Bakerystore;
import com.belazor.testfinal.utils.WeightException;

import java.util.ArrayList;

/**
 * Created by Tatsiana_Belazor on 26-Feb-18.
 */
public class TestFinal {
    public static void main(String[] args) throws Exception {

        Bread bannok = new Bread(100, 300, "Buttery", BakeryType.Bread);
        Bread buttery = new Bread(120, 250, "Bannok", BakeryType.Bread);
        Bun bath_bun = new Bun(70, 100, "Bath bun", BakeryType.Bun);
        Bun beef_bun = new Bun(45, 75, "Beef bun", BakeryType.Bun);
        Cake brownie = new Cake(200, 600, "Brownie", BakeryType.Cake);
        Cake blondie = new Cake(250, 500, "Blondie", BakeryType.Cake);

        ArrayList<Bakery> bakeries = new ArrayList<>();
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

        try {
            Bakerystore.sortByWeight(bakeries);
        } catch (WeightException e) {
            System.out.println(e.getMessage());
        }

        Bakerystore bakerystore = new Bakerystore();
        bakerystore.countTotalPrice(bakeries);
        bakerystore.findItemByRange(bakeries);
    }

}
