package prgrms.level1.연습문제;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class 문자열_내_마음대로_정렬하기 {

    public String[] solution(String[] strings, int n) {

        List<String> stringList = new LinkedList<>();

        for (String str : strings) {
            stringList.add(str.charAt(n) + str);
        }

        Collections.sort(stringList);
        String[] answer = new String[strings.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stringList.get(i).substring(1);
        }

        return answer;
    }

}
