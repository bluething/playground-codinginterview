package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZebrasAndOcelots2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        long counter = 0;
        while (n-- > 0) {
            if ("O".equals(bufferedReader.readLine())) {
                counter += 1L << n;
            }
        }
        System.out.println(counter);
    }
}
