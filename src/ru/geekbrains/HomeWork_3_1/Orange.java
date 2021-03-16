package ru.geekbrains.HomeWork_3_1;

public class Orange { // пункт а
    private Orange orange;
    public final float WEIGHT = 1.5f;

    public Orange(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}
