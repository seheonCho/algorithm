package boj.그리디;

import java.util.Scanner;

public class 동전_0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int coinNum = scanner.nextInt();
        int finalSum = scanner.nextInt();
        int[] coins = new int[coinNum];
        int count = 0;

        for (int i = 0; i < coinNum; i++) {
            coins[i] = scanner.nextInt();
        }

        for (int i = coinNum - 1; i >= 0; i--) {

            if (coins[i] <= finalSum) {
                count += (finalSum / coins[i]);
                finalSum = finalSum % coins[i];
            }

        }

        System.out.println(count);
    }

}
