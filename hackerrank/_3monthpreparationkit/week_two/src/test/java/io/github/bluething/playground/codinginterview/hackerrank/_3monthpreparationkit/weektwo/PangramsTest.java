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
        char[] alphabet = new char[26];
        s = s.toLowerCase();
        for (char sChar : s.toCharArray()) {
            if (sChar >= 97 && sChar <= 122 ) {
                alphabet[sChar - 97]++;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 0) {
                return "not pangram";
            }
        }

        return "pangram";
    }
}
