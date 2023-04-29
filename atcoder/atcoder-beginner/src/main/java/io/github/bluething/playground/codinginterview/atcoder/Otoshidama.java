package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Scanner;

public class Otoshidama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int total = sc.nextInt();
        for (int i = 1; i <= bill; i++) {
            for (int j = 1; j <= bill-i; j++) {
                int k = bill - i -j;
                if (10000*i + 5000*j + 1000*k == total) {
                    System.out.printf("%d %d %d", i, j, k);
                    System.exit(0);
                }
            }
        }

        System.out.printf("%d %d %d", -1, -1, -1);
    }
}
