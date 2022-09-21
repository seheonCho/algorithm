package boj.다이나믹프로그래밍;

import java.util.Scanner;

public class No_11727 {

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i - 1] + (2 * dp[i - 2])) % 10007;
        }

        System.out.println(dp[N]);
    }

}
