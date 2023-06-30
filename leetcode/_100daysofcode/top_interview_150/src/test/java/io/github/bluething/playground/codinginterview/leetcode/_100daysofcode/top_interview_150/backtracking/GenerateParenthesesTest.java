package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return null;
    }
}
