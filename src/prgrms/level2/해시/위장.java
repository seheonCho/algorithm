package prgrms.level2.해시;

import java.util.HashMap;

public class 위장 {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> aHashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String[] nameAndCategory = clothes[i];
            aHashMap.put(nameAndCategory[1], aHashMap.getOrDefault(nameAndCategory[1], 1) + 1);
        }

        for (String key : aHashMap.keySet()) {
            answer *= aHashMap.get(key);
        }

        return answer - 1;
    }

}
