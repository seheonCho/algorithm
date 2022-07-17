package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로_탐색 {

    static int[][] maze;
    static int[][] distances;
    static int endX;
    static int endY;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        endX = N;
        endY = M;
        maze = new int[N][M];
        distances = new int[N][M];
        Queue<PointPair> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {

            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                maze[i][j] = Character.getNumericValue(line.charAt(j));
                distances[i][j] = -1; //방문여부 및 시작점과의 거리 체크용
            }

        }

        // 시작점 큐에 넣기, 시작점 거리 계산
        queue.offer(new PointPair(0, 0));
        distances[0][0] = 0;

        // 이동 할 곳이 존재하면 반복.
        while (!queue.isEmpty()) {
            PointPair pointPair = queue.poll();

            // 동서남북 한번씩 확인해서 4번 반복.
            for (int i = 0; i < 4; i++) {
                int pointX = pointPair.getPointX() + dx[i];
                int pointY = pointPair.getPointY() + dy[i];

                // 동서남북 확인 중, 미로를 벗어나는 경우 해당 방위로 이동 금지
                if (pointX < 0 || pointX >= endX || pointY < 0 || pointY >= endY) {
                    continue;
                }

                // 동서남북 확인중 벽이거나, 방문을 한 곳이라면 이동 금지
                if (maze[pointX][pointY] == 0 || distances[pointX][pointY] != -1) {
                    continue;
                }

                // 큐에 이동 좌표 넣기
                queue.add(new PointPair(pointX, pointY));
                // 한칸 이동했으니 이전 포인트의
                distances[pointX][pointY] = distances[pointPair.getPointX()][pointPair.getPointY()] + 1;

            }
        }

        System.out.println(distances[endX - 1][endY - 1] + 1);

    }

    private static class PointPair {
        int pointX;
        int pointY;

        public PointPair(int pointX, int pointY) {
            this.pointX = pointX;
            this.pointY = pointY;
        }

        public int getPointX() {
            return pointX;
        }

        public int getPointY() {
            return pointY;
        }

    }
}
