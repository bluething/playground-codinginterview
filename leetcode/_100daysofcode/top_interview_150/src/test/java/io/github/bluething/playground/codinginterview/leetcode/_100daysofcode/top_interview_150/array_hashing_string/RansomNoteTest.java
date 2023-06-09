package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&id=top-interview-150
class RansomNoteTest {

    @Test
    void case01() {
        Assertions.assertFalse(canConstruct("a", "b"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(canConstruct("aa", "ab"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(canConstruct("aa", "aab"));
    }

    @Test
    void case04() {
        Assertions.assertTrue(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(canConstruct2("a", "b"));
    }

    @Test
    void case06() {
        Assertions.assertFalse(canConstruct2("aa", "ab"));
    }

    @Test
    void case07() {
        Assertions.assertTrue(canConstruct2("aa", "aab"));
    }

    @Test
    void case08() {
        Assertions.assertTrue(canConstruct2("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    private boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> ransomCharFreq = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            ransomCharFreq.put(c, ransomCharFreq.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (ransomCharFreq.get(c) != null) {
                ransomCharFreq.put(c, ransomCharFreq.get(c) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : ransomCharFreq.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }

        return true;
    }

    private boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] freqChar = new char[26];

        for (char c : magazine.toCharArray()) {
            freqChar[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (freqChar[c - 'a'] == 0) {
                return false;
            }
            freqChar[c - 'a']--;
        }

        return true;
    }
}
