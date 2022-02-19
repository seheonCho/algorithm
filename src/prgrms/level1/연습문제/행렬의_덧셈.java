package prgrms.level1.연습문제;

public class 행렬의_덧셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer;

        answer = new int[arr1.length][];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = new int[arr1[0].length];

            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = sum(arr1[i][j], arr2[i][j]);
            }

        }

        return answer;
    }

    private int sum(int a, int b) {
        return a + b;
    }

}
