package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZebrasAndOcelots {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] creatures = new String[n];
        for (int i = 0; i < n; i++) {
            String creature = bufferedReader.readLine();
            if ("Z".equals(creature)) {
                creatures[i] = "0";
            } else {
                creatures[i] = "1";
            }
        }

        int creatureInDecimal = Integer.parseInt(String.join("", creatures), 2);
        int t = lowBit(creatureInDecimal);
        int position = findPowerOfTwo(t);
        int counter = 0;
        while (t > 0) {
            creatureInDecimal = clearBit(creatureInDecimal, position);
            for (int i = 0; i < position; i++) {
                creatureInDecimal = setBit(creatureInDecimal, i);
            }
            t = lowBit(creatureInDecimal);
            position = findPowerOfTwo(t);
            counter++;
        }

        System.out.println(counter);
    }

    private static int lowBit(int s) {
        return s & -s;
    }
    private static int clearBit(int s, int j) {
        return s & ~(1 << j);
    }
    private static int setBit(int s, int j) {
        return s | (1 << j);
    }
    private static int findPowerOfTwo(int i) {
        int exponent = 0;
        while ((i >>= 1) > 0) {
            exponent++;
        }
        return exponent;
    }
}
