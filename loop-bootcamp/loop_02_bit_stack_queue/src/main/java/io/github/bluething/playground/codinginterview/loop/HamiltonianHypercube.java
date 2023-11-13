package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamiltonianHypercube {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int decimalStart = Integer.parseInt(input[1], 2);
        int decimalEnd = Integer.parseInt(input[2], 2);
        int counter = 1;
        while (decimalStart != decimalEnd) {
            decimalStart = decimalStart ^ (counter++ << 1);
        }
        System.out.println(counter);
    }
}
