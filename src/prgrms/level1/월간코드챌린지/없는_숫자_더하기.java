package prgrms.level1.월간코드챌린지;

import java.util.HashSet;
import java.util.Set;

public class 없는_숫자_더하기 {

    public int solution(int[] numbers) {
        int answer = 0;
        int maxNum = 9;

        Set<Integer> numberSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            numberSet.add(numbers[i]);
        }

        for (int i = 0; i <= maxNum; i++) {

            if (!numberSet.contains(i)) {
                answer += i;
            }

        }

        return answer;
    }

}
