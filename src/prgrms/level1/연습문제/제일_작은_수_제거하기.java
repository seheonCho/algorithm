package prgrms.level1.연습문제;

import java.util.ArrayList;
import java.util.List;

public class 제일_작은_수_제거하기 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }

        List<Integer> nums = new ArrayList<>();

        int minNum = arr[0];
        for (int num : arr) {

            nums.add(num);

            if (minNum > num) {
                minNum = num;
            }
        }

        nums.remove(Integer.valueOf(minNum));

        answer = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            answer[i] = nums.get(i);
        }

        return answer;
    }

}
