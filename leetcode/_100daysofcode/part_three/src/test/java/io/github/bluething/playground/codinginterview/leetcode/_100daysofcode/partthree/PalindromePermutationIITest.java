package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PalindromePermutationIITest {
    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList("abba", "baab"), generatePalindromes("aabb"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Collections.emptyList(), generatePalindromes("abc"));
    }

    private List<String> generatePalindromes(String s) {
        

        List<String> result = new ArrayList<>();

        return result;
    }
}
