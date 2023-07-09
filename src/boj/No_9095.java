package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_9095 {

    //1 = 1(1)
    //2 = 2(1+1, 2)
    //3 = 4(1+1+1, 1+2, 2+1, 3)
    //4 = 7(1+1+1+1, 1+1+2, 1+2+1, 1+3,
    //      2+1+1, 2+2,
    //      3+1)
    //5 = 13(1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+1+3, 1+2+1+1, 1+2+2, 1+3+1
    //       2+1+1+1, 2+1+2, 2+2+1, 2+3
    //       3+1+1, 3+2)
    //6 = 24(1+1+1+1+1+1, 1+1+1+1+2, 1+1+1+2+1, 1+1+1+3, 1+1+2+1+1, 1+1+2+2, 1+1+3+1,
    //       1+2+1+1+1, 1+2+1+2, 1+2+2+1, 1+2+3, 1+3+1+1, 1+3+2,
    //       2+1+1+1+1, 2+1+1+2, 2+1+2+1, 2+1+3, 2+2+1+1, 2+2+2, 2+3+1,
    //       3+1+1+1, 3+1+2, 3+2+1, 3+3)

    public static void main(String[] args) throws IOException {
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }

    }

}
