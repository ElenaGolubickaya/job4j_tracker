package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] parts1 = left.split(". ");
        String[] parts2 = right.split(". ");
        int num1 = Integer.parseInt(parts1[0]);
        int num2 = Integer.parseInt(parts2[0]);
        return Integer.compare(num1, num2);
    }
}
