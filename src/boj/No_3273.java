package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[N];
        int idx = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            nums[idx] = num;
            idx++;
        }

        Arrays.sort(nums);
        int X = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 0;
        int end = N - 1;

        while (start != end) {
            int endNum = nums[end];
            int stNum = nums[start];
            if (endNum > X) {
                end--;
                continue;
            }

            if (X == stNum + endNum) {
                count++;
                start++;
            } else if (X >= stNum + endNum) {
                start++;
            } else {
                end--;
            }

        }

        System.out.println(count);

    }
}
