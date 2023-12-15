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
