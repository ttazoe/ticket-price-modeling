package org.example.sample2.domain.price;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {
    @Test
    public void testConstructor(){
        new Price(1900);
        try {
            new Price(-100);
        } catch (Exception e) {
        }
    }

    @Test
    public void testAdd(){
        Price p1 = new Price(1900);
        Price p2 = new Price(1900);
        assertEquals(p1.add(p2), new Price(3800));
    }
}