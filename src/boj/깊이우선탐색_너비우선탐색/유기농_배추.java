package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 유기농_배추 {

    static int T;
    static int M;
    static int N;
    static int K;
    static boolean[][] CABBAGE;
    static boolean[][] VISITED;
    static int COUNT;

    static class Pair {
        int Y;
        int X;

        public Pair(int y, int x) {
            Y = y;
            X = x;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "X=" + X +
                    ", Y=" + Y +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            CABBAGE = new boolean[N][M];
            VISITED = new boolean[N][M];
            COUNT = 0;

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                CABBAGE[Y][X] = true;
            }

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < M; j++) {

                    if (CABBAGE[i][j] && !VISITED[i][j]) {
                        bfs(i, j);
                        COUNT++;
                    }

                }

            }
            System.out.println(COUNT);
        }

    }

    private static void bfs(int height, int width) {

        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int dLength = 4;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(height, width));
        VISITED[height][width] = true;

        while (!queue.isEmpty()) {

            Pair nextPair = queue.poll();

            for (int i = 0; i < dLength; i++) {

                int nextX = nextPair.X + dx[i];
                int nextY = nextPair.Y + dy[i];

                if (nextX >= M || nextX < 0 || nextY >= N || nextY < 0) {
                    continue;
                }

                if (CABBAGE[nextY][nextX] && !VISITED[nextY][nextX]) {

                    Pair ppp = new Pair(nextY, nextX);
                    queue.add(ppp);
                    VISITED[nextY][nextX] = true;
                }

            }

        }

    }

}
