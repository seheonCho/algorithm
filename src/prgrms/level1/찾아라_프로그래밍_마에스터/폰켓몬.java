package prgrms.level1.찾아라_프로그래밍_마에스터;
import java.util.Set;
import java.util.HashSet;

public class 폰켓몬 {

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> numSet = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (!numSet.contains(nums[i])) {
                numSet.add(nums[i]);
            }
        }

        if (numSet.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = numSet.size();
        }

        return answer;
    }

}
