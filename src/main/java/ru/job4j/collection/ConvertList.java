package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] list1 : list) {
            for (int list2 : list1) {
                rsl.add(list2);
            }
        }
        return rsl;
    }
}
