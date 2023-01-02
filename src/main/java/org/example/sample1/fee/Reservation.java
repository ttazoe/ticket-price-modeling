package org.example.sample1.fee;

public class Reservation {
    final Fees fees;

    Reservation (final Fees fees) {
        this.fees = fees;
    }

    Reservation addFee (final Fee fee) {
        return new Reservation(fees.addFee(fee));
    }

    Yen totalFee(){
       return fees.totalFee();
    }
}