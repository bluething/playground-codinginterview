package io.github.bluething.playground.codinginterview.atcoder;

import java.util.Scanner;

public class ShiftOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = 0;
        boolean isEven = true;
        while (isEven) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    nums[i] /= 2;
                } else {
                    isEven = false;
                    break;
                }
            }
            if (isEven) {
                count++;
            }
        }

        System.out.println(count);
    }
}
