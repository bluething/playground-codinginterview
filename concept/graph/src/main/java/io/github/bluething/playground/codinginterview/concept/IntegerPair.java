package io.github.bluething.playground.codinginterview.concept;

import java.util.Comparator;

public class IntegerPair implements Comparable<IntegerPair> {
    private final Integer first;
    private final Integer second;

    public IntegerPair(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(IntegerPair o) {
        if (!this.first().equals(o.first())) {
            return this.first() - o.first();
        } else {
            return this.second() - o.second();
        }
    }

    Integer first() {
        return first;
    }
    Integer second() {
        return second;
    }
}
