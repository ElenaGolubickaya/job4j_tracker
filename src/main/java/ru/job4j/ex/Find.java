package ru.job4j.ex;

import java.io.IOException;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        try {
            String rsl = Find.get(data, 2);
            System.out.println(rsl);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

