package prgrms;

import prgrms.카카오_개발자_겨울_인턴십.크레인_인형뽑기_게임;

public class PrgrmsMain {

    public static void main(String[] args) {
        // Used to programmer coding test solve
        크레인_인형뽑기_게임 crain = new 크레인_인형뽑기_게임();

        int[][] input = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = new int[]{1,5,3,5,1,2,1,4};

        crain.solution(input, moves);

        input = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        // 4 나와야댐
        crain.solution(input, moves);
    }
}
