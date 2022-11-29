package prgrms.level2.깊이_너비_우선_탐색;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {

    private int[][] isVisit;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {

        int mapWidth = maps[0].length;
        int mapHeight = maps.length;
        isVisit = new int[mapHeight][mapWidth];

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        isVisit[0][0] = 1;

        while (!queue.isEmpty()) {
            Pair aPair = queue.poll();
            int currentX = aPair.getX();
            int currentY = aPair.getY();

            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + currentX;
                int nextY = dy[i] + currentY;

                //다음 예상 이동 경로가 맵 외부로 나가지 못하게 검증
                if (nextX < 0 || nextX >= mapWidth || nextY < 0 || nextY >= mapHeight) {
                    continue;
                }

                //길인지 체크 && 방문안했던 곳인지 체크
                if (maps[nextY][nextX] == 1 && isVisit[nextY][nextX] == 0) {
                    queue.add(new Pair(nextX, nextY));
                    isVisit[nextY][nextX] = isVisit[currentY][currentX] + 1;
                }
            }

        }

        int answer = isVisit[mapHeight - 1][mapWidth - 1];

        if (answer == 0) {
            return -1;
        }

        return answer;
    }

    class Pair {

        private final int x;
        private final int y;

        public Pair(int x, int y) {
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
