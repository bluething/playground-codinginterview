package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CircuitMath {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfVariables = Integer.parseInt(bufferedReader.readLine());
        boolean[] variables = new boolean[numOfVariables];
        String[] truthValues = bufferedReader.readLine().split(" ");
        for (int i=0; i < truthValues.length; i++) {
            variables[i] = "T".equals(truthValues[i]);
        }
        String[] circuits = bufferedReader.readLine().split(" ");

        Stack<Boolean> ops = new Stack<>();
        for (String circuit : circuits) {
            if ("*".equals(circuit)) {
                ops.push(ops.pop() & ops.pop());
            } else if ("+".equals(circuit)) {
                ops.push(ops.pop() | ops.pop());
            } else if ("-".equals(circuit)) {
                ops.push(!ops.pop());
            } else {
                ops.push(variables[circuit.codePointAt(0) - 65]);
            }
        }

        boolean result = ops.pop();
        if (result) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }
    }
}
