package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_15655 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();
    private static int[] inputs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        inputs = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputs);

        dfs(0, 0);
        System.out.println(sb);
    }

    private static void dfs(int num, int depth) {
        if (depth == M) {
            for (int aNum : arr) {
                sb.append(aNum).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = num; i < N; i++) {
            arr[depth] = inputs[i];
            dfs(i + 1, depth + 1);
        }
    }


}
