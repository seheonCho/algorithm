package prgrms.level1.연습문제;

public class 문자열을정수로바꾸기 {

    public int solution(String s) {
        char first = s.charAt(0);

        s.replace("+", "");
        s.replace("-", "");

        int parsingInt = Integer.parseInt(s);

        if (first == '-') {
             parsingInt *= -1;
        }
        return parsingInt;
    }

}
