package boj.브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 덩치 {

    final static int SIZE_LENGTH = 2;
    static int bodyLength = 0;
    static int[] award = null;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bodyLength = Integer.parseInt(br.readLine());
        award = new int[bodyLength];

        int[][] bodyArr = new int[bodyLength][SIZE_LENGTH];

        for (int i=0; i<bodyLength; i++) {

            String[] size = br.readLine().split(" ");

            for (int j = 0; j< SIZE_LENGTH; j++) {
                bodyArr[i][j] = Integer.parseInt(size[j]);
                bodyArr[i][j] = Integer.parseInt(size[j]);
            }

        }
        br.close();

        award = comparison(bodyArr);

        for (int output : award) {
            bw.write(output + " ");
        }

        bw.flush();
        bw.close();

    }


    public static int[] comparison(int[][] intArr) {

        int[] rnk = new int[bodyLength];

        // 둘다 큰게있으면 rnk += 1 아니면 그대로.
        for (int i=0; i<bodyLength; i++) {

            int cnt = 0; // 몸무게, 키 중 i가 j보다 더 큰 갯수
            int num = 1; // intArr 1차원배열 중 더 큰 갯수

            for (int j=0; j<bodyLength; j++) {

                if(i == j) { continue; }

                if (intArr[i][0] < intArr[j][0]
                        && intArr[i][1] < intArr[j][1]) {

                    num++;
                }

            }

            rnk[i] = num;
        }

        return rnk;
    }
}