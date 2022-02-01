package prgrms.level1.summer_Winter_Coding;

public class 소수만들기 {

    public int solution(int[] nums) {

        int answer = 0;

        for (int i=0; i<nums.length; i++) {

            for (int j=i+1; j<nums.length; j++) {

                for (int k=j+1; k<nums.length; k++) {
                    if (isNotSosu(sumInt(nums[i], nums[j], nums[k]))) {
                        answer++;
                    }

                }

            }

        }
        return answer;
    }

    boolean isNotSosu(int sumNumber) {
        for (int i=1; i<sumNumber+1; i++) {
            if (i != 1 && i != sumNumber && sumNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    int sumInt(int ...numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
