package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
        }

        for (int i = 0; i < N; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                nums[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }


        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num + " ");
        }

        System.out.println(sb);

    }

}
