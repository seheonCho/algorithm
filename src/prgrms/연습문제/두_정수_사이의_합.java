package prgrms.연습문제;

public class 두_정수_사이의_합 {

    int bigNum;
    int smallNum;

    public long solution(int a, int b) {

        long answer = 0;

        isMoreThanOther(a, b);

        for (int i = smallNum; i <= bigNum; i++) {
            answer += i;
        }

        return answer;
    }

    private void isMoreThanOther(int a, int b) {

        if (a > b) {
            setBigNum(a);
            setSmallNum(b);
            return;
        }

        setBigNum(b);
        setSmallNum(a);
        return;
    }

    private void setBigNum(int num) {
        bigNum = num;
    }

    private void setSmallNum(int num) {
        smallNum = num;
    }



}
