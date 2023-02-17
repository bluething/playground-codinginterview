package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagramsTest {

    @Test
    void case01() {
        List<String> expected = Arrays.asList("abba","cd");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
    }

    @Test
    void case02() {
        List<String> expected = Arrays.asList("a","b","c","d","e");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    private List<String> removeAnagrams(String[] words) {
        return Collections.emptyList();
    }
}
