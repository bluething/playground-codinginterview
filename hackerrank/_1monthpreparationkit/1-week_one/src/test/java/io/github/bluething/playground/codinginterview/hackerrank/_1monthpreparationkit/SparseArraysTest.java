package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SparseArraysTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(2, 1, 0), matchingStrings(List.of("aba", "baba", "aba", "xzxb"), List.of("aba","xzxb", "ab")));
    }

    private List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> stringCount = new HashMap<>();
        for (String string : strings) {
            stringCount.put(string, stringCount.getOrDefault(string, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(stringCount.getOrDefault(query,0));
        }
        return result;
    }
}
