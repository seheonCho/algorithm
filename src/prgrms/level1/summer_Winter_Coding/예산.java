package prgrms.level1.summer_Winter_Coding;

import java.util.Arrays;

public class 예산 {

    public int solution(int[] d, int budget) {
        int count = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget >= 0) {
                count++;
                continue;
            }
            break;
        }

        return count;
    }

}
