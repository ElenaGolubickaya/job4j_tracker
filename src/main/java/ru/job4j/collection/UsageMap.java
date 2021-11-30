package ru.job4j.collection;
import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Arsentev Petr Sergeevich");
        map.put("info1@yandex.ru", "Golubitskaya Elena");
        map.put("info2@yandex.ru", "Golubitskaya Elena");
        map.put("info3@yandex.ru", "Golubitskaya Elena");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
