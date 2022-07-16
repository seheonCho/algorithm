package boj.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 블로그 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] xn = br.readLine().split(" ");
        int N = Integer.parseInt(xn[0]);
        int X = Integer.parseInt(xn[1]);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] visitors = new int[N];

        int idx = -1;
        while (st.hasMoreTokens()) {
            int token = Integer.parseInt(st.nextToken());
            visitors[++idx] = token;
        }

        int sum = 0;
        int end = 0;
        int max = 0;
        int maxCount = 0;

        for (int i = 0; i < N - X + 1; i++) {

            while (end - i < X && end < N) {
                // end - i => X만큼 반복을 위한 방법
                // end < N => OutOfIndex 방지
                sum += visitors[end];
                end++;
            }

            if (sum > max) {
                max = sum;
                maxCount = 1;
            } else if (sum == max) {
                maxCount++;
            }

            sum -= visitors[i];

        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(maxCount);
        }


    }

}
