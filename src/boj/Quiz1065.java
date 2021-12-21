package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        boolean[] hanSuArr = new boolean[input];
        short output = 0;

        int i = 0;
        int hanSuLen = hanSuArr.length;
        for (i = 0; i<hanSuLen; i++) {
            hanSuArr[i] = isHanSu(i);
        }

        for(boolean bool : hanSuArr) if(bool) output++;
        System.out.println(output);

    }

    public static boolean isHanSu(int num) {

        String toStr = num + "";
        String[] toStrArr = toStr.split("");
        int toStrArrLen = toStrArr.length;
        int i = 0;
        int k = 0;
        boolean output = false;

        // 숫자의 자릿수 별 차이를 구하기 위한 작은 배열
        int[] gap = new int[toStrArrLen - 1];

        for (i = 0; i < toStrArrLen; i++) {
            if(toStrArrLen < 2)
                output = true;
            else {
                int j=0;
                for (j = 0; j<gap.length; j++) {
                    gap[j] = Integer.parseInt(toStrArr[j]) - Integer.parseInt(toStrArr[j+1]);
                }

                for (k = 0; k < gap.length - 1; k++) {
                    if(gap[k] !=  gap[k+1]) output = false;
                    break;
                }
            }
        }
        System.out.println(num);
        return output;
    }
}
