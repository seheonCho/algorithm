package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No_15664 {

    private static int N;
    private static int M;
    private static int[] INPUTS;
    private static int[] ARR;
    private static Set<String> USED_ARR;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        INPUTS = new int[N];
        ARR = new int[M];
        USED_ARR = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int token = Integer.parseInt(st.nextToken());
            INPUTS[i] = token;
        }

        Arrays.sort(INPUTS);

        dfs(0, 0);

        for (String partOfUsedArr : USED_ARR) {
            System.out.println(partOfUsedArr);
        }
    }

    private static void dfs(int start, int depth) {
        if (M == depth) {
            StringBuilder sb = new StringBuilder();
            for (int num : ARR) {
                sb.append(num).append(" ");
            }
            USED_ARR.add(sb.toString());
            return;
        }

        for (int i =
            start; i < N; i++) {
            ARR[depth] = INPUTS[i];
            dfs(i + 1, depth + 1);
        }
    }

}
