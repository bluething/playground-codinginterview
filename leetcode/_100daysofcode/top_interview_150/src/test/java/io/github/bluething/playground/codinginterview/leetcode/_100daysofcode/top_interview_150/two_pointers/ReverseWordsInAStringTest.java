package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
class ReverseWordsInAStringTest {

    @Test
    void case01() {
        Assertions.assertEquals("blue is sky the", reverseWords("the sky is blue"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("world hello", reverseWords("  hello world  "));
    }

    @Test
    void case03() {
        Assertions.assertEquals("example good a", reverseWords("a good   example"));
    }

    private String reverseWords(String s) {
        return "";
    }
}
