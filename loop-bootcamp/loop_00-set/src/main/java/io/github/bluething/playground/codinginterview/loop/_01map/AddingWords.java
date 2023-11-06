package io.github.bluething.playground.codinginterview.loop._01map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AddingWords {

    private static Map<String, Integer> definition = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String command;
        String[] commands;
        while (true) {
            command = bufferedReader.readLine();
            if (command == null) {
                break;
            }

            commands = command.split(" ");
            if ("def".equals(commands[0])) {
                assign(commands[1], commands[2]);
            } else if ("calc".equals(commands[0])) {
                calc(commands);
            } else {
                clear();
            }
        }
    }

    private static void assign(String key, String value) {
        definition.put(key, Integer.valueOf(value));
    }
    private static void calc(String[] commands) {
        Stack<Integer> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        boolean invalid = false;
        for (int i = 1; i < commands.length; i++) {

            if ("+".equals(commands[i]) || "-".equals(commands[i])) {
                while (!operators.empty()) {
                    doOps(operators, operands);
                }

                operators.push(commands[i]);
            } else if ("=".equals(commands[i])) {
                break;
            } else {
                if (definition.get(commands[i]) == null) {
                    invalid = true;
                    break;
                }

                operands.push(definition.get(commands[i]));
            }
        }

        while (!operators.empty() && !invalid) {
            doOps(operators, operands);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i < commands.length; i++) {
            result.append(commands[i]).append(" ");
        }
        if (invalid) {
            System.out.println(result.append("unknown"));
        } else {
            System.out.println(result.append(getByValue(operands.pop())));
        }
    }
    private static String getByValue(int value) {
        for (Map.Entry<String, Integer> entry : definition.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }

        return "unknown";
    }
    private static void doOps(Stack<String> operators, Stack<Integer> operands) {
        if (operands.size() < 2) {
            return;
        }

        int operand2 = operands.pop();
        int operand1 = operands.pop();
        String operator = operators.pop();

        if ("+".equals(operator)) {
            operands.push(operand1 + operand2);
        } else {
            operands.push(operand1 - operand2);
        }
    }
    private static void clear() {
        definition = new HashMap<>();
    }
}
