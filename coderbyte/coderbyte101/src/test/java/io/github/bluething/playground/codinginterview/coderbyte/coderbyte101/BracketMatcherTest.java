package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class BracketMatcherTest {
    @Test
    void case01() {
        Assertions.assertEquals("0", BracketMatcher("(coder)(byte))"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("1", BracketMatcher("(c(oder)) b(yte)"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("0", BracketMatcher("letter(s) gal(o)(r)((e)"));
    }

    private String BracketMatcher(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return "0";
                }
            }
        }

        return stack.isEmpty() ? "1" : "0";
    }
}
