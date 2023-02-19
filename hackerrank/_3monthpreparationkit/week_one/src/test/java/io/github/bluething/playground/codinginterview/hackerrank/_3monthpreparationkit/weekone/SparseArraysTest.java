package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    void case04() {
        Assertions.assertEquals(Arrays.asList(2, 1, 0),
                matchingStrings2(Arrays.asList("aba", "baba", "aba", "xzxb"), Arrays.asList("aba", "xzxb", "ab")));
    }

    @Test
    void case05() {
        Assertions.assertEquals(Arrays.asList(1, 0, 1),
                matchingStrings2(Arrays.asList("def", "de", "fgh"), Arrays.asList("de", "lmn", "fgh")));
    }

    @Test
    void case06() {
        Assertions.assertEquals(Arrays.asList(1, 3, 4, 3, 2),
                matchingStrings2(Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"),
                        Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn")));
    }

    private List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> queryCounters = new HashMap<>();
        for (String query : queries) {
            queryCounters.put(query, 0);
        }
        for (String string : strings) {
            if (queryCounters.containsKey(string)) {
                queryCounters.put(string, queryCounters.get(string) + 1);
            }
        }

        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            results.add(queryCounters.get(query));
        }

        return results;
    }

    private List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        Map<String, Integer> stringCounter = new HashMap<>();
        for (String string : strings) {
            stringCounter.put(string, stringCounter.getOrDefault(string, 0) + 1);
        }
        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            results.add(stringCounter.getOrDefault(query, 0));
        }
        return results;

    }
}