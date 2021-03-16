package ru.geekbrains.HomeWork_3_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Object[] array1 = {"One", "Two", "Three", "Four", "Five"};
	Object[] array2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        reverseArray(array1, 0, 1);
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        reverseArray(array2, 0, 1);
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println(arrayToArrayList(array1));
    }
    public static void reverseArray(Object[] array, int a, int b) { // task 1
        Object flag;
        flag = array[a];
        array[a] = array[b];
        array[b] = flag;
    }
    public static ArrayList<Object> arrayToArrayList(Object[] array) { // task 2
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

}
