package prgrms.level0.해시;

import java.util.HashMap;
import java.util.Map;

public class 옹알이_1 {

    private final String AYA = "aya";
    private final String YE = "ye";
    private final String WOO = "woo";
    private final String MA = "ma";

    public int solution(String[] babbling) {
        String[] availBabbles = new String[4];
        availBabbles[0] = AYA;
        availBabbles[1] = YE;
        availBabbles[2] = WOO;
        availBabbles[3] = MA;

        int result = 0;

        for (int i = 0; i < babbling.length; i++) {
            String babbleOfPart = babbling[i];
            Map<String, Integer> countOfBabble;
            countOfBabble = initMap();

            int fillCount = 0;
            for (int j = 0; j < availBabbles.length; j++) {
                String availBabble = availBabbles[j];

                if (babbleOfPart.contains(availBabble)) {
                    if (countOfBabble.get(availBabble) == 0) {
                        countOfBabble.put(availBabble, 1);
                        fillCount += availBabble.length();
                    } else {
                        break;
                    }

                }

                if (fillCount == babbleOfPart.length()) {
                    result++;
                    break;
                }
            }

        }

        return result;
    }

    private Map<String, Integer> initMap() {
        Map<String, Integer> countOfBabble;
        countOfBabble = new HashMap<>();
        countOfBabble.put(AYA, 0);
        countOfBabble.put(YE, 0);
        countOfBabble.put(WOO, 0);
        countOfBabble.put(MA, 0);
        return countOfBabble;
    }

}
