package ru.geekbrains.HomeWork_3_1;

public class Apple { // пункт а
    private Apple apple;
    public final float WEIGHT = 1.0f;

    public Apple(Apple apple) {
        this.apple = apple;

    }

    public Apple getApple() {
        return apple;
    }
}