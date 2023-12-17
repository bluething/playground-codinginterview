package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.part_five.arrays_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/regions-cut-by-slashes/
class RegionsCutBySlashesTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, regionsBySlashes(new String[]{" /","/ "}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, regionsBySlashes(new String[]{" /","  "}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(5, regionsBySlashes(new String[]{"/\\","\\/"}));
    }

    private int regionsBySlashes(String[] grid) {
        int N = grid.length;
        UnionFind unionFind = new UnionFind(4 * N * N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int idx = 4 * getFlattenIndex(i, j, N);
                char val = grid[i].charAt(j);
                if (val != '\\') {
                    unionFind.union(idx+0, idx+1);
                    unionFind.union(idx+2, idx+3);
                }
                if (val != '/') {
                    unionFind.union(idx+0, idx+2);
                    unionFind.union(idx+1, idx+3);
                }

                // North-south neighbor
                if (i+1 < N) {
                    unionFind.union(idx+3, (idx+4*N) + 0);
                }
                // South-north neighbor
                if (i-1 >= 0) {
                    unionFind.union(idx+0, (idx-4*N) + 3);
                }
                // East-west neighbor
                if (j+1 < N) {
                    unionFind.union(idx+2, (idx+4) + 1);
                }
                // West-east neighbor
                if (j-1 >= 0) {
                    unionFind.union(idx+1, (idx-4) + 2);
                }
            }
        }


        return unionFind.numDisjointSets();
    }

    private int getFlattenIndex(int row, int col, int numOfColumn) {
        return row * numOfColumn + col;
    }

    static class UnionFind {
        private final int[] parent;
        private final int[] sizes;
        private int numOfSet;

        public UnionFind(int N) {
            this.parent = new int[N];
            this.sizes = new int[N];
            numOfSet = N;
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                sizes[i] = 1;
            }
        }

        public int findSet(int i) {
            if (parent[i] == i) {
                return i;
            }

            return parent[i] = findSet(parent[i]);
        }

        public void union(int i, int j) {
            int parentI = findSet(i);
            int parentJ = findSet(j);
            if (parentI == parentJ) {
                return;
            }

            numOfSet--;
            if (sizes[parentI] < sizes[parentJ]) {
                parent[parentI] = parentJ;
                sizes[parentJ] += sizes[parentI];
            } else {
                parent[parentJ] = parentI;
                sizes[parentI] += sizes[parentJ];
            }
        }

        public int numDisjointSets() {
            return numOfSet;
        }
    }
}
