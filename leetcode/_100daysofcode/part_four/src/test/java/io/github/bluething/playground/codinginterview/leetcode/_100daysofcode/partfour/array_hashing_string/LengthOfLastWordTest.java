package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
class LengthOfLastWordTest {

    @Test
    void case01() {
        Assertions.assertEquals(5, lengthOfLastWord("Hello World"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "));
    }


    @Test
    void cas3() {
        Assertions.assertEquals(6, lengthOfLastWord("luffy is still joyboy"));
    }

    private int lengthOfLastWord(String s) {
        return 0;
    }
}
