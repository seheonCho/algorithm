package boj.수학;

import java.util.Scanner;

public class 평균은_넘겠지 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0; // 카운트용
        int j = 0;

        int firstArrSize = Integer.parseInt(scanner.nextLine()); // 1차원 배열의 크기 ( row size )
        int[][] firstArr = new int[firstArrSize][];
        String[] strArr = new String[2];
        String line = "";
        int secondArrSize = 0;
        for(i = 0; i<firstArrSize; i++) {

            line = scanner.nextLine(); //첫줄 C가 아닌 다음 줄부터 입력값 한줄 담기
            strArr = line.split(" ", 2); // line값을 첫번째 공백 전후로 나누기 사이즈는 무조건 2로 고정되어있음.
            secondArrSize = Integer.parseInt(strArr[0]);
            firstArr[i] = new int[secondArrSize];
            for(j = 0; j<secondArrSize; j++)
                firstArr[i][j] = Integer.parseInt(strArr[1].split(" ")[j]);

        }

        int scoreSum = 0; // 각 2차원 배열의 합, 추후 해당 2차원 배열의 길이로 나눌 예정
        float overCnt = 0; //평균 넘는것 카운트
        byte hundred = 100; // 비율을 만들기 위한 곱셈용
        String format = ""; // 출력포맷 지정용 문자열변수
        float scoreAvg = 0f; // 줄 별 평균값

        for(i=0; i<firstArrSize; i++) {

            scoreSum = 0; // 첫 줄이 아닌 줄의 줄 별(배열) 합을 나눌예정이라 현위치에서 초기화
            overCnt = 0; // 위와 동
            for(j=0; j<firstArr[i].length; j++)
                scoreSum += firstArr[i][j];

            scoreAvg = scoreSum/firstArr[i].length;

            for(int score : firstArr[i]){
                if(score > scoreAvg)
                    overCnt++; // 평균값 넘는 갯수 조건부 증가
            }

            format = String.format("%.3f", overCnt/firstArr[i].length * hundred); //출력포맷지정
            System.out.println(format+'%');

        }

    }

}
