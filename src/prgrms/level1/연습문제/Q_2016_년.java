package prgrms.level1.연습문제;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q_2016_년 {

    private static final int YEAR = 2016;
    private static final int TEXT_OF_START = 0;
    private static final int TEXT_OF_END = 3;

    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(YEAR, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString().substring(TEXT_OF_START, TEXT_OF_END);
    }

}
