package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-nice-substring/
class LongestNiceSubstringTest {

    @Test
    void case01() {
        Assertions.assertEquals("aAa", longestNiceSubstring("YazaAay"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("Bb", longestNiceSubstring("Bb"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("", longestNiceSubstring("C"));
    }

    @Test
    void case04() {
        Assertions.assertEquals("aAa", longestNiceSubstring2("YazaAay"));
    }

    @Test
    void case05() {
        Assertions.assertEquals("Bb", longestNiceSubstring2("Bb"));
    }

    @Test
    void case06() {
        Assertions.assertEquals("", longestNiceSubstring2("C"));
    }

    @Test
    void case07() {
        Assertions.assertEquals("aAa", longestNiceSubstring3("YazaAay"));
    }

    @Test
    void case08() {
        Assertions.assertEquals("Bb", longestNiceSubstring3("Bb"));
    }

    @Test
    void case09() {
        Assertions.assertEquals("", longestNiceSubstring3("C"));
    }

    private String longestNiceSubstring(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String tmp = s.substring(i,j);
                if (tmp.length() > 1
                && result.length() < tmp.length()
                && isNiceString(tmp)) {
                    result = tmp;
                }
            }
        }
        return result;
    }
    // get all unique char
    // in the set we must hava upper and lower pair for each char
    private boolean isNiceString(String s) {
        Set<Character> sUnique = new HashSet<>();
        for (char sChar : s.toCharArray()) {
            sUnique.add(sChar);
        }
        for (char sChar : sUnique) {
            if (sUnique.contains(Character.toUpperCase(sChar)) != sUnique.contains(Character.toLowerCase(sChar))) {
                return false;
            }
        }

        return true;
    }

    private String longestNiceSubstring2(String s) {
        int[] idx = longestNiceSubstring2(s, 0, s.length());
        return s.substring(idx[0], idx[1]);
    }

    private int[] longestNiceSubstring2(String s, int left, int right) {
        Set<Character> sUnique = toCharSet(s, left, right);
        for (int i=left; i < right; i++) {
            if (!sUnique.contains(Character.toUpperCase(s.charAt(i)))
            || !sUnique.contains(Character.toLowerCase(s.charAt(i)))) {
                int[] prefix = longestNiceSubstring2(s, left, i);
                int[] suffix = longestNiceSubstring2(s, i+1, right);
                return prefix[1] - prefix[0] >= suffix[1] - suffix[0]
                        ? prefix
                        : suffix;
            }
        }

        return new int[] {left, right};
    }

    private Set<Character> toCharSet(String s, int left, int right) {
        Set<Character> sUnique = new HashSet<>();
        for (int i=left; i < right; i++) {
            sUnique.add(s.charAt(i));
        }

        return sUnique;
    }

    // get unique char for each substring
    // if the substring have unpair upper and lower
    //// divide into 2 parts and recursively repeat the process
    // at the end of the loop we will have substring that have upper-lower pair
    // s1 always won because we want to have 1st longest substring
    private String longestNiceSubstring3(String s) {
        Set<Character> sUnique = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            sUnique.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (sUnique.contains(Character.toUpperCase(s.charAt(i))) &&
                    sUnique.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstring3(s.substring(0, i));
            String s2 = longestNiceSubstring3(s.substring(i+1));
            return s1.length()>= s2.length() ? s1 : s2;
        }
        return s;
    }
}
