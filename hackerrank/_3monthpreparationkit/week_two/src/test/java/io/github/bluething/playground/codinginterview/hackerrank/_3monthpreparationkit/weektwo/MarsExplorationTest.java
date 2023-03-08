package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsExplorationTest {
    @Test
    public void case01() {
        Assertions.assertEquals(3, marsExploration("SOSSPSSQSSOR"));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(1, marsExploration("SOSSOT"));
    }

    private int marsExploration(String s) {
        int numOfDiffChar = 0;
        int i = 0;
        while (i < s.length()) {
            if ('S' != s.charAt(i++)) {
                numOfDiffChar++;
            }
            if ('O' != s.charAt(i++)) {
                numOfDiffChar++;
            }
            if ('S' != s.charAt(i++)) {
                numOfDiffChar++;
            }
        }

        return numOfDiffChar;
    }
}
