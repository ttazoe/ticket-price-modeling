package org.example.fee;

public class AdultFee implements Fee{
    @Override
    public Yen yen(){
        return new Yen(1900);
    }
}
