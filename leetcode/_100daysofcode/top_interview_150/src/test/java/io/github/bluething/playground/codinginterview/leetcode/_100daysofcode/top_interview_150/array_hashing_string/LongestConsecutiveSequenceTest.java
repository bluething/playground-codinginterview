package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-interview-150
class LongestConsecutiveSequenceTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(9, longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(3, longestConsecutive(new int[]{1,0,-1}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(4, longestConsecutive2(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(9, longestConsecutive2(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(3, longestConsecutive2(new int[]{1,0,-1}));
    }

    @Test
    void case07() {
        Assertions.assertEquals(4, longestConsecutive3(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case08() {
        Assertions.assertEquals(9, longestConsecutive3(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case09() {
        Assertions.assertEquals(3, longestConsecutive3(new int[]{1,0,-1}));
    }
    @Test
    void case10() {
        Assertions.assertEquals(4, longestConsecutive4(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void case11() {
        Assertions.assertEquals(9, longestConsecutive4(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void case12() {
        Assertions.assertEquals(3, longestConsecutive4(new int[]{1,0,-1}));
    }

    // brute force solution
    // check if current num have consecutive num in the nums array
    private int longestConsecutive(int[] nums) {
        int maxLength = 0;
        int curentLength = 0;
        int currentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            curentLength = 1;
            currentNum = nums[i];
            while (isNumExist(currentNum+1, nums)) {
                currentNum++;
                curentLength++;
            }

            maxLength = Math.max(maxLength, curentLength);
        }

        return maxLength;
    }

    private boolean isNumExist(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return true;
            }
        }

        return false;
    }

    private int longestConsecutive2(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }

        int maxLength = 0;
        int curentLength = 0;
        int currentNum = 0;
        for (int i = 0; i < nums.length; i++) {
            curentLength = 1;
            currentNum = nums[i];
            // optimization part
            // start to check the sequence if only if the currentNum is the smallest in the sequence
            if (!uniqueNums.contains(currentNum-1)) {
                while (uniqueNums.contains(currentNum+1)) {
                    currentNum++;
                    curentLength++;
                }
            }

            maxLength = Math.max(maxLength, curentLength);
        }

        return maxLength;
    }

    private int longestConsecutive3(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int maxLength = 0;
        int curentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                curentLength++;
            } else if (nums[i] == nums[i-1]) {
                continue;
            } else {
                curentLength = 1;
            }

            maxLength = Math.max(curentLength, maxLength);
        }
        return Math.max(curentLength, maxLength);
    }

    private int longestConsecutive4(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        UnionFind unionFind = new UnionFind(nums.length);
        Map<Integer, Integer> valToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (valToIndex.containsKey(nums[i])) {
                continue;
            }

            if (valToIndex.containsKey(nums[i] - 1)) {
                unionFind.union(i, valToIndex.get(nums[i] - 1));
            }

            if (valToIndex.containsKey(nums[i] + 1)) {
                unionFind.union(i, valToIndex.get(nums[i] + 1));
            }

            valToIndex.put(nums[i], i);
        }

        return unionFind.getLargestComponentSize();
    }

    static class UnionFind {
        private final int[] indexes;
        private final int[] sizes;
        private final int[] ranks;

        public UnionFind(int N) {
            this.indexes = new int[N];
            this.sizes = new int[N];
            this.ranks = new int[N];
            for (int i = 0; i < N; i++) {
                indexes[i] = i;
                sizes[i] = 1;
                ranks[i] = 0;
            }
        }

        private int find(int i) {
            if (indexes[i] == i) {
                return i;
            }

            return indexes[i] = find(indexes[i]);
        }

        public void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI != parentJ) {
                if (ranks[parentI] > ranks[parentJ]) {
                    indexes[parentJ] = parentI;
                    sizes[parentI] += sizes[parentJ];
                } else {
                    indexes[parentI] = parentJ;
                    sizes[parentJ] += sizes[parentI];
                    if (ranks[parentI] == ranks[parentJ]) {
                        ranks[parentJ] += 1;
                    }
                }
            }
        }

        public int getLargestComponentSize() {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < indexes.length; i++) {
                if (indexes[i] == i && sizes[i] > max) {
                    max = sizes[i];
                }
            }

            return max;
        }
    }
}
