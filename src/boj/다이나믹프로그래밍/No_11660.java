package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11660 {

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[][] map = new int[N + 1][N + 1];
        int[][] dp = new int[N + 1][N + 1];

        StringTokenizer tokens;
        for (int i = 1; i <= N; i++) {
            tokens = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + map[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            tokens = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(tokens.nextToken());
            int second = Integer.parseInt(tokens.nextToken());
            int third = Integer.parseInt(tokens.nextToken());
            int fourth = Integer.parseInt(tokens.nextToken());

            int dpNum = dp[third][fourth] - dp[third][second - 1] - dp[first - 1][fourth] + dp[first - 1][second - 1];
            sb.append(dpNum).append("\n");
        }

        System.out.println(sb);
    }

}
