package io.github.bluething.playground.codinginterview.kattis.tree;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class ladice {
    private final int[] parents;
    private final int[] ranks;
    private final int[] sizes;

    public ladice(int L) {
        this.parents = new int[L];
        this.ranks = new int[L];
        this.sizes = new int[L];
        for (int i = 0; i < L; i++) {
            parents[i] = i;
            ranks[i] = 0;
            sizes[i] = 1;
        }
    }

    private int findSet(int i) {
        if (parents[i] == i) {
            return i;
        }

        return parents[i] = findSet(parents[i]);
    }

    public void union(int i, int j) {
        int parentI = findSet(i);
        int parentJ = findSet(j);
        if (parentI == parentJ) {
            return;
        }

        if (ranks[parentI] > ranks[parentJ]) {
            parents[parentJ] = parentI;
            sizes[parentI] += sizes[parentJ];
        } else {
            parents[parentI] = parentJ;
            sizes[parentJ] += sizes[parentI];
            if (ranks[parentI] == ranks[parentJ]) {
                ranks[parentJ] += 1;
            }
        }
    }

    public boolean increaseUseCounter(int i) {
        int parentI = findSet(i);
        if (sizes[parentI] > 0) {
            sizes[parentI]--;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt();
        int L = io.getInt();
        ladice ladice = new ladice(L);
        for (int i = 0; i < N; i++) {
            int a = io.getInt();
            int b = io.getInt();
            ladice.union(a-1, b-1);
            if (ladice.increaseUseCounter(a-1)) {
                io.println("LADICA");
            } else {
                io.println("SMECE");
            }
        }

        io.close();
    }
}
