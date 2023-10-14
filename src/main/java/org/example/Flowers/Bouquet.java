package org.example.Flowers;

import org.example.Flowers.Model.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Bouquet {
    public List<Flower> flowerList;
    public Double totalPrice;

    public Bouquet() {
        flowerList = new ArrayList<>();
        totalPrice = 0.0;
    }
    public void add(List<Flower> flowers){
        flowerList.addAll(flowers);
        flowers.forEach(flower -> flower.buyFlower(this));
    }
    public void add(Flower flower){
        flowerList.add(flower);
        flower.buyFlower(this);
    }
    public void sortByFreshness(){
        flowerList.forEach(System.out::println);
        System.out.println("--------------------------------------");
        flowerList.stream()
                .sorted((b1, b2) -> Boolean.compare(b2.isFreshness(), b1.isFreshness()))
                .forEach(System.out::println);
        System.out.println("--------------------------------------");
    }
    public void totalPrice(){
        System.out.println(totalPrice);
    }
    public void findByLength(int first, int last){
        flowerList.stream()
                .filter(a -> a.getLength() > first && a.getLength() < last)
                .forEach(System.out::println);
    }
}
