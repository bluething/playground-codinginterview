package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamiltonianHypercube2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        StringBuilder sb1 = new StringBuilder(input[1]);
        convert(sb1);
        StringBuilder sb2 = new StringBuilder(input[2]);
        convert(sb2);

        long v1 = val(sb1.toString());
        long v2 = val(sb2.toString());

        System.out.println(v2-v1-1);
    }

    private static void convert(StringBuilder s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                if (s.charAt(i + 1) == '1') {
                    s.setCharAt(i + 1, '0');
                } else {
                    s.setCharAt(i + 1, '1');
                }
            }
        }
    }

    private static long val(String s) {
        long ret = 0;
        for (char c : s.toCharArray()) {
            ret <<= 1;
            if (c == '1') {
                ret++;
            }
        }
        return ret;
    }
}
