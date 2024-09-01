package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstReverseTest {
    @Test
    void case01() {
        Assertions.assertEquals("etybredoc", FirstReverse("coderbyte"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("edoC evoL I", FirstReverse("I Love Code"));
    }
    private String FirstReverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
