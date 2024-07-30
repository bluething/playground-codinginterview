package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReorderDataInLogFilesTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"},
                reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"},
                reorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"}));
    }
    private String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isS1Digit = Character.isDigit(split1[1].charAt(0));
            boolean isS2Digit = Character.isDigit(split2[1].charAt(0));
            
            if (isS1Digit && isS2Digit) {
                return 0;
            } else if (isS1Digit) {
                return 1;
            } else if (isS2Digit) {
                return -1;
            } else {
                int compare = split1[1].compareTo(split2[1]);
                if (compare == 0) {
                    return split1[0].compareTo(split2[0]);
                } else {
                    return compare;
                }
            }
        });
        return logs;
    }
}
