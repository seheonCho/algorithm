package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_11123 {

    private static int H;
    private static int W;
    private static String[][] map;
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static final String COMMA = ".";
    private static final String SHEEP = "#";
    private static boolean[][] isVisits;
    private static int sheepSpotCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            H = Integer.parseInt(input[0]);
            W = Integer.parseInt(input[1]);
            map = new String[H][W];
            isVisits = new boolean[H][W];

            for (int j = 0; j < H; j++) {
                String[] line = br.readLine().split("");
                for (int k = 0; k < W; k++) {
                    String s = line[k];
                    map[j][k] = s;
                }
            }

            int realCount = 0;
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    dfs(j, k);
                    if (sheepSpotCount > 0) {
                        realCount++;
                        sheepSpotCount = 0;
                    }
                }
            }

            sb.append(realCount).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int y, int x) {
        if (isValid(y, x)) {
            isVisits[y][x] = true;
            sheepSpotCount++;

            for (int i = 0; i < dx.length; i++) {
                dfs(y + dy[i], x + dx[i]);
            }
        }
    }

    private static boolean isValid(int y, int x) {
        return y >= 0 && x >= 0 && y < H && x < W && !isVisits[y][x] && map[y][x].equals(SHEEP);
    }

    private static void bfs(int height, int width) {
        Queue<SheepSpot> sheepSpots = new LinkedList<>();
        sheepSpots.add(new SheepSpot(height, width));

        while (!sheepSpots.isEmpty()) {
            SheepSpot poll = sheepSpots.poll();

            int pollH = poll.h;
            int pollW = poll.w;

            if (pollH < 0 || pollW < 0 || pollH >= H || pollW >= W) {
                continue;
            }

            if (isVisits[pollH][pollW] || map[pollH][pollW].equals(COMMA)) {
                continue;
            }

            isVisits[pollH][pollW] = true;
            sheepSpotCount++;

            for (int i = 0; i < 4; i++) {
                int nextH = pollH + dx[i];
                int nextW = pollW + dy[i];

                sheepSpots.add(new SheepSpot(nextH, nextW));
            }

        }
    }

    static class SheepSpot {
        int h;
        int w;

        public SheepSpot(int h, int w) {
            this.h = h;
            this.w = w;
        }
    }

}
