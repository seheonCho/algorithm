package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2644 {

    static int N;
    static int X;
    static int Y;
    static int M;
    static boolean[][] GRAPH;
    static boolean[] isVisits;
    static int CHONSU = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] peoples = br.readLine().split(" ");
        X = Integer.parseInt(peoples[0]);
        Y = Integer.parseInt(peoples[1]);
        M = Integer.parseInt(br.readLine());
        GRAPH = new boolean[N + 1][N + 1];
        isVisits = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int left = Integer.parseInt(line[0]);
            int right = Integer.parseInt(line[1]);
            GRAPH[left][right] = true;
            GRAPH[right][left] = true;
        }

        dfs(X, 0);

        if (CHONSU == 0) {
            System.out.println(-1);
        } else {
            System.out.println(CHONSU);
        }

    }

    private static void dfs(int now, int depth) {
        if (now == Y) {
            CHONSU = depth;
        }

        for (int i = 1; i <= N; i++) {
            if (!isVisits[i] && (GRAPH[now][i])) {
                isVisits[i] = true;
                dfs(i, depth + 1);
            }
        }

    }

}
