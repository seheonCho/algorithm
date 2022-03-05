package prgrms.level1.연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> maximumNums = new ArrayList<>();

        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                maximumNums.add(arr[i]);
            }
        }

        if (maximumNums.isEmpty()) {
            maximumNums.add(-1);
        }

        answer = new int[maximumNums.size()];

        for (int i = 0; i < maximumNums.size(); i++) {
            answer[i] = maximumNums.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

}
