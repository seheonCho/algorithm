package prgrms.level2.연습문제;

public class 연습_124_나라의_숫자 {

    public String solution(int n) {

        String answer = "";
        String[] digits = {"4", "1", "2"};

        while (n > 0) {
            answer = digits[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }


}
