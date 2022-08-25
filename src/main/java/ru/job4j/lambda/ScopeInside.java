package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int sum : number) {
            int finalTotal = total;
            total = add(
                    () -> sum + finalTotal
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
