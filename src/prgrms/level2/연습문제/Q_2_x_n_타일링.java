package prgrms.level2.연습문제;

public class Q_2_x_n_타일링 {

    static final int FIX_NUM = 1000000007;

    public int solution(int n) {

        int[] fiboArr = new int[n + 1];
        fiboArr[0] = 1;
        fiboArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            int num = fiboArr[i - 2] + fiboArr[i - 1];
            fiboArr[i] = num % FIX_NUM;
        }

        return fiboArr[n];
    }

}
