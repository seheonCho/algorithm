package prgrms.level2.연습문제;

import java.util.Arrays;

public class 최솟값_만들기 {

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int maxIndex = A.length - 1;
        for (int i = 0; i < maxIndex + 1; i++) {
            answer += (A[i] * B[maxIndex - i]);
        }
        return answer;
    }

}
