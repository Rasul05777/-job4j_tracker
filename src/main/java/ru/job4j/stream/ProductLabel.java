package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(t -> t.getActual() <= t.getStandard() && t.getStandard() - t.getActual() <= 3)
                .map(product -> new Label(product.getName(), product.getPrice() / 2).toString())
                .collect(Collectors.toList());
    }
}
