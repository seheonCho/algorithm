package prgrms.level1.연습문제;

public class 평균_구하기 {

    public double solution(int[] arr) {
        double answer = 0;
        int addition = 0;

        for (int num : arr) {
            addition += num;
        }

        answer += (double) addition / arr.length;

        return answer;
    }

}
