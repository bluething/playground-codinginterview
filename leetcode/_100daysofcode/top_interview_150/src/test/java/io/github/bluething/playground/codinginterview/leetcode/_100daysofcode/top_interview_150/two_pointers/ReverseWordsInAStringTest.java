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

    @Test
    void case04() {
        Assertions.assertEquals("blue is sky the", reverseWords2("the sky is blue"));
    }

    @Test
    void case05() {
        Assertions.assertEquals("world hello", reverseWords2("  hello world  "));
    }

    @Test
    void case06() {
        Assertions.assertEquals("example good a", reverseWords2("a good   example"));
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

    // just convert to an array then iterate from last element
    // what we need to do is identify the word sequence
    // from last i find 1st space value
    //  this index will be a 1st char in the word
    private String reverseWords2(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = chars.length-1; i>=0; i--) {
            if (chars[i] == ' ') {
                continue;
            }

            int j=i;
            while (j >= 0 && chars[j] != ' ') {
                j--;
            }
            // need to +1 because in the code above the j index will point to the space value
            for (int k = j+1; k <= i; k++) {
                sb.append(chars[k]);
            }
            sb.append(" ");

            i = j;
        }

        // remove extra space
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
