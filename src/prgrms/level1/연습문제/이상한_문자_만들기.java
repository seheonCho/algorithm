package prgrms.level1.연습문제;

public class 이상한_문자_만들기 {

    public String solution(String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char ch : chars) {

            if (ch == ' ') {
                index = 0;
                sb.append(" ");
            } else if (isEvenNum(index++)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }

        }

        return sb.toString();
    }

    private boolean isEvenNum(int num) {
        if (num == 0 || num % 2 == 0) {
            return true;
        }
        return false;
    }

}