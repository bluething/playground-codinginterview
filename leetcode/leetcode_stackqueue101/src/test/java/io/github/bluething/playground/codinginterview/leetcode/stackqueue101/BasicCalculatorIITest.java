package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class BasicCalculatorIITest {
    @Test
    void case01() {
        Assertions.assertEquals(7, calculate("3+2*2"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, calculate(" 3/2 "));
    }
    @Test
    void case03() {
        Assertions.assertEquals(5, calculate(" 3+5 / 2 "));
    }
    private int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (operator == '+') {
                    stack.push(number);
                } else if (operator == '-') {
                    stack.push(-number);
                } else if (operator == '*') {
                    stack.push(stack.pop() * number);
                } else if (operator == '/') {
                    stack.push(stack.pop() / number);
                }

                operator = c;
                number = 0;
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
