package org.example.Flowers;

import org.example.Flowers.Model.Flower;
import org.example.Flowers.Model.Narcissus;
import org.example.Flowers.Model.Rose;
import org.example.Flowers.Model.Tulip;

import java.util.Arrays;

public class FlowerCreator {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.add(new Rose());
        bouquet.add(Arrays.asList(new Rose(), new Narcissus(), new Tulip()));
        bouquet.add(new Tulip());
        bouquet.sortByFreshness();
        bouquet.totalPrice();
        bouquet.findByLength(3, 40);
    }
}
