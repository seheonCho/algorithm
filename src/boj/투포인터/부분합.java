package boj.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 부분합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokens.nextToken());
        int S = Integer.parseInt(tokens.nextToken());

        tokens = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        int idx = 0;
        while (tokens.hasMoreTokens()) {
            nums[idx] = Integer.parseInt(tokens.nextToken());
            idx++;
        }

        int i = 0;
        int ed = 0;
        int min = 100_000_001;
        int sum = 0;

        while (true) {
            if (sum >= S) {
                sum -= nums[i];
                min = Math.min(ed - i, min);
                i++;
            } else if (ed == N) {
                break;
            } else {
                sum += nums[ed];
                ed++;
            }
        }

        if (min == 100_000_001) System.out.println(0);
        else System.out.println(min);

    }

}
