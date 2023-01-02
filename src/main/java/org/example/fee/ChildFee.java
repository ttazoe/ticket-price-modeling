package org.example.fee;

public class ChildFee implements Fee{
    @Override
    public Yen yen() {
        return new Yen(1000);
    }
}
