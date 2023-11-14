package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bufferedReader.readLine()) != null) {
            int numOfOneBit = 0;
            int numOfZeroBit = 0;
            for (int i = 0; i < input.length(); i++) {
                int one = Integer.bitCount(input.charAt(i));
                numOfOneBit += one;
                numOfZeroBit += 7 - one;
            }

            System.out.println(numOfOneBit % 2 == 0 & numOfZeroBit % 2 == 0 ? "free" : "trapped");
        }
    }
}
