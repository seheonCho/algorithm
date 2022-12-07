package prgrms.level2.투포인터;

import java.util.Arrays;

/*
 * 사이트 상 분류는 탐욕법으로 정의되었으나,
 * 효율성 때문에 투포인터 사용이 더 중요한 느낌
 */
public class 구명보트 {

    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;

        int start = 0;
        for (int end = people.length - 1; start <= end; end--){
            if (people[start] + people[end] <= limit) {
                start++;
            }
            answer++;
        }

        return answer;
    }

}
