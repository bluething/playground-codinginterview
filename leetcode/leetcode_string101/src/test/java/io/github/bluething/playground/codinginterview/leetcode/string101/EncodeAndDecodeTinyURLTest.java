package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncodeAndDecodeTinyURLTest {

    @Test
    void case01() {
        Codec codec = new Codec();
        Assertions.assertEquals("https://leetcode.com/problems/design-tinyurl", codec.decode(codec.encode("https://leetcode.com/problems/design-tinyurl")));
    }
    class Codec {

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            return "";
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return "";
        }
    }
}
