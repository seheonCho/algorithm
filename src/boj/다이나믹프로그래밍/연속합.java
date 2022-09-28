package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokens = new StringTokenizer(br.readLine());

        int[] nums = new int[N];

        int idx = 0;
        while (tokens.hasMoreTokens()) {
            nums[idx++] = Integer.parseInt(tokens.nextToken());
        }

        int[] dp = new int[N + 1];
        dp[0] = nums[0];
        int maxNum = nums[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            maxNum = Math.max(maxNum, dp[i]);
        }

        System.out.println(maxNum);
    }

}
