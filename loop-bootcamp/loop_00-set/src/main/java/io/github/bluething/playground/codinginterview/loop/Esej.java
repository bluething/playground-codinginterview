package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Esej {

    static int maxWord = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        String[] inputParts = input.split(" ");
        int atLeast = Integer.parseInt(inputParts[0]);
        int atMost = Integer.parseInt(inputParts[1]);

        maxWord = Integer.max(atLeast, (atMost/2) + 1);
        StringBuilder sb = new StringBuilder();
        generatePermutation(sb, "", "abcdefghijklmnopqrstuvwxyz", 4);
        System.out.println(sb.toString().trim());

    }

    private static void generatePermutation(StringBuilder sb, String prefix, String charSet, int length) {
        if (maxWord == 0) {
            return;
        }
        if (length == 0) {
            sb.append(prefix).append(" ");
            maxWord--;
            return;
        }
        for (int i = 0; i < charSet.length(); i++) {
            char currentChar = charSet.charAt(i);
            generatePermutation(sb, prefix+currentChar, charSet, length-1);
        }
    }
}
