package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_1932 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokens;

        int arrSize = 1;
        int[][] input = new int[N][];
        for (int i = 0; i < N; i++) {
            input[i] = new int[arrSize];

            tokens = new StringTokenizer(br.readLine());
            int idx = 0;
            while (tokens.hasMoreTokens()) {
                int token = Integer.parseInt(tokens.nextToken());
                input[i][idx] = token;
                idx++;
            }

            arrSize++;
        }

        int[][] dp = new int[N][];
        dp[0] = new int[1];
        dp[0][0] = input[0][0];

        for (int i = 1; i <= input.length - 1; i++) {
            dp[i] = new int[input[i].length];

            for (int j = 0; j < input[i].length; j++) {

                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + input[i][j];
                } else if (j == input[i].length - 1) {
                    dp[i][j] = dp[i - 1][input[i].length - 2] + input[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + input[i][j];
                }
            }

        }

        Arrays.sort(dp[N - 1]);
        System.out.println(dp[N - 1][N - 1]);

    }

}
