package prgrms.level1.월간코드챌린지;

public class 약수의_개수와_덧셈 {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {

            if (isEvenNumber(getDivisorCount(i))) {
                answer += i;
            } else {
                answer -= i;
            }

        }

        return answer;
    }

    private boolean isDivisor(int a, int b) {
        if (a % b == 0) {
            return true;
        }
        return false;
    }

    private int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (isDivisor(num, i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isEvenNumber(int num) {
        if (num != 0 && num % 2 == 0) {
            return true;
        }
        return false;
    }

}
