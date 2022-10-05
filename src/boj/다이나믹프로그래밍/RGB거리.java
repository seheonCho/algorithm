package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class RGB거리 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        dp[0][0] = Integer.parseInt(tokens.nextToken());
        dp[0][1] = Integer.parseInt(tokens.nextToken());
        dp[0][2] = Integer.parseInt(tokens.nextToken());

        for (int i = 1; i < N; i++) {
            tokens = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(tokens.nextToken());
            dp[i][1] = Integer.parseInt(tokens.nextToken());;
            dp[i][2] = Integer.parseInt(tokens.nextToken());

            dp[i][0] += min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += min(dp[i - 1][0], dp[i - 1][1]);

        }

        System.out.println(min(min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));

    }

}
