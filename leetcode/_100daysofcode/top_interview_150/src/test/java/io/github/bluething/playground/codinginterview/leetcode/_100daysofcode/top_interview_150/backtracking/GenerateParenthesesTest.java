package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/description/
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

    // 1. We will have a parentheses with open==max and close==max
    // 2. We can add open until max
    // 3. We can only add close as long as close < open
    // We must remove last char in our StringBuilder, so we can backtrack the rest of stack
    private void generate(List<String> result, StringBuilder sb, int open, int close, int max) {
        if (open == max && close == max) {
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            generate(result, sb.append("("), open+1, close, max);
            sb.setLength(sb.length()-1);
        }
        if (close < open) {
            generate(result, sb.append(")"), open, close+1, max);
            sb.setLength(sb.length()-1);
        }
    }
}
