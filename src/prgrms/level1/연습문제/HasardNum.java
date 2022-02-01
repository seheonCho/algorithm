package prgrms.level1.연습문제;

public class HasardNum {

    public boolean solution(int x) {
        boolean answer = false;

        int sum = 0;

        for (String strNum : String.valueOf(x).split("")) {
            sum += Integer.parseInt(strNum);
        }

        if (isZeroRemainder(x, sum)) {
            answer = true;
        }
        return answer;
    }

    private boolean isZeroRemainder(int x, int sum) {
        if (x % sum == 0) {
            return true;
        }
        return false;
    }
}
