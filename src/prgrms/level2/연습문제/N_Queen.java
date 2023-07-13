package prgrms.level2.연습문제;

public class N_Queen {

    private static int answer = 0;
    private static int[] chessBoard;
    private static int limit;

    public int solution(int n) {
        limit = n;
        chessBoard = new int[n];

        dfs(0);

        return answer;
    }

    private void dfs(int depth) {
        if (depth == limit) {
            answer++;
            return;
        }

        for (int i = 0; i < limit; i++) {
            chessBoard[depth] = i;
            if (isAvailable(depth)) {
                dfs(depth + 1);
            }
        }

    }

    private boolean isAvailable(int depth) {
        for (int i = 0; i < depth; i++) {
            if (isSameRow(depth, i)) {
                return false;
            }

            if (isDiagonalLocation(depth, i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * 지금까지 놓은것부터 현재까지 동일 행
     * */
    private boolean isSameRow(int depth, int i) {
        return chessBoard[i] == chessBoard[depth];
    }

    /**
     * 대각 판별
     */
    private boolean isDiagonalLocation(int depth, int i) {
        return Math.abs(depth - i) == Math.abs(chessBoard[i] - chessBoard[depth]);
    }

}
