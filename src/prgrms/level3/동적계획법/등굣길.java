package prgrms.level3.동적계획법;

public class 등굣길 {

    private static final int DIVIDE_REST = 1_000_000_007;

    public int solution(int m, int n, int[][] puddles) {
        int[][] dpMap = new int[n][m];
        dpMap[0][0] = 1;

        for (int[] puddle : puddles) {
            int puddleN = puddle[0] - 1;
            int puddleM = puddle[1] - 1;
            dpMap[puddleM][puddleN] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (dpMap[i][j] == -1) {
                    dpMap[i][j] = 0;
                    continue;
                }

                if (i != 0) {
                    dpMap[i][j] += dpMap[i - 1][j] % DIVIDE_REST;
                }

                if (j != 0) {
                    dpMap[i][j] += dpMap[i][j - 1] % DIVIDE_REST;
                }

            }
        }

        return dpMap[n - 1][m - 1] % DIVIDE_REST;
    }

}
