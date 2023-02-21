package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_1926 {

    public static final String PICTURE = "1";
    private static boolean[][] IS_VISIT;
    private static boolean[][] MAPS;
    private static int N;
    private static int M;
    private static List<Integer> PICTURE_SIZES = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = br.readLine().split(" ");
        N = Integer.parseInt(nAndM[0]);
        M = Integer.parseInt(nAndM[1]);

        StringTokenizer tokens;
        MAPS = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            tokens = new StringTokenizer(br.readLine(), " ");
            int index = 0;
            while (tokens.hasMoreTokens()) {
                String token = tokens.nextToken();
                if (token.equals(PICTURE)) {
                    MAPS[i][index] = true;
                }
                index++;
            }
        }

        IS_VISIT = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                if (!IS_VISIT[i][k] && MAPS[i][k]) {
                    bfs(i, k);
                }
            }
        }

        // 하나도 없을때 필요한 0사이즈 추가
        PICTURE_SIZES.add(0);
        System.out.println(PICTURE_SIZES.size() - 1);
        Collections.sort(PICTURE_SIZES);
        System.out.println(PICTURE_SIZES.get(PICTURE_SIZES.size() - 1));

    }

    private static final int[] DY = {1, 0, -1, 0};
    private static final int[] DX = {0, 1, 0, -1};

    private static void bfs(int y, int x) {

        Queue<Pair> pairs = new ArrayDeque<>();
        pairs.add(new Pair(x, y));
        IS_VISIT[y][x] = true;
        int pictureSize = 1;

        while (!pairs.isEmpty()) {

            Pair nextPair = pairs.poll();

            for (int i = 0; i < DY.length; i++) {
                int nextY = nextPair.getY() + DY[i];
                int nextX = nextPair.getX() + DX[i];

                if (nextY < 0 || nextY >= N || nextX < 0 || nextX >= M) {
                    continue;
                }

                if (!MAPS[nextY][nextX] || IS_VISIT[nextY][nextX]) {
                    continue;
                }

                Pair pair = new Pair(nextX, nextY);
                pairs.add(pair);
                IS_VISIT[nextY][nextX] = true;
                pictureSize++;
            }

        }

        PICTURE_SIZES.add(pictureSize);

    }

    private static class Pair {
        private int x;
        private int y;

        public Pair(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }
}
