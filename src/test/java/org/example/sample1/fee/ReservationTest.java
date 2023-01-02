package org.example.sample1.fee;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    /**
     * Case 1 : Adult Fee
     * Case 2 : Child Fee
     * Case 3 : Senior Fee
     * Case 4 : Adult Fee + Child Fee + Senior Fee
     */
    @Test
    public void testTotalPrice() {
        List<Fee> adultFeeList = new ArrayList<>();
        adultFeeList.add(new AdultFee());
        Fees adultFees = new Fees(adultFeeList);

        List<Fee>  childFeeList = new ArrayList<>();
        childFeeList.add(new ChildFee());
        Fees childFees = new Fees(childFeeList);

        List<Fee>  seniorFeeList = new ArrayList<>();
        seniorFeeList.add(new SeniorFee());
        Fees seniorFees = new Fees(seniorFeeList);

        List<Fee>  allFeeList = new ArrayList<>();
        allFeeList.add(new SeniorFee());
        allFeeList.add(new ChildFee());
        allFeeList.add(new AdultFee());
        Fees allFees = new Fees(allFeeList);

        assertEquals(adultFees.totalFee(), new Yen(1900));
        assertEquals(seniorFees.totalFee(), new Yen(1200));
        assertEquals(childFees.totalFee(), new Yen(1000));
        assertEquals(allFees.totalFee(), new Yen(4100));
    }

}