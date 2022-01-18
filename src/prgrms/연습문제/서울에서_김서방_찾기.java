package prgrms.연습문제;

public class 서울에서_김서방_찾기 {

    final static String KIM = "Kim";

    public String solution(String[] seoul) {
        String answer = "";
        int kimPoint = 0;

        for (int i=0; i<seoul.length; i++) {

            if (isKim(seoul[i])) {
                kimPoint = i;
            }

        }

        answer = "김서방은 " + kimPoint + "에 있다";

        return answer;
    }

    private boolean isKim(String name) {
        if (KIM.equals(name)) {
            return true;
        }
        return false;
    }

}
