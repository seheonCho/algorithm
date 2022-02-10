package prgrms.level1.연습문제;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

    public String solution(String s) {

        String answer = "";

        Character[] chars = new Character[s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, Collections.reverseOrder());

        for (int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }

        return answer;
    }

}
