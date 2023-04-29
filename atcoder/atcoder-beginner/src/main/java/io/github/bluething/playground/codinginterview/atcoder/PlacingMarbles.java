package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Scanner;

public class PlacingMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += (a / (int)Math.pow(10, i)) % 10;
        }
        System.out.println(sum);
    }
}
