package prgrms.level1.연습문제;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {

    public long solution(long n) {
        String[] inputArr = String.valueOf(n).split("");
        Arrays.parallelSort(inputArr, Collections.reverseOrder());

        String reverseInput = "";
        for (String txt : inputArr) reverseInput = reverseInput + txt;

        return Long.parseLong(reverseInput);
    }

}
