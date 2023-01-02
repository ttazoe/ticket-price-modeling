package org.example.sample1.fee;

public class ChildFee implements Fee{
    @Override
    public Yen yen() {
        return new Yen(1000);
    }
}
