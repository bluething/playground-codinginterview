package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertTrue(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    @Test
    public void case06() {
        Assertions.assertFalse(isPalindrome2("race a car"));
    }

    @Test
    public void case07() {
        Assertions.assertTrue(isPalindrome2(" "));
    }

    @Test
    public void case08() {
        Assertions.assertTrue(isPalindrome2(".,"));
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while ((i < s.length() - 1) && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while ((j > 0) && !isAlphanumeric(s.charAt(j))) {
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
        // the ascii code as an index
        // fill with incremental integer value start from 1
        char[] holder = new char[256];
        for (int i = 0; i < 10; i++) {
            holder[i + '0'] = (char) (1 + i);
        }
        for (int i = 0; i < 26; i++) {
            holder[i + 'a'] = holder[i + 'A'] = (char) (11 + i);
        }

        char[] sChars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        char ci;
        char cj;
        while (i < j) {
            ci = holder[sChars[i]];
            cj = holder[sChars[j]];
            // if found integer value > 0, it's mean alphanumeric, compare it to check if the char are same
            // else means the char aren't alphanumeric, then we need to move the pointer if the char wasn't alphanumeric
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
