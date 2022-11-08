package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(x -> x.getStandard() - x.getActual() >= 0)
                .filter(x -> x.getStandard() - x.getActual() <= 3)
                .map(l -> new Label(l.getName(), l.getPrice() / 2))
                .map(l -> l.toString())
                .collect(Collectors.toList());
    }
}
