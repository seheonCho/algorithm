package prgrms.level1.연습문제;

public class 콜라츠_추측 {

    static int cnt = 0;

    public int solution(int num) {
        long longNum = num;

        while (longNum != 1) {

            if (cnt == 500) return -1;

            if (isEvenNum(longNum)) {
                longNum = evenNumCalculator(longNum);
                cnt++;
            } else {
                longNum = oddNumCalculator(longNum);
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isEvenNum(long num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    private long evenNumCalculator(long num) {
        return num / 2;
    }

    private long oddNumCalculator(long num) {
        return (num * 3) + 1;
    }

}
