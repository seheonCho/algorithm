package prgrms.level1.카카오_개발자_겨울_인턴십;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {

    static int SIDE_LENGTH;
    static Stack basket;
    static int[][] NEW_BOARD;
    static int BINGO_CNT = 0;

    public int solution(int[][] board, int[] moves) {
        SIDE_LENGTH = board.length;
        basket = new Stack<Integer>();
        NEW_BOARD = board;

        for (int i = 0; i < moves.length; i++) {
            getFirstNum(moves[i] - 1);
        }

        return BINGO_CNT;
    }

    private void getFirstNum(int pickIndex) {

        for (int i = 0; i < SIDE_LENGTH; i++) {
            if (NEW_BOARD[i][pickIndex] != 0) {
                stackNum(NEW_BOARD[i][pickIndex]);
                NEW_BOARD[i][pickIndex] = 0;
                break;
            }
        }

    }

    private void stackNum(int num) {

        if (basket.empty()) {
            basket.push(num);
        } else {
            bingoChk(num);
        }

    }

    private void bingoChk(int num) {

        if (basket.peek().equals(num)) {
            basket.pop();
            addBingoCnt();
        } else {
            basket.push(num);
        }

    }

    private void printBasket() {
        System.out.println("현재 바스켓 => ");
        for (Object number : basket) {
            System.out.print(number);
        }
        System.out.println();
    }

    private void addBingoCnt() {
        BINGO_CNT += 2;
    }

}
