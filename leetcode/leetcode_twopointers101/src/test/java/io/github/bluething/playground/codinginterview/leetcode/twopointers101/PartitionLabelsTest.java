package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return null;
    }
}