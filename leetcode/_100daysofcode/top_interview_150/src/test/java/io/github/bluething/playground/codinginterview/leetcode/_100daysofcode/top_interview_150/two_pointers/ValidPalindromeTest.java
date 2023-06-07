package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&id=top-interview-150
class ValidPalindromeTest {

    @Test
    void case01() {
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isPalindrome("race a car"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isPalindrome(" "));
    }

    @Test
    void case04() {
        Assertions.assertTrue(isPalindrome(".,"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isPalindrome("0P"));
    }

    @Test
    void case06() {
        Assertions.assertTrue(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    @Test
    void case07() {
        Assertions.assertFalse(isPalindrome2("race a car"));
    }

    @Test
    void case08() {
        Assertions.assertTrue(isPalindrome2(" "));
    }

    @Test
    void case09() {
        Assertions.assertTrue(isPalindrome2(".,"));
    }

    @Test
    void case10() {
        Assertions.assertFalse(isPalindrome2("0P"));
    }

    // the idea is we have a marks to mark alphanumeric char, give a value > 0
    // we need 0 as a mark for non-alphanumeric
    // using two pointers check if the value equal to 0;
    // if both element not equal, mean we find the candidate for palindrome, check it
    // else, need to check which element equal 0 then adjust the pointer
    private boolean isPalindrome(String s) {
        char[] marks = new char[256];
        for (int i = 0; i < 10; i++) {
            marks[i + '0'] = (char) (i + 1);
        }
        for (int i = 0; i < 26; i++) {
            marks[i + 'a'] = marks[i + 'A'] = (char) (i + 11);
        }

        int i = 0;
        int j = s.length() - 1;
        char ci;
        char cj;
        while (i < j) {
            ci = marks[s.charAt(i)];
            cj = marks[s.charAt(j)];
            if (ci != 0 && cj != 0) {
                if (ci != cj) {
                    return false;
                }
                i++;
                j--;
            } else {
                if (ci == 0) {
                    i++;
                }
                if (cj == 0) {
                    j--;
                }
            }
        }

        return true;
    }

    // the idea is using two pointers i,j. Don't forget to casting the string to lowercase;
    // before we compare the value, we need to check if both pointer value is alphanumeric
    // if not, increment the pointer until find the alphanumeric
    private boolean isPalindrome2(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while (i < j && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
            return true;
        }
        return false;
    }
}
