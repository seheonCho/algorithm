package prgrms.level3.동적계획법;

import java.util.Arrays;

public class 정수_삼각형 {

    public int solution(int[][] triangle) {
        int triangleLength = triangle.length;
        int[][] result = new int[triangleLength][];

        for (int i = 0; i < triangleLength; i++) {
            result[i] = new int[triangle[i].length];
        }

        int head = triangle[0][0];
        result[0][0] = head;
        result[1][0] = triangle[1][0] + head;
        result[1][1] = triangle[1][1] + head;

        for (int i = 2; i < triangleLength; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result[i][0] = triangle[i][0] + result[i - 1][0];
                    continue;
                }
                if (j == i) {
                    result[i][j] = triangle[i][j] + result[i - 1][j - 1];
                    continue;
                }

                result[i][j] = triangle[i][j] + Math.max(result[i - 1][j], result[i - 1][j - 1]);
            }
        }

        int[] nums = result[triangleLength - 1];
        return Arrays.stream(nums).max().getAsInt();
    }

}
