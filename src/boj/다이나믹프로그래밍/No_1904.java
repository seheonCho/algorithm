package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N + 1];

        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i <= N; i++) {
            nums[i] = (nums[i - 2] + nums[i - 1]) % 15746;
        }

        System.out.println(nums[N]);

    }

}
