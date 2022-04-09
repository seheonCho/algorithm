package prgrms.level2.연습문제;

public class 피보나치_수 {

    public int solution(int n) {
        if (n < 2) return 1;

        int answer = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i < n + 1; i++) {
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
        }

        return answer;
    }

}
