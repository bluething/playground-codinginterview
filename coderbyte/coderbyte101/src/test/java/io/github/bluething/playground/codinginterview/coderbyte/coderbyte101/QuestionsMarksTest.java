package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestionsMarksTest {
    @Test
    void case01() {
        Assertions.assertEquals("true", QuestionsMarks("arrb6???4xxbl5???eee5"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("false", QuestionsMarks("aa6?9"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("false", QuestionsMarks("acc?7??sss?3rr1??????5"));
    }
    private String QuestionsMarks(String str) {
        int count = 0;
        int left = 0, right = 0;
        while (left < str.length()) {
            if (Character.isDigit(str.charAt(left))) {
                right = left + 1;
                count = 0;
                while (right < str.length()) {
                    if ('?' == str.charAt(right)) {
                        count++;
                    }
                    if (Character.isDigit(str.charAt(right))) {
                        int sum = Integer.parseInt(str.charAt(left) + "") + Integer.parseInt(str.charAt(right) + "");
                        if (!(sum == 10 && count == 3)) {
                            return "false";
                        }
                        left = right;
                        break;
                    }

                    right++;
                }
            }

            left++;
        }
        return "true";
    }
}
