package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumIndexSumofTwoListsTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new String[]{"Shogun"}, findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Shogun","Tapioca Express","Burger King","KFC"}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new String[]{"Shogun"}, findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Shogun","Burger King"}));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new String[]{"sad","happy"}, findRestaurant(new String[]{"happy","sad","good"},
                new String[]{"sad","happy","good"}));
    }

    private String[] findRestaurant(String[] list1, String[] list2) {
        return new String[]{};
    }
}
