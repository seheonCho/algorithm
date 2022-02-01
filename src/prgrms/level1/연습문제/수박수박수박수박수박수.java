package prgrms.level1.연습문제;

public class 수박수박수박수박수박수 {

    StringBuilder sb = new StringBuilder();
    final static String su = "수";
    final static String bak = "박";

    public String solution(int n) {
        String answer = "";

        for (int i=1; i<=n; i++) {

            if (isEven(i)) {
                addEvenTxt();
            } else {
                addOddTxt();
            }

        }
        answer = sb.toString();
        return answer;
    }

    private boolean isEven(int num) {
        if (num == 0 || num % 2 == 0) {
            return true;
        }
        return false;
    }

    private void addOddTxt() {
         sb.append(su);
    }

    private void addEvenTxt() {
         sb.append(bak);
    }


}
