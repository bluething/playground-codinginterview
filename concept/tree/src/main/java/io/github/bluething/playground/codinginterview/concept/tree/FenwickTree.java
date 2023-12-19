package io.github.bluething.playground.codinginterview.concept.tree;

import java.util.ArrayList;
import java.util.List;

public class FenwickTree {
    private final List<Integer> tree;

    public FenwickTree(int N) {
        this.tree = new ArrayList<>();
        // ignoring idx 0
        for (int i = 0; i <= N; i++) {
            tree.add(0);
        }
    }

    public int rsq(int i) {
        int sum = 0;
        while (i > 0) {
            sum += tree.get(i);
            i -= Integer.lowestOneBit(i);
        }

        return sum;
    }

    public int rsq(int i, int j) {
        return rsq(j) - rsq(i-1);
    }

    public void update(int i, int delta) {
        while (i < tree.size()) {
            tree.set(i, tree.get(i) + delta);
            i += Integer.lowestOneBit(i);
        }
    }
}
