package ru.geekbrains.HomeWork_3_1;

import java.util.ArrayList;

public class Box<T> { // пункт b
    private T fruit;

    public Box(T fruit) {
        this.fruit = fruit;

    }
    public T getBox() {
        return fruit;
    }
    public void setBox(T fruit) {
        this.fruit = fruit;
    }
    ArrayList<T> arrayList = new ArrayList<>(); // пункт с
    public void addFruitToBox(T fruit) { // пункт g
        arrayList.add(fruit);
    }
//    public float getWeight(Apple apple) { // пункт d
//        return (apple.WEIGHT * arrayList.size());
//    }
//    public float getWeight(Box<T> fruit) { // пункт d
//        return (fruit.WEIGHT * arrayList.size());
//    }
//    public boolean compare(Box<T> fruit) { // пункт е
//        if(getWeight(fruit) == getWeight(this.fruit)){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

}
