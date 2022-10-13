package boj.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N + 1];

        int idx = 0;
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
            nums[idx] = sum;
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            int amount = nums[second - 1];
            if (first != 1) amount -= nums[first - 2];

            sb.append(amount + "\n");

        }
        System.out.println(sb);

    }

}
