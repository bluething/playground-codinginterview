package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
class MinimumRemoveToMakeValidParenthesesTest {

    @Test
    void case01() {
        Assertions.assertEquals("lee(t(c)o)de", minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("ab(c)d", minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("", minRemoveToMakeValid("))(("));
    }

    private String minRemoveToMakeValid(String s) {
        return "";
    }
}
