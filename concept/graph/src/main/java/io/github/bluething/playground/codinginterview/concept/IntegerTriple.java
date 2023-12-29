package io.github.bluething.playground.codinginterview.concept;

public class IntegerTriple implements Comparable<IntegerTriple> {
    private final Integer first;
    private final Integer second;
    private final Integer third;

    public IntegerTriple(Integer first, Integer second, Integer third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int compareTo(IntegerTriple o) {
        if (!this.first().equals(o.first())) {
            return this.first() - o.first();
        } else if (!this.second().equals(o.second())) {
            return this.second() - o.second();
        } else {
            return this.third() - o.third();
        }
    }

    Integer first() {
        return first;
    }
    Integer second() {
        return second;
    }
    Integer third() {
        return third;
    }
}
