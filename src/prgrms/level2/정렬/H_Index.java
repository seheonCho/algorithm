package prgrms.level2.정렬;

import java.util.Arrays;

/**
* 문제의 핵심은 낮은 H-Index가 아닌, 높은 H-Index를 구할 수 있게, 내림차순 정렬 한 후 찾는것.
*/
public class H_Index {

    int maxCount;

    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {

            maxCount = citations.length - i;

            if (citations[i] >= maxCount) {
                answer = maxCount;
                break;
            }

        }

        return answer;
    }

}