package com.example.preInterviewJava21;

import java.math.BigDecimal;
import java.util.List;

public class Checkout {
    public String calculateTotal(List<String> items) {
        BigDecimal total = BigDecimal.ZERO;
        for (String item : items) {
            Product product = Product.fromString(item);
            total = total.add(product.getPrice());
        }
        return "£" + total.setScale(2);
    }
}
