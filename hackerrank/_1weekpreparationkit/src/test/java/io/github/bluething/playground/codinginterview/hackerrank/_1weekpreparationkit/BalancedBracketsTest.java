package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBracketsTest {
    @Test
    void case01() {
        Assertions.assertEquals("YES", isBalanced("{[()]}"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("NO", isBalanced("{[(])}"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("YES", isBalanced("{{[[(())]]}}"));
    }
    private String isBalanced(String s) {
        if (s == null || s.isEmpty() || s.length() % 2 != 0) {
            return "NO";
        }

        char[] stack = new char[s.length()];
        int index = 0;
        char[] mapping = new char[128];
        mapping[')'] = '(';
        mapping['}'] = '{';
        mapping[']'] = '[';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping[c] != 0) {
                if (index == 0) {
                    return "NO";
                }

                if (stack[index - 1] != mapping[c]) {
                    return "NO";
                }
                index--;
            } else {
                stack[index++] = c;
            }
        }

        return index == 0 ? "YES" : "NO";
    }
}
