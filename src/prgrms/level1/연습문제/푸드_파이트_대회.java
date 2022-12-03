package prgrms.level1.연습문제;

public class 푸드_파이트_대회 {

    public String solution(int[] food) {

        StringBuilder direction = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int ea = food[i] / 2;
            for (int j = 0; j < ea; j++) {
                direction.append(i);
            }
        }

        StringBuilder reverse = new StringBuilder(direction);
        reverse.reverse();
        direction.append(0);

        return direction + reverse.toString();
    }

}
