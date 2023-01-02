package org.example.sample1.fee;

public class AdultFee implements Fee{
    @Override
    public Yen yen(){
        return new Yen(1900);
    }
}
