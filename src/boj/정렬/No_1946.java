package boj.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_1946 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < tc; i++) {

            int recruitCount = Integer.parseInt(br.readLine());
            Score[] scores = new Score[recruitCount];
            int count = 1;

            for (int j = 0; j < recruitCount; j++) {
                String[] recruitScores = br.readLine().split(" ");
                scores[j] = new Score(Integer.parseInt(recruitScores[0]),
                    Integer.parseInt(recruitScores[1]));
            }

            Arrays.sort(scores);

            Score standard = scores[0];
            for (int j = 1; j < recruitCount; j++) {
                if (standard.getMeet() >= scores[j].getMeet()) {
                    standard = scores[j];
                    count++;
                }
            }

            stringBuilder.append(count).append("\n");
        }

        System.out.println(stringBuilder);
    }

    static class Score implements Comparable<Score> {

        private int paper;
        private int meet;

        public Score(int paper, int meet) {
            this.paper = paper;
            this.meet = meet;
        }

        public int getPaper() {
            return paper;
        }

        public int getMeet() {
            return meet;
        }

        @Override
        public int compareTo(Score o) {
            return this.paper - o.getPaper();
        }
    }

}
