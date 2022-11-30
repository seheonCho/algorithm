package prgrms.level3.깊이_너비_우선_탐색;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 네트워크 {

    public int solution(int n, int[][] computers) {
        boolean[] isVisit = new boolean[n];
        List<List<Integer>> networks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            networks.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && computers[i][j] == 1) {
                    networks.get(i).add(j);
                    networks.get(j).add(i);
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
//        queue.add(0);

        int count = 0;

        // 0번  컴퓨터 아닌 곳에서 시작되는 네트워크 순회를 어떻게 할까...?
        for (int i = 0; i < n; i++) {
            if (isVisit[i]) {
                continue;
            }

            queue.add(i);
            while (!queue.isEmpty()) {
                int computer = queue.poll();
                isVisit[computer] = true;

                List<Integer> computersNetwork = networks.get(computer);
                for (int j = 0; j < computersNetwork.size(); j++) {
                    int nextComputer = computersNetwork.get(j);
                    if (!isVisit[nextComputer]) {
                        queue.add(nextComputer);
                    }
                }

            }
            count++;
        }

        return count;
    }

}
