package org.example.sample2.domain.audience;

public class Age implements Comparable{
    final int value;

    Age(final int value){
        this.value = value;
    }

    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Age)) throw new IllegalArgumentException("Arguments should be Age object");
        Age age = (Age) obj;

        if (this.value > age.value) return 1;
        if (this.value < age.value) return -1;
        return 0;
    }
}
