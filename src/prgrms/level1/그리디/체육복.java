package prgrms.level1.그리디;

import java.util.Arrays;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0 ; i < lost.length; i++) {

            for (int j = 0 ; j < reserve.length; j++) {

                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }

            }
        }

        for (int i = 0 ; i < lost.length; i++) {

            for (int j = 0 ; j < reserve.length; j++) {

                if (lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
                    reserve[j] = -1;
                    count++;
                    break;
                }

            }
        }

        return n - lost.length + count;
    }

    /*
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        Set<Integer> set = new HashSet<>();
        for (int studentNum : reserve) {
            set.add(Integer.valueOf(studentNum));
        }

        for (int i = 0 ; i < lost.length; i++) {
            if (set.contains(lost[i]-1)) {
                set.remove(lost[i]-1);
                answer++;
            } else if (set.contains(lost[i]+1)) {
                set.remove(lost[i]+1);
                answer++;
            }
        }

        return n - lost.length + answer;
    }
    */

}
