package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&id=top-interview-150
class WordPatternTest {

    @Test
    void case01() {
        Assertions.assertTrue(wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    void case04() {
        Assertions.assertTrue(wordPattern("a", "a"));
    }

    @Test
    void case05() {
        Assertions.assertTrue(wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
                "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
    }

    @Test
    void case06() {
        Assertions.assertTrue(wordPattern2("abba", "dog cat cat dog"));
    }

    @Test
    void case07() {
        Assertions.assertFalse(wordPattern2("abba", "dog cat cat fish"));
    }

    @Test
    void case08() {
        Assertions.assertFalse(wordPattern2("aaaa", "dog cat cat dog"));
    }

    @Test
    void case09() {
        Assertions.assertTrue(wordPattern2("a", "a"));
    }

    @Test
    void case10() {
        Assertions.assertTrue(wordPattern2("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
                "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
    }

    // the idea is compare the indexes where they last appeared
    // the Map put() return the previous value associated with key, or null if there was no mapping for key.
    // because we only want to use one map then we need deal with char in pattern and string in s
    // we need a generic Map to store them, so we can differentiate between letter "a" and string "a"
    // why using Integer instead of int in the loop? Because autoboxing same value to different objects problem
    // Integer a = 1000, b = 1000 => a == b will be false
    // because Integer will cache if the value between -127 and 128
    // if the words have element > 128 then we need to use other solution
    private boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Object, Integer> indices = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            if (indices.put(pattern.charAt(i), i) != indices.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }

    // using two maps
    private boolean wordPattern2(String pattern, String s) {
        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> patterns = new HashMap<>();
        Map<String, Character> ss = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            // only put 1st mapping
            patterns.putIfAbsent(pattern.charAt(i), words[i]);
            ss.putIfAbsent(words[i], pattern.charAt(i));

            // return false if one of the mapping false for the current index
            if (!ss.get(words[i]).equals(pattern.charAt(i)) ||
                    !patterns.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }

        return true;
    }
}
