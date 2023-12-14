package io.github.bluething.playground.codinginterview.kattis.tree;

import java.io.*;

public class tildes {
    private final int[] parents;
    private final int[] ranks;
    private final int[] sizes;

    public tildes(int N) {
        this.parents = new int[N];
        this.ranks = new int[N];
        this.sizes = new int[N];
        for (int i = 0; i < N; i++) {
            parents[i] = i;
            ranks[i] = 0;
            sizes[i] = 1;
        }
    }

    public int findSet(int i) {
        if (parents[i] == i) {
            return i;
        }

        return parents[i] = findSet(parents[i]);
    }

    private void union(int i, int j) {
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

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out))
        ) {
            String[] inputs = bufferedReader.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            int Q = Integer.parseInt(inputs[1]);

            tildes tilde = new tildes(N);
            for (int i = 0; i < Q; i++) {
                inputs = bufferedReader.readLine().split(" ");
                if ("t".equals(inputs[0])) {
                    int x = Integer.parseInt(inputs[1]) - 1;
                    int y = Integer.parseInt(inputs[2]) - 1;
                    tilde.union(x, y);
                } else {
                    int x = Integer.parseInt(inputs[1]) - 1;
                    int size = tilde.sizes[tilde.findSet(x)];
                    printWriter.println(size);
                }
            }
        }
    }
}
