package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BracketCombinationsTest {
    @Test
    void case01() {
        Assertions.assertEquals(5, BracketCombinations(3));
    }
    @Test
    void case02() {
        Assertions.assertEquals(2, BracketCombinations(2));
    }
    private int BracketCombinations(int num) {
        List<String> result = new ArrayList<>();
        generate(result, new StringBuilder(), 0, 0, num);
        return result.size();
    }
    private void generate(List<String> result, StringBuilder sb, int open, int close, int max) {
        if (open == max && close == max) {
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            generate(result, sb.append("("), open + 1, close, max);
            sb.setLength(sb.length() - 1);
        }
        if (close < open) {
            generate(result, sb.append(")"), open, close + 1, max);
            sb.setLength(sb.length() - 1);
        }
    }
}
