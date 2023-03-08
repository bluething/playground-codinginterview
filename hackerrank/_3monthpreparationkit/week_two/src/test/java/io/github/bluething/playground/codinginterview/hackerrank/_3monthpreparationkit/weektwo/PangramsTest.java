package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-pangrams/problem
public class PangramsTest {
    @Test
    public void case01() {
        Assertions.assertEquals("not pangram", pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    @Test
    public void case02() {
        Assertions.assertEquals("pangram", pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    private String pangrams(String s) {
        return "";
    }
}
