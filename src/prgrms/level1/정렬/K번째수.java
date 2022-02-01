package prgrms.level1.정렬;

import java.util.Arrays;

public class K번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int numI, numJ, numK;

            numI = commands[i][0];
            numJ = commands[i][1];
            numK = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, numI - 1, numJ);

            Arrays.sort(temp);

            answer[i] = temp[numK - 1];

        }

        return answer;
    }

}
