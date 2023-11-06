package io.github.bluething.playground.codinginterview.loop._01map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wertyu2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        StringBuilder sb;
        String row0 = "`1234567890-=";
        String row1 = "QWERTYUIOP[]\\";
        String row2 = "ASDFGHJKL;'";
        String row3 = "ZXCVBNM,./";
        while (true) {
            sentence = bufferedReader.readLine();
            if (sentence == null) {
                break;
            }

            sb = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                String c = sentence.substring(i, i+1);
                if (row0.contains(c)) {
                    sb.append(row0.charAt(row0.indexOf(c)-1));
                } else if (row1.contains(c)) {
                    sb.append(row1.charAt(row1.indexOf(c)-1));
                } else if (row2.contains(c)) {
                    sb.append(row2.charAt(row2.indexOf(c)-1));
                } else if (row3.contains(c)) {
                    sb.append(row3.charAt(row3.indexOf(c)-1));
                } else {
                    sb.append(" ");
                }
            }

            System.out.println(sb);
        }
    }
}
