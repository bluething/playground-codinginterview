package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInAStringTest {
    @Test
    void case01() {
        Assertions.assertEquals(0, firstUniqChar("leetcode"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(2, firstUniqChar("loveleetcode"));
    }    @Test
    void case03() {
        Assertions.assertEquals(-1, firstUniqChar("aaabb"));
    }


    private int firstUniqChar(String s) {
        return 0;
    }
}
