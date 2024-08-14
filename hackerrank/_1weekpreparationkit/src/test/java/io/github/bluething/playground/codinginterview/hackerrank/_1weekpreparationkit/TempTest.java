package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TempTest {
    @Test
    void case01() {
        Assertions.assertEquals("serang di waktu fajar dengan kekuatan penuh", bacaPesan("xj..wfsl in. bfpyz kfo.fw ijslfs pjpzfy.fs ujszm"));
    }
    public String bacaPesan(String sandi) {
        int key = 0;
        for (char c : sandi.toCharArray()) {
            if ('.' == c) {
                key++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : sandi.toCharArray()) {
            if (c == '.') {
                continue;
            } else if (c == ' ') {
                result.append(' ');
                continue;
            }
            char decryptedChar = (char) (c - key);
            if (decryptedChar < 'a') {
                decryptedChar += 26;
            }
            result.append(decryptedChar);
        }

        return result.toString();
    }
}
