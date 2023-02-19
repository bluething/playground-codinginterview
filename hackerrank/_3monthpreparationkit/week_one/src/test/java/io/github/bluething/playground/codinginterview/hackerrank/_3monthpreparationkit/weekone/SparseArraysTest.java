package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-sparse-arrays/problem
public class SparseArraysTest {
    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(2, 1, 0),
                matchingStrings(Arrays.asList("aba", "baba", "aba", "xzxb"), Arrays.asList("aba", "xzxb", "ab")));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(1, 0, 1),
                matchingStrings(Arrays.asList("def", "de", "fgh"), Arrays.asList("de", "lmn", "fgh")));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Arrays.asList(1, 3, 4, 3, 2),
                matchingStrings(Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"),
                        Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn")));
    }

    private List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        return Collections.emptyList();
    }
}
