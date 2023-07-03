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

    // the key is we need to split by space
    // then save to an array
    // then iterate from last element to construct the result
    private String reverseWords(String s) {
        String[] ss = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = ss.length-1; i >= 0; i--) {
            sb.append(ss[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
