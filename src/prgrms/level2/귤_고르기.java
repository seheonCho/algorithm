package prgrms.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤_고르기 {

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> sizeMap = new HashMap<>();
        for (int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(sizeMap.keySet());
        keys.sort(((o1, o2) -> sizeMap.get(o2) - sizeMap.get(o1)));

        int i = 0;
        int answer = 0;
        while (k > 0) {
            k -= sizeMap.get(keys.get(i));
            answer++;
            i++;
        }

        return answer;
    }
}
