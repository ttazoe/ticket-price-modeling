package org.example.fee;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class YenTest {
    /**
     * Case 1 : 10
     * Case 2 : -10
      */
    @Test
    public void constructor(){
        Yen ok = new Yen(10);
        try {
            Yen ng = new Yen(-1);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

    }


    /**
     * Case 1 : 10 + 20 = 30
     */
    @Test
    public void testAdd(){
        Yen yen10 = new Yen(10);
        Yen yen20 = new Yen(20);
        assertEquals(yen10.add(yen20),new Yen(30));
    }

}