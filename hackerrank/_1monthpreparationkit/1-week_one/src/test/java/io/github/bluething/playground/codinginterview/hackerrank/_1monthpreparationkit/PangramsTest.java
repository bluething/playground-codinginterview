package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }

            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                freq[s.charAt(i) - 'a']++;
            } else {
                freq[s.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return "not pangram";
            }
        }

        return "pangram";
    }
}
