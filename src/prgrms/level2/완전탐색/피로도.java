package prgrms.level2.완전탐색;

public class 피로도 {

    private int answer;
    private boolean[] isVisit;
    private int dungeonLength;

    public int solution(int k, int[][] dungeons) {
        dungeonLength = dungeons.length;
        isVisit = new boolean[dungeonLength];
        dfs(k, dungeons, 0);

        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int depth) {
        for (int i = 0; i < dungeonLength; i++) {
            int requestFatigue = dungeons[i][0];
            int consumeFatigue = dungeons[i][1];

            if (requestFatigue <= fatigue && !isVisit[i]) {
                isVisit[i] = true;
                dfs(fatigue - consumeFatigue, dungeons, depth + 1);
                isVisit[i] = false;
            }
        }

        answer = Math.max(depth, answer);

    }

}
