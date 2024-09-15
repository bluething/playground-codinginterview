package io.github.bluething.playground.codinginterview.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryGapTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, solution(9));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, solution(529));
    }
    @Test
    void case03() {
        Assertions.assertEquals(0, solution(15));
    }
    @Test
    void case04() {
        Assertions.assertEquals(0, solution(32));
    }
    @Test
    void case05() {
        Assertions.assertEquals(1, solution(20));
    }
    private int solution(int N) {
        String binary = Integer.toBinaryString(N);
        char[] chars = binary.toCharArray();
        int maxGap = 0, curGap = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                curGap++;
            } else {
                maxGap = Math.max(maxGap, curGap);
                curGap = 0;
            }
        }
        return maxGap;
    }
}
