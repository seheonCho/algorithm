package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No_2667 {

    private static boolean[][] IS_APART;
    private static boolean[][] IS_VISIT;
    private static List<Integer> RESULTS;
    private static Queue<Pair> QUEUE = new LinkedList<>();
    private static final int[] DX = {-1, 1, 0, 0};
    private static final int[] DY = {0, 0, -1, 1};
    private static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        IS_APART = new boolean[N][N];
        IS_VISIT = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (isApart(str.charAt(j))) {
                    IS_APART[i][j] = true;
                }
            }
        }
        int areaCount = 0;
        RESULTS = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (IS_APART[i][j] && !IS_VISIT[i][j]) {
                    areaCount++;
                    bfs(i, j);
                }
            }
        }

        System.out.println(areaCount);
        Collections.sort(RESULTS);
        RESULTS.forEach(System.out::println);
    }

    private static boolean isApart(char charAt) {
        return charAt == '1';
    }

    static void bfs(int x, int y) {
        int apartAreaSize = 0;
        QUEUE.add(new Pair(x, y));
        IS_VISIT[x][y] = true;

        while (!QUEUE.isEmpty()) {
            Pair pair = QUEUE.poll();
            apartAreaSize++;
            for (int i = 0; i < 4; i++) {
                int nextX = pair.getX() + DX[i];
                int nextY = pair.getY() + DY[i];
                if (nextX < N && nextY < N && nextX >= 0 && nextY >= 0) {
                    if (!IS_VISIT[nextX][nextY] && IS_APART[nextX][nextY]) {
                        IS_VISIT[nextX][nextY] = true;
                        QUEUE.add(new Pair(nextX, nextY));
                    }
                }
            }
        }

        RESULTS.add(apartAreaSize);
    }

}

class Pair {

    private final int x;
    private final int y;

    Pair(int x, int y) {
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
