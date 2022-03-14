package prgrms;

import prgrms.level2.정렬.H_Index;

public class PrgrmsMain {

    public static void main(String[] args) {
        // Used to programmer coding test solve
        H_Index theHIndex = new H_Index();
        System.out.println(theHIndex.solution(new int[]{3,0,6,1,5}));
    }
}
