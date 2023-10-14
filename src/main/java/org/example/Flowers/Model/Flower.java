package org.example.Flowers.Model;


import org.example.Flowers.Bouquet;

public interface Flower {
    public void buyFlower(Bouquet bouquet);
    public boolean isFreshness();
    public int getLength();
}
