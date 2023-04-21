package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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

    // we need to know which char that must be deleted
    // using stack, push every open parentheses
    // for each open, only pop the stack if the stack was not empty and the top value is open
    //// we put the index, so we need to get from the string
    // otherwise, push to the top, this is the char that we need to remove later.
    private String minRemoveToMakeValid(String s) {
        Stack<Integer> removedIdx = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                removedIdx.push(i);
            } else if (s.charAt(i) == ')') {
                if (!removedIdx.isEmpty() && s.charAt(removedIdx.peek()) == '(') {
                    removedIdx.pop();
                } else {
                    removedIdx.push(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while (!removedIdx.isEmpty()) {
            sb.deleteCharAt(removedIdx.pop());
        }

        return sb.toString();
    }
}
