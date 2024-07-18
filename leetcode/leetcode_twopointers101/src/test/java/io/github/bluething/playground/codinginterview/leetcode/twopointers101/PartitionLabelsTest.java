package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PartitionLabelsTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(9,7,8), partitionLabels("ababcbacadefegdehijhklij"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(10), partitionLabels("eccbbbbdec"));
    }
    private List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        int[] lastIndex = new int[128];
        for (int i = 0; i < chars.length; i++) {
            lastIndex[chars[i]] = i;
        }
        int left = 0, right = 0, currIdx = 0;
        while (currIdx < chars.length) {
            right = Math.max(right, lastIndex[chars[currIdx]]);
            if (right == currIdx) {
                int size = right - left + 1;
                result.add(size);
                right++;
                left = right;
            }
            currIdx++;
        }
        return result;
    }
}