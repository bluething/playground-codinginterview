package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindFirstPalindromicStringInTheArrayTest {

    @Test
    public void case01() {
        Assertions.assertEquals("ada", firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals("racecar", firstPalindrome(new String[]{"notapalindrome","racecar"}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals("", firstPalindrome(new String[]{"def","ghi"}));
    }

    private String firstPalindrome(String[] words) {
        return "";
    }
}
