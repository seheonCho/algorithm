package prgrms.level2.연습문제;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 디펜스_게임 {

    public int solution(int n, int k, int[] enemy) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int answer = enemy.length;
        for (int i = 0; i < enemy.length; i++) {
            queue.add(enemy[i]);
            n -= enemy[i];

            if (n < 0) {
                if (k > 0 && !queue.isEmpty()) {
                    n += queue.poll();
                    k--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }

}
