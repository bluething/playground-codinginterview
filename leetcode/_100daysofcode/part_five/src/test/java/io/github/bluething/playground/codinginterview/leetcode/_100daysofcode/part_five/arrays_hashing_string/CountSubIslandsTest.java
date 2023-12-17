package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.part_five.arrays_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/count-sub-islands/
class CountSubIslandsTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, countSubIslands(new int[][]{{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}},
                new int[][]{{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(2, countSubIslands(new int[][]{{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}},
                new int[][]{{0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}}));
    }

    private int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        int col = grid1[0].length;
        UnionFind unionFind = new UnionFind(row * col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid2[i][j] == 0 || grid1[i][j] == 0) {
                    unionFind.blackListComponent(unionFind.index(i, j, col));
                }
                if (grid2[i][j] == 1) {
                    if (i+1 < row && grid2[i+1][j] == 1) {
                        unionFind.connect(unionFind.index(i, j, col), unionFind.index(i+1, j, col));
                    }
                    if (j+1 < col && grid2[i][j+1] == 1) {
                        unionFind.connect(unionFind.index(i, j, col), unionFind.index(i, j+1, col));
                    }
                }
            }
        }

        return unionFind.numOfSet;
    }

    static class UnionFind {
        private final int[] parent;
        private final int[] sizes;
        private final boolean[] blacklisted;
        private int numOfSet;

        public UnionFind(int N) {
            this.parent = new int[N];
            this.sizes = new int[N];
            this.blacklisted = new boolean[N];
            numOfSet = N;
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                sizes[i] = 1;
            }
        }

        private int findSet(int i) {
            if (parent[i] == i) {
                return i;
            }

            return parent[i] = findSet(parent[i]);
        }
        private void connectTo(int from, int to) {
            sizes[to] += sizes[from];
            parent[from] = to;
            if (!blacklisted[to] || !blacklisted[from]) {
                numOfSet--;
            }
            if (blacklisted[from]) {
                blacklisted[to] = true;
            }
        }

        public void connect(int i, int j) {
            int parentI = findSet(i);
            int parentJ = findSet(j);
            if (parentI == parentJ) {
                return;
            }

            if (sizes[parentI] < sizes[parentJ]) {
                connectTo(parentI, parentJ);
            } else {
                connectTo(parentJ, parentI);
            }
        }

        public void blackListComponent(int i) {
            int parentI = findSet(i);
            if (!blacklisted[parentI]) {
                numOfSet--;
            }
            blacklisted[parentI] = true;
        }

        public int index(int row, int col, int numOfColumn) {
            return row * numOfColumn + col;
        }
    }
}
