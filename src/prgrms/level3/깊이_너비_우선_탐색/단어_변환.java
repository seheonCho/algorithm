package prgrms.level3.깊이_너비_우선_탐색;

public class 단어_변환 {

    private static final int IMPOSSIBLE_TRANSFER_VALUE = 0;
    private static final int POSSIBLE_TRANSFER_COUNT = 1;
    private static int ANSWER = 0;
    private static boolean[] IS_VISIT;

    public int solution(String begin, String target, String[] words) {

        int equalCount = 0;
        for (String word : words) {
            if (word.equals(target)) {
                equalCount++;
            }
        }

        IS_VISIT = new boolean[words.length];

        if (equalCount == IMPOSSIBLE_TRANSFER_VALUE) {
            return IMPOSSIBLE_TRANSFER_VALUE;
        }

        dfs(begin, target, words, 0);

        return ANSWER;
    }

    private void dfs(String now, String target, String[] words, int depth) {
        if (now.equals(target)) {
            ANSWER = depth;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (isOneDigitDifferent(now, words[i]) && !IS_VISIT[i]) {
                IS_VISIT[i] = true;
                dfs(words[i], target, words, depth + 1);
                IS_VISIT[i] = false;
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

}
