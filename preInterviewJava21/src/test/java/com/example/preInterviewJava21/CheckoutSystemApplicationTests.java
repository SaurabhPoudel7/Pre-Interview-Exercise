package com.example.preInterviewJava21;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CheckoutSystemApplicationTests {

	@Test
    void testTotalWithMultipleItems() {
        Checkout checkout = new Checkout();
        List<String> items = List.of("Apple", "Apple", "Orange", "Apple");
        assertEquals("£2.05",checkout.calculateTotal(items));
    }

}
