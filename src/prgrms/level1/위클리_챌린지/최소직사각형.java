package prgrms.level1.위클리_챌린지;

import java.util.Arrays;

public class 최소직사각형 {

    public int solution(int[][] sizes) {

        for (int[] numArrays : sizes) {
            Arrays.sort(numArrays);
        }

        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > maxWidth) {
                maxWidth = sizes[i][0];
            }

            if (sizes[i][1] > maxHeight) {
                maxHeight = sizes[i][1];
            }
        }

        return maxWidth * maxHeight;
    }

}

//테스트 1 〉	통과 (0.42ms, 81.3MB)
//테스트 2 〉	통과 (0.51ms, 75.1MB)
//테스트 3 〉	통과 (0.47ms, 78.9MB)
//테스트 4 〉	통과 (0.36ms, 74MB)
//테스트 5 〉	통과 (0.46ms, 77.3MB)
//테스트 6 〉	통과 (0.36ms, 74.9MB)
//테스트 7 〉	통과 (0.81ms, 76.3MB)
//테스트 8 〉	통과 (0.36ms, 72MB)
//테스트 9 〉	통과 (0.35ms, 73.4MB)
//테스트 10 〉	통과 (0.37ms, 76.6MB)
//테스트 11 〉	통과 (0.67ms, 79.4MB)
//테스트 12 〉	통과 (0.59ms, 73.5MB)
//테스트 13 〉	통과 (0.75ms, 78.3MB)
//테스트 14 〉	통과 (0.92ms, 83.2MB)
//테스트 15 〉	통과 (1.45ms, 68.3MB)
//테스트 16 〉	통과 (1.63ms, 85MB)
//테스트 17 〉	통과 (1.78ms, 80.4MB)
//테스트 18 〉	통과 (3.16ms, 79.8MB)
//테스트 19 〉	통과 (19.69ms, 77MB)
//테스트 20 〉	통과 (3.37ms, 91.3MB)