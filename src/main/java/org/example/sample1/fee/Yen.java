package org.example.sample1.fee;

import java.util.Objects;

public class Yen {
    final int amount;

    public Yen(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Fee amount should be more than 0");
        }
        this.amount = amount;
    }

    public Yen add(final Yen addition) {
        return new Yen(this.amount + addition.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yen yen = (Yen) o;
        return amount == yen.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
