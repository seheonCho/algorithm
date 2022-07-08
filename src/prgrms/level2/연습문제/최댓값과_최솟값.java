package prgrms.level2.연습문제;

import java.util.Arrays;

public class 최댓값과_최솟값 {

    public String solution(String s) {
        String[] strNums = s.split(" ");
        int[] nums = new int[strNums.length];

        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        Arrays.sort(nums);

        String answer = nums[0] + " " + nums[nums.length - 1];
        return answer;
    }

}
