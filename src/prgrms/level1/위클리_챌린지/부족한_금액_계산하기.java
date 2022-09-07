package prgrms.level1.위클리_챌린지;

public class 부족한_금액_계산하기 {

    public long solution(int price, int money, int count) {
        long desireMoney = 0;

        for (int i = 0; i < count; i++) {
            desireMoney += price * (i + 1);
        }

        long requiredMoney = desireMoney - money;
        if (requiredMoney >= 0) {
            return requiredMoney;
        }
        return 0;
    }

}
