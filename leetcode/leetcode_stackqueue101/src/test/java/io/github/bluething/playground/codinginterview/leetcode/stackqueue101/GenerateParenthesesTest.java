package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GenerateParenthesesTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), generateParenthesis(3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(List.of("()"), generateParenthesis(1));
    }

    private List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void generate(List<String> parenthesis, StringBuilder sb, int open, int close, int max) {
        if (open == max && close == max) {
            parenthesis.add(sb.toString());
            return;
        }

        if (open < max) {
            generate(parenthesis, sb.append("("), open+1, close, max);
            sb.setLength(sb.length()-1);
        }
        if (close < open) {
            generate(parenthesis, sb.append(")"), open, close+1, max);
            sb.setLength(sb.length()-1);
        }
    }
}
