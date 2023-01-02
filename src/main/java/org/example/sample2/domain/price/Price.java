package org.example.sample2.domain.price;

public class Price {
    private final int yen;

    Price(final int yen) {
        if (yen < 0) throw new IllegalArgumentException("Price should be more than 0");
        this.yen = yen;
    }

    Price add(Price addition) {
        return new Price(yen + addition.yen);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Price) {
            Price target = (Price) obj;
            return yen == target.yen;
        }
        return false;
    }
}
