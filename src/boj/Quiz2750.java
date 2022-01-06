package boj;

import java.io.*;

public class Quiz2750 {

    static int inputNum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCnt = Integer.parseInt(br.readLine());
        int[] nums = new int[numCnt];
        int box;

        for (int i=0; i<numCnt; i++) {
            inputNum = Integer.parseInt(br.readLine());
            nums[i] = inputNum;
        }

        for (int i=0; i<numCnt; i++) {
            for (int j=i+1; j<numCnt; j++) {
                if (nums[i] > nums[j]) {
                    box = nums[i];
                    nums[i] = nums[j];
                    nums[j] = box;
                }
            }
        }
        char addLine = '\n';
        for (int num : nums) {
            bw.append(num + " " + addLine);
        }
        br.close();
        bw.flush();
        br.close();
    }

}
