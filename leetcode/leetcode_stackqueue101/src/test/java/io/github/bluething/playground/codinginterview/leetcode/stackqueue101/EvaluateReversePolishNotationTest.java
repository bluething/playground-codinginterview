package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class EvaluateReversePolishNotationTest {
    @Test
    void case01() {
        Assertions.assertEquals(9, evalRPN(new String[]{"2","1","+","3","*"}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(6, evalRPN(new String[]{"4","13","5","/","+"}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(22, evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    private int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(apply(token, a, b));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int apply(String op, int a, int b) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> a / b;
        };
    }
}
