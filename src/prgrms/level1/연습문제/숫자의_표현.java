package prgrms.level1.연습문제;

public class 숫자의_표현 {

    public int solution(int n) {

        //자연수들의 합으로 표현할 수 있는 방법의 수는, 자연수의 약수 중 홀수인 수의 개수
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1) {
                result++;
            }
        }
        return result;
    }

}
