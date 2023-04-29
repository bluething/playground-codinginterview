package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int _500 = sc.nextInt();
        int _100 = sc.nextInt();
        int _50 = sc.nextInt();
        int money = sc.nextInt();
        int ways = 0;
        for (int i = 0; i <= _500; i++) {
            int total500 = 500 * i;
            for (int j = 0; j <= _100; j++) {
                int total100 = 100 * j;
                for (int k = 0; k <= _50; k++) {
                    int total50 = 50 * k;

                    if (total500 + total100 + total50 == money) {
                        ways++;
                    }
                }
            }
        }

        System.out.println(ways);
    }
}
