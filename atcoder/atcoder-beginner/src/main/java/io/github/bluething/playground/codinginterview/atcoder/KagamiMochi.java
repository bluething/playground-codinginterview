package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class KagamiMochi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mochis = new int[n];
        for (int i = 0; i < n; i++) {
            mochis[i] = scanner.nextInt();
        }
        Arrays.sort(mochis);
        reverse(mochis);
        int stack = 1;
        for (int i = 1; i < mochis.length; i++) {
            if (mochis[i-1] == mochis[i]) {
                continue;
            }
            stack++;
        }

        System.out.println(stack);
    }

    static void reverse(int[] cards) {
        for (int i = 0; i < cards.length/2; i++) {
            int temp = cards[i];
            cards[i] = cards[cards.length-1-i];
            cards[cards.length-1-i] = temp;
        }
    }
}
