package com.example.preInterviewJava21;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Checkout {
    public String calculateTotal(List<String> items) {

        Map<Product, Long> counts = items.stream()
            .map(Product::fromString)
            .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        BigDecimal total = BigDecimal.ZERO;

        for (Map.Entry<Product, Long> entry : counts.entrySet()) {
            Product product = entry.getKey();
            long count = entry.getValue();

            switch (product) {
                case APPLE -> {
                    long chargeable = count / 2 + count % 2; // BOGOF
                    total = total.add(product.getPrice().multiply(BigDecimal.valueOf(chargeable)));
                }
                case ORANGE -> {
                    long setsOfThree = count / 3;
                    long remainder = count % 3;
                    long chargeable = setsOfThree * 2 + remainder; // 3 for 2
                    total = total.add(product.getPrice().multiply(BigDecimal.valueOf(chargeable)));
                }
            }
        }

        return "£" + total.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}

