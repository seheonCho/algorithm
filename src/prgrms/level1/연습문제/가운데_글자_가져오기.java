package prgrms.level1.연습문제;

public class 가운데_글자_가져오기 {

    public String solution(String s) {
        String answer = "";

        int theLength = s.length();

        if (s.length() % 2 == 0) {
            answer = String.valueOf(s.charAt(theLength / 2 - 1)) + String.valueOf(s.charAt(theLength / 2));
        } else {
            answer = String.valueOf(s.charAt(theLength / 2));
        }

        return answer;
    }

}
