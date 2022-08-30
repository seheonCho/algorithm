package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {

    static int[][] GRAPH;
    static final String ZERO = "0";
    static final int NUM_ZERO = 0;
    static final int NUM_ONE = 1;
    static int[][] FINISH;
    static int M;
    static int N;
    static final int[] DX = {-1, 1, 0, 0};
    static final int[] DY = {0, 0, -1, 1};
    static int FINISH_COUNT = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        GRAPH = new int[N][M];
        FINISH = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                String token = st.nextToken();
                if (token.equals(ZERO)) {
                    continue;
                }

                int tomatoStatus = Integer.parseInt(token);
                GRAPH[i][j] = tomatoStatus;

                if (tomatoStatus == 1) {
                    FINISH_COUNT++;
                }

            }
        }

        bfs();

    }

    private static void bfs() {

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {
                if (GRAPH[i][j] == NUM_ONE) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] nextPoint = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = nextPoint[0] + DX[i];
                int nextY = nextPoint[1] + DY[i];

                // 바깥공간 패스. 범위 연산 및 선정에 주의할것
                if (nextX < NUM_ZERO || nextX >= N || nextY < NUM_ZERO || nextY >= M) {
                    continue;
                }

                // 다음 위치가 익지 않은 토마토면 패스
                if (GRAPH[nextX][nextY] != NUM_ZERO) {
                    continue;
                }

                GRAPH[nextX][nextY] = GRAPH[nextPoint[0]][nextPoint[1]] + 1;
                queue.add(new int[]{nextX, nextY});

            }

        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 탐색 종료되었는데, 안익은게 존재하면 -1 출력
                if (GRAPH[i][j] == NUM_ZERO) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, GRAPH[i][j]);
            }
        }

        System.out.println(max - 1);

    }

}
