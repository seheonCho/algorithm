package prgrms.level1.연습문제;

public class 시저_암호 {

    public String solution(String s, int n) {

        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            char text = s.charAt(i);

            if (Character.isLowerCase(text)) {
                text = (char) ((text - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(text)) {
                text = (char) ((text - 'A' + n) % 26 + 'A');
            }

            answer += text;

        }

        return answer;

    }


}
