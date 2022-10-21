package prgrms.level2.완전탐색;

public class 카펫 {

    public int[] solution(int brown, int yellow) {

        int carpetSize = brown + yellow;
        int[] answer = new int[2];

        for (int i = 1; i <= carpetSize; i++) {

            int width = carpetSize / i;

            if (i > width) continue;

            int insideBlock = (i - 2) * (width - 2);

            if (insideBlock == yellow) {
                answer[0] = width;
                answer[1] = i;
                return answer;
            }

        }

        return answer;

    }

/*
    private boolean isDivisorNum(int num, int bigNum) {
        if (bigNum % num == 0) {
            return true;
        }
        return false;
    }
*/

}
