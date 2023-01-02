package org.example.sample2.domain.audience;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {
    /**
     * Case 0 : Age 10 , Unmatch Object
     * Case 1 : Age 10 , Age 10 : 0
     * Case 2 : Age 10 , Age 20 : 1
     * Case 3 : Age 10 , Age 5 : -1
     */
    @Test
    public void testCompareTo(){
        Integer integer = 1;
        Age age10 = new Age(10);
        Age age10_2 = new Age(10);
        Age age20 = new Age(20);
        Age age5 = new Age(5);

        try {
            age10.compareTo(integer);
        } catch (IllegalArgumentException e){

        }

        assertEquals(age10.compareTo(age10_2),0);
        assertEquals(age10.compareTo(age20),-1);
        assertEquals(age10.compareTo(age5),1);
    }

}