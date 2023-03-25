package prgrms.level3.깊이_너비_우선_탐색;

import java.util.LinkedList;
import java.util.Queue;

public class 단어_변환_BFS {

    private static final int IMPOSSIBLE_TRANSFER_VALUE = 0;
    private static final int POSSIBLE_TRANSFER_COUNT = 1;
    private int ANSWER = 0;
    private int[] IS_VISIT;

    public int solution(String begin, String target, String[] words) {

        int equalCount = 0;
        for (String word : words) {
            if (word.equals(target)) {
                equalCount++;
            }
        }

        IS_VISIT = new int[words.length];

        if (equalCount == IMPOSSIBLE_TRANSFER_VALUE) {
            return IMPOSSIBLE_TRANSFER_VALUE;
        }

        bfs(begin, target, words);

        return ANSWER;
    }

    private void bfs(String now, String target, String[] words) {

        Queue<WordData> queue = new LinkedList<>();
        queue.add(new WordData(now, 0));

        while (!queue.isEmpty()) {
            WordData poll = queue.poll();

            if (poll.getWord().equals(target)) {
                ANSWER = poll.getIndex();
                break;
            }

            for (int i = 0; i < words.length; i++) {
                if (isOneDigitDifferent(poll.getWord(), words[i]) && IS_VISIT[i] == 0) {
                    IS_VISIT[i] = poll.getIndex() + 1;
                    queue.add(new WordData(words[i], poll.getIndex() + 1));
                }
            }
        }


    }

    private boolean isOneDigitDifferent(String begin, String word) {
        int wordLength = begin.length();
        int differentCount = 0;

        for (int i = 0; i < wordLength; i++) {
            char beginDigit = begin.charAt(i);
            char wordDigit = word.charAt(i);
            if (beginDigit != wordDigit) {
                differentCount++;
            }
        }

        if (differentCount == POSSIBLE_TRANSFER_COUNT) {
            return true;
        }

        return false;
    }

    private class WordData {

        private final String word;
        private final int index;

        public WordData(String word, int index) {
            this.word = word;
            this.index = index;
        }

        public String getWord() {
            return word;
        }

        public int getIndex() {
            return index;
        }

    }

}
