package io.github.bluething.playground.codinginterview.loop;

import java.io.*;

public class unionfind {
    private final int[] forest;
    private final int[] treeSize;

    public unionfind(int N) {
        this.forest = new int[N];
        this.treeSize = new int[N];
        for (int i = 0; i < N; i++) {
            forest[i] = i;
            treeSize[i] = 0;
        }
    }

    public int find(int i) {
        if (forest[i] == i) {
            return i;
        } else {
            int root = find(forest[i]);
            forest[i] = root;
            return root;
        }
    }

    public void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);

        if (rootI == rootJ) {
            return;
        }

        if (treeSize[rootI] < treeSize[rootJ]) {
            forest[rootI] = forest[rootJ];
        } else {
            forest[rootJ] = forest[rootI];
        }
    }

    public boolean isSameSet(int i, int j) {
        return find(i) == find(j);
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int N = io.getInt();
        int Q = io.getInt();
        unionfind unionfind = new unionfind(N);
        for (int i = 0; i < Q; i++) {
            String command = io.getWord();
            int elementA = io.getInt();
            int elementB = io.getInt();
            if ("=".equals(command)) {
                unionfind.union(elementA, elementB);
            } else if ("?".equals(command)) {
                if (unionfind.isSameSet(elementA, elementB)) {
                    io.println("yes");
                } else {
                    io.println("no");
                }
            }
        }

        io.close();
    }
}
