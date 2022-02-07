package prgrms.level1.월간코드챌린지;

import java.util.*;

public class 두_개_뽑아서_더하기 {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> ints = new LinkedList<>();
        Set<Integer> numberSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if (i != j) {
                    if (!isExistNumInSet(numberSet, numbers[i] + numbers[j])) {
                        numberSet.add(numbers[i] + numbers[j]);
                        ints.add(numbers[i] + numbers[j]);
                    }
                }

            }

        }

        Collections.sort(ints);
        answer = new int[ints.size()];
        for (int i = 0; i < ints.size(); i++) {
            answer[i] = ints.get(i);
        }
        return answer;
    }

    private boolean isExistNumInSet(Set numberSet, int num) {
        if (numberSet.contains(num)) {
            return true;
        }
        return false;
    }

}
