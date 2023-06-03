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

    @Test
    void case04() {
        Assertions.assertEquals(5, lengthOfLastWord2("Hello World"));
    }

    @Test
    void case05() {
        Assertions.assertEquals(4, lengthOfLastWord2("   fly me   to   the moon  "));
    }


    @Test
    void case06() {
        Assertions.assertEquals(6, lengthOfLastWord2("luffy is still joyboy"));
    }

    private int lengthOfLastWord(String s) {
        String[] ss = s.split("\\s+");
        return ss[ss.length-1].length();
    }

    private int lengthOfLastWord2(String s) {
        int length = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) {
                    break;
                }
            }
        }

        return length;
    }
}
