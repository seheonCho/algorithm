package boj.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판_다시_칠하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minDifferentCount = 64;

        for (int i = 0; i <= N - 8; i++) {


            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                char firstColor = board[i][j];

                for (int k = i; k < i + 8; k++) {

                    for (int m = j; m < j + 8; m++) {
                        if ((k + m) % 2 == 0 && board[k][m] != firstColor) {
                            count++;
                        } else if ((k + m) % 2 != 0 && board[k][m] == firstColor) {
                            count++;
                        }
                    }

                }

                count = Math.min(count, 64 - count);
                minDifferentCount = Math.min(minDifferentCount, count);
            }

        }

        System.out.println(minDifferentCount);

    }

}
