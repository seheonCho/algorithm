package prgrms.level1.연습문제;

public class X만큼_간격이_있는_n개의_숫자 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long addition = 0L;

        for (int i = 0; i < n; i++) {
            addition += x;
            answer[i] = addition;
        }

        return answer;
    }

}
