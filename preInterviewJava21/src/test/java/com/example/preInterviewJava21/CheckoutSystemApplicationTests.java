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
    @Test
    void testBOGOFApples() {
        Checkout checkout = new Checkout();
        assertEquals("£1.20", checkout.calculateTotal(List.of("Apple", "Apple", "Apple", "Apple"))); // 2 paid
    }

    @Test
    void testThreeForTwoOranges() {
        Checkout checkout = new Checkout();
        assertEquals("£0.50", checkout.calculateTotal(List.of("Orange", "Orange", "Orange"))); // pay for 2
    }

    @Test
    void testMixedWithOffers() {
        Checkout checkout = new Checkout();
        List<String> items = List.of("Apple", "Apple", "Orange", "Apple");
        assertEquals("£1.45", checkout.calculateTotal(items)); // Apples: 3 → pay for 2; Orange: 1
    }


}
