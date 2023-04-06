package prgrms.level1.연습문제;

import java.util.Map;
import java.util.HashMap;

public class 가장_가까운_같은_글자 {

    private final Map<Character, Integer> map = new HashMap<>();
    private static final int NOT_EXIST = -1;
    private static final int GAP = 1;

    public int[] solution(String s) {
        int inputLength = s.length();
        int[] answer = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            char aChar = s.charAt(i);

            if (map.containsKey(aChar)) {
                int beforeIndex = map.get(aChar);
                int gapOfBefore = i - beforeIndex;
                answer[i] = gapOfBefore;
            } else {
                answer[i] = NOT_EXIST;
            }

            map.put(aChar, i);
        }

        return answer;
    }

}
