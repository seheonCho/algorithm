package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No_15657 {

    private static int N;
    private static int M;
    private static int[] INPUTS;
    private static int[] ARR;
    private static Set<String> ANSWERS;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        INPUTS = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            INPUTS[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(INPUTS);
        ARR = new int[M];

        ANSWERS = new LinkedHashSet<>();
        dfs(0, 0);

        for (String answer : ANSWERS) {
            System.out.println(answer);
        }
    }

    private static void dfs(int start, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(ARR[i]).append(" ");
            }
            ANSWERS.add(sb.toString());
            return;
        }

        for (int i = start; i < N; i++) {
            ARR[depth] = INPUTS[i];
            dfs(i, depth + 1);
        }
    }

}
