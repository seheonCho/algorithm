package prgrms.level2.힙;

import java.util.PriorityQueue;

public class 더_맵게 {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            heap.offer(scoville[i]);
        }

        while (heap.peek() < K){
            if (heap.size() < 2) return -1;

            int lowScoville = heap.poll();
            int secondLowScoville = heap.poll();

            int newFood = lowScoville + (secondLowScoville * 2);
            heap.offer(newFood);
            answer++;
        }

        return answer;
    }

}
