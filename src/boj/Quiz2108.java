package boj;

import java.io.*;
import java.util.*;

public class Quiz2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        List<Integer> nums = new ArrayList<Integer>();
        int[] arr = new int[N];
        int[] check = new int[8001];
        int sums = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            sums += arr[i];
            check[arr[i] + 4000]++;
        }

        System.out.println((int) Math.round((double) sums / N));
        Arrays.sort(arr);
        System.out.println(arr[N / 2]); //중앙값

        for (int i = 0; i < 8001; i++) {
            if (check[i] >= max) {
                max = check[i];
            }
        }

        for (int i = 0; i < 8001; i++) {
            if (check[i] == max) {
                nums.add(i - 4000);
            }
        }

        if (nums.size() == 1) {
            System.out.println(nums.get(0));
        } else {
            Collections.sort(nums);
            System.out.println(nums.get(1));
        }

        System.out.println(Math.abs(arr[arr.length - 1] - arr[0]));  //범위
    }

    //산술평균 : N개의 수들의 합을 N으로 나눈 값
    //

    //중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    // 나열해서 중앙값을 찾을수 있는 자료구조 ?

    //최빈값 : N개의 수들 중 가장 많이 나타나는 값
    // 값별로 정리 할 수 있는 HashMap

    //범위 : N개의 수들 중 최댓값과 최솟값의 차이
    // static int


}


