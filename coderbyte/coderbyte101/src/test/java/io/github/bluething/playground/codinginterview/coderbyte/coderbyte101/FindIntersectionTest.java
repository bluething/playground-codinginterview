package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

class FindIntersectionTest {
    @Test
    void case01() {
        Assertions.assertEquals("1,4,13", FindIntersection(new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
    }
    @Test
    void case02() {
        Assertions.assertEquals("1,9,10", FindIntersection(new String[]{"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
    }
    private String FindIntersection(String[] strArr) {
        List<String> results = new ArrayList<>();
        String[] nums1 = strArr[0].split(", ");
        String[] nums2 = strArr[1].split(", ");
        Set<String> uniques = new HashSet<>(Arrays.asList(nums1));
        for (String s : nums2) {
            if (uniques.contains(s)) {
                results.add(s);
            }
        }

        return results.isEmpty() ? "false" : String.join(",", results);
    }
}
