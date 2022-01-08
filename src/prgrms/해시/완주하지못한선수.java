package prgrms.해시;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> hashMap = new HashMap<>();

        for(int i=0; i<participant.length; i++){
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0)+1);
        }

        for(int i=0; i<completion.length; i++){
            hashMap.put(completion[i], hashMap.get(completion[i])-1);
        }

        for(String key : hashMap.keySet()) {
            if( hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

}
