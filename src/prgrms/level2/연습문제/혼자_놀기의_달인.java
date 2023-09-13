package prgrms.level2.연습문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 혼자_놀기의_달인 {

    List<Integer> counts = new ArrayList<>();
    boolean[] isVisit;

    // ex) 8 -> 4 -> 7 -> 1
    //     6 -> 5 -> 2
    public int solution(int[] cards) {
        isVisit = new boolean[cards.length + 1];
        for (int card : cards) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(card);
            counts.add(bfs(cards, queue));
        }

        if (counts.size() <= 1) {
            return 0;
        }

        counts.sort(Collections.reverseOrder());
        return counts.get(0) * counts.get(1);
    }

    private int bfs(int[] cards, Queue<Integer> queue) {
        int count = 0;
        while (!queue.isEmpty()) {
            int index = queue.poll() - 1;

            if (!isVisit[index]) {
                isVisit[index] = true;
                count++;
                queue.add(cards[index]);
            }
        }
        return count;
    }

}
