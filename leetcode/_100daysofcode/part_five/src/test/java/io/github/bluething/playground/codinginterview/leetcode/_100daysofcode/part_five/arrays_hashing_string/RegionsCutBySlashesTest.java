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
        return 0;
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
    }
}
