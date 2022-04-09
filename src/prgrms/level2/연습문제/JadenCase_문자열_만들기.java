package prgrms.level2.연습문제;

public class JadenCase_문자열_만들기 {

    public String solution(String s) {
        String answer = "";

        String[] strings = s.toLowerCase().split(" ");
        boolean spaceFlag = true;

        for (int i = 0; i < strings.length; i++) {

            if (spaceFlag) {
                answer += strings[i].toUpperCase();
            } else {
                answer += strings[i];
            }

            if (strings[i].equals(" ")) {
                spaceFlag = true;
            } else {
                spaceFlag = false;
            }
        }

        return answer;
    }

}
