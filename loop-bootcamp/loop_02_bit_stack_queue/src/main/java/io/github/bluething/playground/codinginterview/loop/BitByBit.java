package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitByBit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int numOfInstruction = Integer.parseInt(bufferedReader.readLine());
            if (numOfInstruction == 0) {
                return;
            }

            char[] bits = "????????????????????????????????".toCharArray();
            String[] instruction;
            for (int i = 0; i < numOfInstruction; i++) {
                instruction = bufferedReader.readLine().split(" ");
                if ("CLEAR".equals(instruction[0])) {
                    clear(bits, Integer.parseInt(instruction[1]));
                } else if ("SET".equals(instruction[0])) {
                    set(bits, Integer.parseInt(instruction[1]));
                } else if ("OR".equals(instruction[0])) {
                    or(bits, Integer.parseInt(instruction[1]), Integer.parseInt(instruction[2]));
                } else if ("AND".equals(instruction[0])) {
                    and(bits, Integer.parseInt(instruction[1]), Integer.parseInt(instruction[2]));
                }
            }

            System.out.println(new StringBuilder(new String(bits)).reverse());
        }
    }

    private static void set(char[] bits, int position) {
        bits[position] = '1';
    }

    private static void clear(char[] bits, int position) {
        bits[position] = '0';
    }

    private static void or(char[] bits, int i, int j) {
        if (bits[i] == '1' || bits[j] == '1') {
            bits[i] = '1';
            return;
        }

        if (bits[i] == '?' || bits[j] == '?') {
            bits[i] = '?';
            return;
        }

        bits[i] = '0';
    }

    private static void and(char[] bits, int i, int j) {

        if (bits[i] == '0' || bits[j] == '0') {
            bits[i] = '0';
            return;
        }

        if (bits[i] == '?' || bits[j] == '?') {
            bits[i] = '?';
            return;
        }

        bits[i] = '1';
    }
}
