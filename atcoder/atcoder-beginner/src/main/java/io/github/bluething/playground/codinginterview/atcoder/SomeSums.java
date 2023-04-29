package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            if (sum >= a && sum <= b) {
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }

    static int digitSum(int digit) {
        int sum = 0;
        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }

        return sum;
    }
}
