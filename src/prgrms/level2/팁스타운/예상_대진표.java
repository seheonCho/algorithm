package prgrms.level2.팁스타운;

public class 예상_대진표 {

    public int solution(int n, int a, int b) {
        int nowRound = 0;

        while (a != b) {
            a = getNumberOfNextRound(a);
            b = getNumberOfNextRound(b);
            nowRound++;
        }

        return nowRound;
    }

    private int getNumberOfNextRound(int number) {
        int rest = number % 2;
        int share = number / 2;

        if (rest == 0) {
            return share;
        }
        return share + rest;
    }

}
