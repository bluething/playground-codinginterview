package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestWordTest {
    @Test
    void case01() {
        Assertions.assertEquals("time", LongestWord("fun&!! time"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("love", LongestWord("I love dogs"));
    }
    private String LongestWord(String sen) {
        StringBuilder builder = new StringBuilder();
        String result = sen;
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < sen.length(); i++) {
            if (Character.isLetterOrDigit(sen.charAt(i))) {
                builder.append(sen.charAt(i));
                count++;
            } else {
                if (count > maxLength) {
                    maxLength = count;
                    result = builder.toString();
                }

                builder = new StringBuilder();
                count = 0;
            }
        }

        if (count > maxLength) {
            result = builder.toString();
        }

        return result;
    }
}
