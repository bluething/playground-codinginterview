package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramTest {

    @Test
    public void case01() {
        Assertions.assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    public void case02() {
        Assertions.assertFalse(isAnagram("rat", "car"));
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqs = new HashMap<>();
        for (char sChar : s.toCharArray()) {
            freqs.put(sChar, freqs.getOrDefault(sChar, 0) + 1);
        }

        for (char tChar : t.toCharArray()) {
            if (freqs.containsKey(tChar) && freqs.get(tChar) > 0) {
                freqs.put(tChar, freqs.get(tChar) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
