package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No_1182 {
    private static int N;
    private static int COUNT = 0;
    private static int S;
    private static List<Integer> NUMBERS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = br.readLine().split(" ");
        N = Integer.parseInt(firstInput[0]);
        S = Integer.parseInt(firstInput[1]);

        StringTokenizer tokens = new StringTokenizer(br.readLine());

        while (tokens.asIterator().hasNext()) {
            String token = tokens.nextToken();
            NUMBERS.add(Integer.parseInt(token));
        }

        dfs(0, 0);

        if (S == 0) {
            System.out.println(COUNT - 1);
        } else {
            System.out.println(COUNT);
        }
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) {
                COUNT++;
            }
            return;
        }
        int nextDepth = depth + 1;
        dfs(nextDepth, sum + NUMBERS.get(depth));
        dfs(nextDepth, sum);
    }

}
