package prgrms.level2.summer_winter;

import java.util.Set;
import java.util.HashSet;

public class 영어_끝말잇기 {

    public int[] solution(int n, String[] words) {

        int[] answer = new int[]{0, 0};
        Set<String> usedWords = new HashSet<>();

        char beforeCh = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            int wordLen = word.length();
            char nowCh = word.charAt(0);

            if (usedWords.contains(word) || beforeCh != nowCh) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            usedWords.add(word);
            beforeCh = word.charAt(wordLen - 1);

        }

        return answer;
    }

}
