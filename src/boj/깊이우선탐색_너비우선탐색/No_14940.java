package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No_14940 {

    private final static int[] DX = {1, 0, -1, 0};
    private final static int[] DY = {0, -1, 0, 1};
    private static int[][] map;
    private static int[][] distance;
    private static int m;
    private static int n;
    private static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        boolean isStartChecked = false;
        String[] size = reader.readLine().split(" ");
        n = Integer.parseInt(size[0]);
        m = Integer.parseInt(size[1]);
        int startX = -1, startY = -1;

        map = new int[n][m];
        distance = new int[n][m];
        isVisited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (!isStartChecked)
                for (int j = 0; j < m; j++)
                    if (map[i][j] == 2) {
                        isStartChecked = true;
                        startX = i;
                        startY = j;
                        break;
                    }
        }

        bfs(startX, startY);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if (!isVisited[i][j] && map[i][j] == 1)
                    builder.append(-1 + " ");
                else
                    builder.append(distance[i][j] + " ");
            builder.append("\n");
        }

        System.out.println(builder);
    }

    private static void bfs(int x, int y) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        isVisited[x][y] = true;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = current.x + DX[i];
                int nextY = current.y + DY[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
                if (map[nextX][nextY] == 0) continue;
                if (isVisited[nextX][nextY]) continue;

                queue.add(new Pair(nextX, nextY));
                distance[nextX][nextY] = distance[current.x][current.y] + 1;
                isVisited[nextX][nextY] = true;
            }
        }
    }


    static class Pair {
        public int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
