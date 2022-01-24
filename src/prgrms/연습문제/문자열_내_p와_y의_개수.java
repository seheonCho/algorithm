package prgrms.연습문제;

public class 문자열_내_p와_y의_개수 {

    String stringP = "P";
    String stringY = "Y";

    public boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;

        String[] strings = s.toUpperCase().split("");
        for (String str : strings) {
            if (isStringP(str)) {
                pCnt++;
                continue;
            }

            if (isStringY(str)) {
                yCnt++;
                continue;
            }
        }

        if (pCnt != yCnt) {
            answer = false;
        }
        System.out.println(pCnt);
        System.out.println(yCnt);

        return answer;
    }

    private boolean isStringP(String str) {

        if(str.equals(stringP)) {
            return true;
        }
        return false;
    }

    private boolean isStringY(String str) {

        if(str.equals(stringY)) {
            return true;
        }
        return false;
    }

}