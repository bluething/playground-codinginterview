package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class BasicCalculatorTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, calculate("1 + 1"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(3, calculate("1 + 2"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(23, calculate("(1+(4+5+2)-3)+(6+8)"));
    }
    private int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int sign = 1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }
}
