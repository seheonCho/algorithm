package prgrms.월간코드챌린지;

public class 음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i=0; i<absolutes.length; i++) {

            if (!signs[i]) {
                absolutes[i] = absolutes[i] * -1;

            }

        }

        for (int num : absolutes) {
            answer += num;
        }

        return answer;
    }


}
