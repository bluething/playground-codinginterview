package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarCipherTest {
    @Test
    void case01() {
        Assertions.assertEquals("okffng-Qwvb", caesarCipher("middle-Outz", 2));
    }
    private String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) ((c - 'a' + k) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) ((c - 'A' + k) % 26 + 'A'));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
