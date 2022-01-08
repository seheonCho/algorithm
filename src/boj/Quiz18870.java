package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quiz18870 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        String[] input = bufferedReader.readLine().split(" ");
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        bufferedReader.close();

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;

        for (int num : sortedNums) {
            if (!map.containsKey(num))
                map.put(num, idx++);
        }

        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(map.get(num)).append(' ');
        }

        System.out.println(sb.toString());


    }
}