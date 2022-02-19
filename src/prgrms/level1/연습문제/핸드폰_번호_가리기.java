package prgrms.level1.연습문제;

public class 핸드폰_번호_가리기 {

    public String solution(String phone_number) {
        String answer = "";
        int phoneNumberLen = phone_number.length();
        int cnt = 0;

        for (int i = phoneNumberLen - 1; i >= 0; i--) {
            if (cnt > 3) {
                answer = '*' + answer;
            } else {
                answer = phone_number.charAt(i) + answer;
            }
            cnt++;
        }

        return answer;
    }

}
