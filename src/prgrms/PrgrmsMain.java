package prgrms;

import prgrms.카카오인턴십.PressKeypad;

public class PrgrmsMain {

    public static void main(String[] args) {
        // Used to programmer coding test solve
        PressKeypad pressKeypad = new PressKeypad();
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        pressKeypad.solution(numbers, hand);
    }
}
