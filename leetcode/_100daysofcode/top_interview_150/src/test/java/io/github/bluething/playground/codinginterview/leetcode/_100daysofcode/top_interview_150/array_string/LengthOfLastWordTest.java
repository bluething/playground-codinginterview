package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&id=top-interview-150
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
        String[] ss = s.split("\\s+");
        return ss[ss.length-1].length();
    }
}
