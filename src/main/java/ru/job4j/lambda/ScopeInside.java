package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    static private int total = 0;

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        for (int sum : number) {
            total = add(
                    () -> sum + total
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
