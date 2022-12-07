package prgrms.level1.연습문제;

public class 삼총사 {

    public int solution(int[] number) {
        int answer = 0;
        int numberLength = number.length;

        for (int i = 0; i < numberLength - 2; i++) {
            int first = number[i];

            for (int j = i + 1; j < numberLength - 1; j++) {
                int second = number[j];

                for (int k = j + 1; k < numberLength; k++) {
                    int third = number[k];

                    if (isThreePair(first, second, third) && i != j && j != k) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isThreePair(int a, int b, int c) {
        return a + b + c == 0;
    }

}
