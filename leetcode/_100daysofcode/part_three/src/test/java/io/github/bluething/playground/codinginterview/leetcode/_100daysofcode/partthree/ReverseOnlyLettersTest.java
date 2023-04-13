package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reverse-only-letters/
class ReverseOnlyLettersTest {

    @Test
    void case01() {
        Assertions.assertEquals("dc-ba", reverseOnlyLetters("ab-cd"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("j-Ih-gfE-dCba", reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    @Test
    void case04() {
        Assertions.assertEquals("dc-ba", reverseOnlyLetters2("ab-cd"));
    }

    @Test
    void case05() {
        Assertions.assertEquals("j-Ih-gfE-dCba", reverseOnlyLetters2("a-bC-dEf-ghIj"));
    }

    @Test
    void case06() {
        Assertions.assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters2("Test1ng-Leet=code-Q!"));
    }

    private String reverseOnlyLetters(String s) {
        char[] sChar = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        char temp = '0';
        while (i < j) {
            if (Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))) {
                temp = s.charAt(i);
                sChar[i] = s.charAt(j);
                sChar[j] = temp;
                i++;
                j--;
            } else {
                if (!Character.isLetter(s.charAt(i))) {
                    i++;
                }
                if (!Character.isLetter(s.charAt(j))) {
                    j--;
                }
            }
        }
        return new String(sChar);
    }

    private String reverseOnlyLetters2(String s) {
        char[] sChar = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        char temp = '0';
        while (i < j) {
            if (!Character.isLetter(sChar[i])) {
                i++;
                continue;
            }
            if (!Character.isLetter(sChar[j])) {
                j--;
                continue;
            }

            temp = sChar[i];
            sChar[i] = sChar[j];
            sChar[j] = temp;
            i++;
            j--;
        }
        return new String(sChar);
    }
}
