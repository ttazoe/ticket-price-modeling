package org.example.sample1.fee;

import java.util.ArrayList;
import java.util.List;

public class Fees {
    final List<Fee> list;

    public Fees(final List<Fee> list) {
        this.list = list;
    }

    public Fees addFee (final Fee fee) {
        List<Fee> adding = new ArrayList<>(list);
        adding.add(fee);
        return new Fees(adding);
    }

    public Yen totalFee(){
        Yen total = new Yen(0);
        for (Fee fee : list) {
            total = total.add(fee.yen());
        }
        return total;
    }

}
