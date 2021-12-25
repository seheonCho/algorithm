package boj;

public class Quiz4673 {

    public static void main(String[] args) {

        // boolean[] 선언시 false
        boolean[] notSelfNumArr = new boolean[10001];

        int i;
        for (i=1; i<=10001; i++){
            // i == notSelfNumArr의 index와 상동
            int dn = getDn(i);
            if(dn <= 10000){
                notSelfNumArr[dn] = true;
            }
        }

        int j;
        for (j = 1; j<notSelfNumArr.length; j++) {
            if (!notSelfNumArr[j]) {
                System.out.println(j);
            }
        }

    }

    public static int getDn(int n) {
        int dn = n;
        while(n > 0) {
            dn += n % 10;
            n /= 10;
        }
//         1의 경우를 제외하고 이 주석을 풀면 새로우 관점이 보인다.
//         System.out.print(dn + "----");
        return dn;
    }

}
