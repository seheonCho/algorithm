package boj.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N번째_큰_수 {

    static final int ARR_SIZE = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int[] nums = new int[ARR_SIZE];

            for (int j = 0; j < ARR_SIZE; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);
            bw.append(nums[7] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
