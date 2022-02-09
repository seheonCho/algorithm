package prgrms.level1.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {

    static int firstPlayerScore = 0;
    static int[] firstPlayerPicks = new int[]{1, 2, 3, 4, 5};
    static int firstPlayerPickLength = firstPlayerPicks.length;

    static int secondPlayerScore = 0;
    static int[] secondPlayerPicks = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    static int secondPlayerPickLength = secondPlayerPicks.length;

    static int thirdPlayerScore = 0;
    static int[] thirdPlayerPicks = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    static int thirdPlayerPickLength = thirdPlayerPicks.length;

    List<Integer> SCORE_LIST;
    int MAX_SCORE;

    public int[] solution(int[] answers) {

        int[] answer = {};

        int answersLength = answers.length;

        for (int i = 0; i < answersLength; i++) {

            if (answers[i] == firstPlayerPicks[i % firstPlayerPickLength]) {
                firstPlayerScore++;
            }

            if (answers[i] == secondPlayerPicks[i % secondPlayerPickLength]) {
                secondPlayerScore++;
            }

            if (answers[i] == thirdPlayerPicks[i % thirdPlayerPickLength]) {
                thirdPlayerScore++;
            }

        }

        MAX_SCORE = getMaxScore();
        List<Integer> highScorePlayers = new ArrayList<>();

        if (firstPlayerScore == MAX_SCORE) {
            highScorePlayers.add(1);
        }
        if (secondPlayerScore == MAX_SCORE) {
            highScorePlayers.add(2);

        }
        if (thirdPlayerScore == MAX_SCORE) {
            highScorePlayers.add(3);
        }

        answer = new int[highScorePlayers.size()];
        for (int i = 0; i < highScorePlayers.size(); i++) {
            answer[i] = highScorePlayers.get(i);
        }

        return answer;
    }


    private int getMaxScore() {

        SCORE_LIST = new ArrayList<>();
        SCORE_LIST.add(firstPlayerScore);
        SCORE_LIST.add(secondPlayerScore);
        SCORE_LIST.add(thirdPlayerScore);

        int maxScore = SCORE_LIST.get(0);

        for (int i = 0; i < SCORE_LIST.size(); i++) {
            if (SCORE_LIST.get(i) > maxScore) {
                maxScore = SCORE_LIST.get(i);
            }
        }

        return maxScore;

    }


}
