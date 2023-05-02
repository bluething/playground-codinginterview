package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindromeTest {
    @Test
    public void case01() {
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void case02() {
        Assertions.assertFalse(isPalindrome("race a car"));
    }

    @Test
    public void case03() {
        Assertions.assertTrue(isPalindrome(" "));
    }

    @Test
    public void case04() {
        Assertions.assertTrue(isPalindrome(".,"));
    }

    @Test
    public void case05() {
        Assertions.assertFalse(isPalindrome("0P"));
    }

    @Test
    public void case06() {
        Assertions.assertTrue(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    @Test
    public void case07() {
        Assertions.assertFalse(isPalindrome2("race a car"));
    }

    @Test
    public void case08() {
        Assertions.assertTrue(isPalindrome2(" "));
    }

    @Test
    public void case09() {
        Assertions.assertTrue(isPalindrome2(".,"));
    }

    @Test
    public void case10() {
        Assertions.assertFalse(isPalindrome2("0P"));
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while (i < s.length() && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isAlphanumeric(s.charAt(j))) {
                j--;
            }
            if ((i < j) && s.charAt(i) != s.charAt(j)) {
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

    private boolean isPalindrome2(String s) {
        // hold alphanumeric (0-9, A-Z, a-z)
        // index is a ascii code
        char[] alphanumeric = new char[256];
        for (int i = 0; i < 10; i++) {
            alphanumeric[i + '0'] = (char) (i + 1);
        }
        for (int i = 0; i < 26; i++) {
            alphanumeric[i + 'a'] = alphanumeric[i + 'A'] = (char) (i + 11);
        }
        char[] sChars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        char ci, cj;
        // if ci and cj have value > 0 in the alphanumeric array mean they are alphanumeric
        // then compare if there are equal
        while (i < j) {
            ci = alphanumeric[sChars[i]];
            cj = alphanumeric[sChars[j]];
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
}
