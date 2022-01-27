package prgrms.카카오_개발자_겨울_인턴십;

public class 크레인_인형뽑기_게임 {

    static int SIDE_LENGTH;
    static int[] basket;
    static int[][] NEW_BOARD;
    static int BINGO_CNT = 0;

    public int solution(int[][] board, int[] moves) {
        SIDE_LENGTH = board.length;
        basket = new int[moves.length];
        NEW_BOARD = board;

        for (int i = 0; i < moves.length; i++) {
            getFirstNum(moves[i]);
        }

        System.out.println("last bingoCnt => " + BINGO_CNT);
        return BINGO_CNT;
    }

    private void getFirstNum(int num) {

        Loop1 :
        for (int i = 0; i < SIDE_LENGTH; i++) {
            Loop2 :
            for (int j = 0; j < SIDE_LENGTH; j++) {

                if (isSame(NEW_BOARD[j][i], num)) {
                    stackNum(num);
                    // 이거지워야 될듯
                    NEW_BOARD[j][i] = 0;
                    break;
                }

            }

        }

    }

    private boolean isSame(int a, int b) {
        if (a == b) {
            System.out.println("isSame => 숫자" + a + " / 숫자" + b);
            return true;
        }
        return false;
    }

    // bingo Chk 로 해야할듯..
    private void bingoChk() {

        for (int i = 0; i < basket.length - 1; i++) {
            if (isSame(basket[i], basket[i+1])) {
                bingo(i, i+1);
            }
        }
    }

    private void bingo(int a, int b) {
        basket[a] = 0;
        basket[b] = 0;
        BINGO_CNT++;
        alignBasket(a);
    }

    private void alignBasket(int num) {
        for (int i = num; i < basket.length - 1; i++) {
            basket[num] = basket[num+1];
        }
        if (basket[basket.length-1] == 0) {
            System.out.println("어떡하지");
        }
    }

    private void stackNum(int num) {

        for (int i = basket.length -1; i > -1; i--) {
            if (i == 0 || basket[i - 1] != 0) {
                System.out.println(basket[i]);
                basket[i] = num;
                System.out.println("진짜 쌓는다 => " + num);
                for (int number : basket) {
                    System.out.print(number);
                }
                System.out.println();
                for (int number : basket) {
                    System.out.print(number);
                }
                System.out.println();
                break;
            }
        }

    }

}
