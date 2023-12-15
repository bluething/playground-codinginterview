package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.part_five.arrays_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return 0;
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
    }
}
