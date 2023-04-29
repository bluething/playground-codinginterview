package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class CardGameForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        Arrays.sort(cards);
        reverse(cards);
        int score = 0;
        for (int i = cards.length-1; i >= 0; i--) {
            if (i % 2 == 0) {
                score += cards[i];
            } else {
                score -= cards[i];
            }
        }

        System.out.println(score);
    }

    static void reverse(int[] cards) {
        for (int i = 0; i < cards.length/2; i++) {
            int temp = cards[i];
            cards[i] = cards[cards.length-1-i];
            cards[cards.length-1-i] = temp;
        }
    }
}
