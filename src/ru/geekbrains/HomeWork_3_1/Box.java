package ru.geekbrains.HomeWork_3_1;

import java.util.ArrayList;

public class Box<T extends Fruit> { // пункт b

    ArrayList<T> arrayList = new ArrayList<>(); // пункт с
    public void addFruitToBox(T fruit) { // пункт g
        arrayList.add(fruit);
    }
    public float getWeight() { // пункт d
        return arrayList.size() * arrayList.get(0).weight;
    }

    public boolean compare(Box anotherBox) { // пункт е
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.00001;
    }
    public void transToAnotherBox(Box<? super T> anotherBox) {
        anotherBox.arrayList.addAll(this.arrayList);
        this.arrayList.clear();
    }

}
