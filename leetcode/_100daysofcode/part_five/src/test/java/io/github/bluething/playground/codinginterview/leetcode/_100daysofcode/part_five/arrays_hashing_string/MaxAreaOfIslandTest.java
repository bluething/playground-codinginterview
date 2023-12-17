package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.part_five.arrays_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/max-area-of-island/
class MaxAreaOfIslandTest {
    @Test
    void case01() {
        Assertions.assertEquals(6, maxAreaOfIsland(new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, maxAreaOfIsland(new int[][]{{0,0,0,0,0,0,0,0}}));
    }

    private int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        UnionFind unionFind = new UnionFind(row * col);
        Map<Integer, Integer> sizeOfIndex = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int workingIndex = unionFind.getIndex(i, j, col);
                    if (i+1 < row && grid[i+1][j] == 1) {
                        unionFind.connect(workingIndex, unionFind.getIndex(i+1, j, col));
                    }
                    if (j+1 < col && grid[i][j+1] == 1) {
                        unionFind.connect(workingIndex, unionFind.getIndex(i, j+1, col));
                    }

                    sizeOfIndex.putIfAbsent(workingIndex, unionFind.sizeOfSet(workingIndex));
                }
            }
        }

        return sizeOfIndex.isEmpty() ? 0 : Collections.max(sizeOfIndex.values());
    }

    static class UnionFind {
        private final int[] parent;
        private final int[] sizes;

        public UnionFind(int N) {
            this.parent = new int[N];
            this.sizes = new int[N];
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

        public void connect(int i, int j) {
            int parentI = findSet(i);
            int parentJ = findSet(j);
            if (parentI == parentJ) {
                return;
            }

            if (sizes[parentI] < sizes[parentJ]) {
                parent[parentI] = parentJ;
                sizes[parentJ] += sizes[parentI];
            } else {
                parent[parentJ] = parentI;
                sizes[parentI] += sizes[parentJ];
            }
        }

        public int sizeOfSet(int i) {
            return sizes[findSet(i)];
        }

        public int getIndex(int row, int col, int numOfColumn) {
            return row * numOfColumn + col;
        }
    }
}
