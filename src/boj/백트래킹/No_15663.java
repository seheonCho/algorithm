package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No_15663 {

    private static int N;
    private static int M;
    private static int[] INPUTS;
    private static int[] ARR;
    private static boolean[] IS_VISIT;
    private static Set<String> USED_ARR;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        INPUTS = new int[N];
        ARR = new int[M];
        IS_VISIT = new boolean[N];
        USED_ARR = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int token = Integer.parseInt(st.nextToken());
            INPUTS[i] = token;
        }

        Arrays.sort(INPUTS);

        dfs(0);
        for (String arr : USED_ARR) {
            System.out.println(arr);
        }
    }

    private static void dfs(int depth) {
        if (depth == M) {
            StringBuilder partOfOutput = new StringBuilder();
            for (int i = 0; i < M; i++) {
                partOfOutput.append(ARR[i]).append(" ");
            }
            USED_ARR.add(partOfOutput.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (IS_VISIT[i]) {
                continue;
            }

            IS_VISIT[i] = true;
            ARR[depth] = INPUTS[i];
            dfs(depth + 1);
            IS_VISIT[i] = false;
        }
    }

}
