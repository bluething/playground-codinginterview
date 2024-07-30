package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeStringsTest {
    @Test
    void case01() {
        Codec encoder = new Codec();
        Assertions.assertEquals(List.of("Hello", "World"), encoder.decode(encoder.encode(List.of("Hello", "World"))));
    }
    @Test
    void case02() {
        Codec encoder = new Codec();
        Assertions.assertEquals(List.of(""), encoder.decode(encoder.encode(List.of(""))));
    }

    class Codec {
        private static final char DELIMITER = '#';
        public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for (String str : strs) {
                sb.append(str.length()).append(DELIMITER).append(str);
            }
            return sb.toString();
        }
        public List<String> decode(String s) {
            List<String> res = new ArrayList<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                StringBuilder sb = new StringBuilder();
                while (DELIMITER != chars[i]) {
                    sb.append(chars[i++]);
                }
                i++;
                int numOfChars = Integer.parseInt(sb.toString());
                int endOfString = i + numOfChars;
                sb = new StringBuilder();
                while (i < endOfString) {
                    sb.append(chars[i++]);
                }
                i--;
                res.add(sb.toString());
            }
            return res;
        }
    }
}
