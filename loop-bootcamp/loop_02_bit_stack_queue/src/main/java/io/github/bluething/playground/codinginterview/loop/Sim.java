package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Sim {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfTestCase; i++) {
            String input = bufferedReader.readLine();
            LinkedList<Character> stack = new LinkedList<>();
            ListIterator<Character> cursor = stack.listIterator();

            for (char c : input.toCharArray()) {
                if ('<' == c) {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                } else if ('[' == c) {
                    cursor = stack.listIterator();
                } else if (']' == c) {
                    cursor = stack.listIterator(stack.size());
                } else {
                    cursor.add(c);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
