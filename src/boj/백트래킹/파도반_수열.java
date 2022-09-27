package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반_수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        long[] DP;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TC; i++) {
            int N = Integer.parseInt(br.readLine());
            DP = new long[101];

            DP[1] = 1;
            DP[2] = 1;
            DP[3] = 1;
            DP[4] = 2;
            DP[5] = 2;

            if (Math.max(5, N) == N) {

                for (int j = 6; j <= N; j++) {
                    if (DP[j] == 0) {
                        DP[j] = DP[j - 1] + DP[j - 5];
                    }
                }

            }

            sb.append(DP[N] + "\n");

        }

        System.out.println(sb);

    }

}
