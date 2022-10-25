package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> bicon = (s1, s2) -> map.put(s1, s2);
        bicon.accept(1, "one");
        bicon.accept(2, "two");
        bicon.accept(3, "three");
        bicon.accept(4, "four");
        bicon.accept(5, "five");
        bicon.accept(6, "six");
        bicon.accept(7, "seven");
        BiPredicate<Integer, String> biPred = (s1, s2) -> s1 % 2 == 0 || map.get(s1).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();

        Consumer<List<String>> con = (s) -> System.out.println(s);
        con.accept(sup.get());

        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            System.out.println(func.apply(s));
        }
    }
}
