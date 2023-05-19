package prgrms.level2.summer_winter;

public class 점프와_순간_이동 {

    public int solution(int n) {
        int jumpCount = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                jumpCount++;
                n -= 1;
            }
        }

        return jumpCount;
    }
}
//    private int[] minEnergys;
//
//    public int solution(int n) {
//        minEnergys = new int[n + 1];
//        minEnergys[1] = 1; //무조건
//
//        for (int i = 2; i <= n; i++) {
//            if (i % 2 == 0 && minEnergys[i / 2] != 0) {
//                int beforeEnergy = minEnergys[i / 2];
//                minEnergys[i] = beforeEnergy;
//                continue;
//            }
//
//            minEnergys[i] = minEnergys[i - 1] + 1;
//        }
//
//        return minEnergys[n];
//    }
