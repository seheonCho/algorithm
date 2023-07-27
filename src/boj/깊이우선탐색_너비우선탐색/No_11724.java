package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11724 {

    static int N;
    static int M;
    static boolean[][] map;
    static boolean[] isVisits;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new boolean[N + 1][N + 1];
        isVisits = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int first = Integer.parseInt(line[0]);
            int second = Integer.parseInt(line[1]);
            map[first][second] = true;
            map[second][first] = true;
        }

        int allCount = 0;
        for (int i = 1; i <= N; i++) {
            dfs(i);
            if (count > 0) {
                allCount++;
                count = 0;
            }
        }

        System.out.println(allCount);
    }

    private static void dfs(int num) {
        if (!isVisits[num]) {
            isVisits[num] = true;
            count++;

            for (int i = 1; i <= N; i++) {
                if (map[num][i] && !isVisits[i]) {
                    dfs(i);
                }
            }
        }
    }

}
