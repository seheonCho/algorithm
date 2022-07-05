package prgrms.level1.데브매칭웹백엔드;

public class 로또의_최고_순위와_최저_순위 {

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {};
            int duplicateNum = 0;
            int zeroCount = 0;

            //lottos 배열 중 0 무시하고 그냥 맞추면? -> 최저 순위 번호
            //lottos 배열 중 0이, 내가 고르지 않은 번호와 당첨번호에 들어있으면 순위를 올릴 수 있다.

            for (int i = 0; i < lottos.length; i++) {

                if (lottos[i] == 0) zeroCount++;

                for (int j = 0; j < win_nums.length; j++) {

                    if (lottos[i] == win_nums[j]) {
                        duplicateNum++;
                    }

                }
            }

            int lowRank = -1;

            if (duplicateNum < 2) {
                lowRank = 6;
            } else {
                lowRank = 7 - duplicateNum;
            }

            int highRank = lowRank - zeroCount;
            if (highRank < 1) {
                highRank = 1;
            }

            answer = new int[]{highRank, lowRank};

            return answer;
        }
    }

}
