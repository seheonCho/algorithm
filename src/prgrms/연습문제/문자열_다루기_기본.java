package prgrms.연습문제;

public class 문자열_다루기_기본 {

    static int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9};

    public boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 4 || s.length() == 6) {
            for (String string : s.split("")) {
                answer = isInNums(string);
                if (answer == false) break;
            }
        } else {
            answer = false;
        }


        return answer;
    }

    private boolean isInNums(String str) {

        for (int i = 0; i < nums.length; i++) {

            try {

                if (Integer.parseInt(str) == nums[i]) {
                    return true;
                }

            } catch (Exception e) {
                return false;
            }

        }
        return false;

    }

}
