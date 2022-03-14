package boj.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int[] times = new int[N];

        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(times);

        int sumTime = 0;
        for (int i = 0; i < N; i++) {

            for (int j = 0; i >= j; j++) {
                sumTime += times[j];
            }

        }

        System.out.println(sumTime);

    }

}
