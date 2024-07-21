package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class BasicCalculatorIIITest {
    @Test
    void case01() {
        Assertions.assertEquals(2, calculate("1 + 1"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, calculate(" 6-4 / 2 "));
    }
    @Test
    void case03() {
        Assertions.assertEquals(21, calculate("2*(5+5*2)/3+(6/2+8)"));
    }
    @Test
    void case04() {
        Assertions.assertEquals(-12, calculate("(2+6* 3+5- (3*14/7+2)*5)+3"));
    }
    private int calculate(String s) {
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        int number;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                number = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                operand.push(number);
                i--;
            } else if (c == '(') {
                operator.push(c);
            } else if (c == ')') {
                while (operator.peek() != '(') {
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push(apply(operator.pop(), a, b));
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && operatorPrecedence(operator.peek()) >= operatorPrecedence(c)) {
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push(apply(operator.pop(), a, b));
                }
                operator.push(c);
            }
        }

        while (!operator.isEmpty()) {
            int b = operand.pop();
            int a = operand.pop();
            operand.push(apply(operator.pop(), a, b));
        }

        return operand.peek();
    }
    private int operatorPrecedence(char op) {
        if (op == '(' || op == ')') {
            return 0;
        } else if (op == '+' || op == '-') {
            return 1;
        } else {
            return 2;
        }
    }
    private int apply(char op, int a, int b) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> a / b;
        };
    }
}
