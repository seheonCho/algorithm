package prgrms.level1.연습문제;

public class 소수_찾기 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if(!isPrime(i)) answer++;
        }

        return answer;
    }

    private boolean isPrime(int num) {
        int sqrtNum = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

}
