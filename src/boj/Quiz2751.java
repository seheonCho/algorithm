package boj;

import java.io.*;

public class Quiz2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums = Integer.parseInt(br.readLine());
        int[] numBox = new int[nums];

        for(int i=0; i<nums; i++) {
            numBox[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int boxSize = numBox.length;

        //버블정렬을 위한 변수
        int tempBox = 0;

        for(int i=0; i<boxSize; i++) {

            for(int j=i; j<boxSize; j++) {

                //버블정렬
                if (numBox[i] > numBox[j]){
                    tempBox = numBox[i];
                    numBox[i] = numBox[j];
                    numBox[j] = tempBox;
                }

            }

        }

        // 줄단위 개행을 포함한 입력
        for(int num : numBox) {
            bw.write(num+"\n");
        }

        bw.flush();
        bw.close();

    }

}
