package boj.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;
        while (true) {
            int bottle = N + answer;
            int count = 0;

            while (bottle > 0) {
                if (bottle % 2 != 0) {
                    count++;
                }
                bottle /= 2;
            }

            if (count <= K) {
                break;
            }

            answer++;
        }

        System.out.println(answer);
    }
}
