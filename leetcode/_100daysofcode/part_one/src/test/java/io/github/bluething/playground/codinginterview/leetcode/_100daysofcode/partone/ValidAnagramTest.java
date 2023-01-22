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

    @Test
    public void case03() {
        Assertions.assertTrue(isAnagram2("anagram", "nagaram"));
    }

    @Test
    public void case04() {
        Assertions.assertFalse(isAnagram2("rat", "car"));
    }

    @Test
    public void case05() {
        Assertions.assertTrue(isAnagram3("anagram", "nagaram"));
    }

    @Test
    public void case06() {
        Assertions.assertFalse(isAnagram3("rat", "car"));
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

    private boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char currentChar = '\u0000';
        Map<Character, Integer> freqs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            freqs.put(currentChar, freqs.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            currentChar = t.charAt(i);
            if (freqs.containsKey(currentChar) && freqs.get(currentChar) > 0) {
                freqs.put(currentChar, freqs.get(currentChar) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    private boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freqs = new int[26];
        for (int i = 0; i < s.length(); i++) { {
            freqs[s.charAt(i) - 97]++;
        }}
        for (int i = 0; i < s.length(); i++) { {
            freqs[t.charAt(i) - 97]--;
        }}
        for (int freq : freqs) {
            if (freq < 0) {
                return false;
            }
        }

        return true;
    }
}
