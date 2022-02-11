package prgrms.level1.연습문제;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {

    public int[] solution(int[] arr) {
        int[] answer;

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i-1]) {
                nums.add(arr[i]);
            }
        }

        answer = new int[nums.size()];
        int cnt = 0;

        for (Integer num : nums) {
            answer[cnt] = num;
            cnt++;
        }

        return answer;
    }

}
