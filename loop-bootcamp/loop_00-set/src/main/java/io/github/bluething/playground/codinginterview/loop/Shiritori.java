package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Shiritori {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfRound = Integer.parseInt(bufferedReader.readLine());
        Set<String> words = new HashSet<>();
        String word = bufferedReader.readLine();
        words.add(word);
        char lastChr = word.charAt(word.length()-1);
        int round = 2;
        for (; round <= numOfRound; round++) {
            word = bufferedReader.readLine();
            if (word.charAt(0) != lastChr || !words.add(word)) {
                break;
            }
            lastChr = word.charAt(word.length()-1);
        }
        round--;

        if (round == numOfRound) {
            System.out.print("Fair Game");
        } else if (round % 2 == 0) {
            System.out.print("Player 1 lost");
        } else {
            System.out.print("Player 2 lost");
        }
    }
}
