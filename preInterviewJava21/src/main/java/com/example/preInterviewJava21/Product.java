package com.example.preInterviewJava21;

import java.math.BigDecimal;

public enum Product {
    APPLE("Apple", new BigDecimal("0.60")),
    ORANGE("Orange", new BigDecimal("0.25"));

    private final String name;
    private final BigDecimal price;

    Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static Product fromString(String name) {
        return switch (name.toLowerCase()) {
            case "apple" -> APPLE;
            case "orange" -> ORANGE;
            default -> throw new IllegalArgumentException("Unknown product: " + name);
        };
    }
}
