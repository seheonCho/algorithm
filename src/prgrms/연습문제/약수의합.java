package prgrms.연습문제;

public class 약수의합 {

    public int solution(int n) {

        int answer = 0;
        int[] sosus = new int[n];

        for (int i=1; i<=n; i++) {
            if (notDefaultAndDivisionResultNotZero(i, n)) {
                sosus[i-1] = i;
            }

        }

        for (int sosu : sosus) {
            answer += sosu;
        }

        return answer;
    }

    boolean notDefaultAndDivisionResultNotZero(int dividedNum, int paramNum) {

        if (dividedNum != 0 && paramNum % dividedNum == 0) {
            return true;
        }

        return false;
    }

}
