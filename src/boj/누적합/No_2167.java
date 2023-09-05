package boj.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2167 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        int N = Integer.parseInt(nAndM[0]);
        int M = Integer.parseInt(nAndM[1]);

        int[][] arr = new int[N][M];
        StringTokenizer tokens;

        for (int i = 0; i < N; i++) {
            tokens = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }

        int[][] cumulativeSums = new int[N][M];
        cumulativeSums[0][0] = arr[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i > 0 && j > 0) {
                    cumulativeSums[i][j] = (cumulativeSums[i - 1][j] + cumulativeSums[i][j - 1])
                        - cumulativeSums[i - 1][j - 1] + arr[i][j];
                } else if (i > 0) {
                    cumulativeSums[i][j] = cumulativeSums[i - 1][j] + arr[i][j];
                } else if (j > 0){
                    cumulativeSums[i][j] = cumulativeSums[i][j - 1] + arr[i][j];
                } else {
                    // cumulativeSums[0][0]
                }
            }
        }

        int K = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < K; i++) {
            tokens = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(tokens.nextToken()) - 1;
            int second = Integer.parseInt(tokens.nextToken()) - 1;
            int third = Integer.parseInt(tokens.nextToken()) - 1;
            int fourth = Integer.parseInt(tokens.nextToken()) - 1;

            int answer = Integer.MIN_VALUE;
            if (first == third && second == fourth) {
                answer = arr[third][fourth];
            } else if (first == 0 && second == 0) {
                answer = cumulativeSums[third][fourth];
            } else if (first == 0) {
                answer = cumulativeSums[third][fourth] - cumulativeSums[third][second - 1];
            } else if (second == 0) {
                answer = cumulativeSums[third][fourth] - cumulativeSums[first - 1][fourth];
            } else {
                answer = cumulativeSums[third][fourth] - (cumulativeSums[first - 1][fourth]
                    + cumulativeSums[third][second - 1]) + cumulativeSums[first - 1][second - 1];
            }

            stringBuilder.append(answer).append("\n");
        }

        System.out.println(stringBuilder);

        //1 1 1 1
        //1 1 1 1
        //1 1 1 1
        //1 1 1 1

        //1 2 3 4
        //2 4 6 8
        //3 6 9 12
        //4 8 12 16

    }

}
