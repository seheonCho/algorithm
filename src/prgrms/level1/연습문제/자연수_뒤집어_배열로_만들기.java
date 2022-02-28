package prgrms.level1.연습문제;

public class 자연수_뒤집어_배열로_만들기 {

    public int[] solution(long n) {
        int[] answer;

        StringBuilder sb = new StringBuilder(Long.toString(n));
        sb = sb.reverse();
        String[] strings = sb.toString().split("");

        answer = new int[sb.length()];

        for (int i = 0 ; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(strings[i]);
        }

        return answer;
    }

}
