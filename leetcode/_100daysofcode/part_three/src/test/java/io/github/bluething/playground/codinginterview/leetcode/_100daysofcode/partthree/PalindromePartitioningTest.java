package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/palindrome-partitioning/
class PalindromePartitioningTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")), partition("aab"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a")), partition("a"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")), partition2("aab"));
    }

    @Test
    void case04() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a")), partition2("a"));
    }

    private List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<>();
        backtracking(results, new ArrayList<>(), s, 0);
        return results;
    }

    // to know if string is a palindrome we must have a start and end index
    // if we meet a palindrome substring, add to the temp then backtracking to the rest of string
    private void backtracking(List<List<String>> result, List<String> temp, String s, int start) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int end=start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                temp.add(s.substring(start, end+1));
                backtracking(result, temp, s, end+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private List<List<String>> partition2(String s) {
        List<List<String>> results = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];
        backtracking(results, new ArrayList<>(), s, 0, dp);
        return results;
    }

    // eliminate to call palindrome function
    // a substring is a palindrome if
    //// a char at start and end are equal
    //// a substring from start+1 until end-1 is a palindrome
    private void backtracking(List<List<String>> result, List<String> temp, String s, int start, boolean[][] dp) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int end=start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end) &&
                    (end-start <= 2 || dp[start+1][end-1])) {
                temp.add(s.substring(start, end+1));
                dp[start][end] = true;
                backtracking(result, temp, s, end+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
