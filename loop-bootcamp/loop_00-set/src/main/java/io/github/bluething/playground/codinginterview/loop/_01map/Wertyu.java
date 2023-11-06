package io.github.bluething.playground.codinginterview.loop._01map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Wertyu {

    private static final Map<Character, Character> keyboards = new HashMap<>();
    public static void main(String[] args) throws IOException {
        init();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentence;
        StringBuilder sb;
        while (true) {
            sentence = bufferedReader.readLine();
            if (sentence == null) {
                break;
            }

            sb = new StringBuilder();
            for (char c : sentence.toCharArray()) {
                sb.append(keyboards.get(c));
            }

            System.out.println(sb);
        }
    }

    private static void init() {
        keyboards.put('1', '`');
        keyboards.put('2', '1');
        keyboards.put('3', '2');
        keyboards.put('4', '3');
        keyboards.put('5', '4');
        keyboards.put('6', '5');
        keyboards.put('7', '6');
        keyboards.put('8', '7');
        keyboards.put('9', '8');
        keyboards.put('0', '9');
        keyboards.put('-', '0');
        keyboards.put('=', '-');

        keyboards.put('W', 'Q');
        keyboards.put('E', 'W');
        keyboards.put('R', 'E');
        keyboards.put('T', 'R');
        keyboards.put('Y', 'T');
        keyboards.put('U', 'Y');
        keyboards.put('I', 'U');
        keyboards.put('O', 'I');
        keyboards.put('P', 'O');
        keyboards.put('[', 'P');
        keyboards.put(']', '[');
        keyboards.put('\\', ']');

        keyboards.put('S', 'A');
        keyboards.put('D', 'S');
        keyboards.put('F', 'D');
        keyboards.put('G', 'F');
        keyboards.put('H', 'G');
        keyboards.put('J', 'H');
        keyboards.put('K', 'J');
        keyboards.put('L', 'K');
        keyboards.put(';', 'L');
        keyboards.put('\'', ';');

        keyboards.put('X', 'Z');
        keyboards.put('C', 'X');
        keyboards.put('V', 'C');
        keyboards.put('B', 'V');
        keyboards.put('N', 'B');
        keyboards.put('M', 'N');
        keyboards.put(',', 'M');
        keyboards.put('.', ',');
        keyboards.put('/', '.');

        keyboards.put(' ', ' ');
    }

}
