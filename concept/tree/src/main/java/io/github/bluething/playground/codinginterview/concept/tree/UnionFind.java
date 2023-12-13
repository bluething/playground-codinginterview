package io.github.bluething.playground.codinginterview.concept.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnionFind {
    private final List<Integer> forest;
    private final List<Integer> ranks;
    private final List<Integer> setSize;
    private int numOfSet;

    public UnionFind(int N) {
        this.forest = new ArrayList<>(N);
        this.ranks = new ArrayList<>(N);
        this.setSize = new ArrayList<>(N);
        numOfSet = N;
        for (int i = 0; i < N; i++) {
            forest.add(i);
            ranks.add(0);
            setSize.add(1);
        }
    }

    public int findSet(int i) {
        if (forest.get(i) == i) {
            return i;
        } else {
            int ret = findSet(forest.get(i));
            forest.set(i, ret);
            return ret;
        }
    }

    public boolean isSameSet(int i, int j) {
        return findSet(i) == findSet(j);
    }

    public void unionSet(int i, int j) {
        if (!isSameSet(i, j)) {
            numOfSet--;
            int x = findSet(i);
            int y = findSet(j);
            if (ranks.get(x) > ranks.get(y)) {
                forest.set(y, x);
                setSize.set(x, setSize.get(x) + setSize.get(y));
            } else {
                forest.set(x, y);
                setSize.set(y, setSize.get(y) + setSize.get(x));
                if (Objects.equals(ranks.get(x), ranks.get(y))) {
                    ranks.set(y, ranks.get(y) + 1);
                }
            }
        }
    }

    public int numDisjointSets() {
        return numOfSet;
    }

    public int sizeOfSet(int i) {
        return setSize.get(findSet(i));
    }
}
