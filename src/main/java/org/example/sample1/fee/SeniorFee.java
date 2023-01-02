package org.example.sample1.fee;

public class SeniorFee implements Fee{
    public Yen yen(){
        return new Yen(1200);
    }
}
