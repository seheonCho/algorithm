package boj;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Quiz11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int pointCnt = Integer.parseInt(br.readLine());
        int[][] points = new int[pointCnt][2];
        int coordinatesX = 0;
        int coordinatesY = 1;

        String[] inputPoints;

        for (int i = 0; i < pointCnt; i++) {
            inputPoints = br.readLine().split(" ");
            points[i][coordinatesX] = Integer.parseInt(inputPoints[coordinatesX]);
            points[i][coordinatesY] = Integer.parseInt(inputPoints[coordinatesY]);
        }

        br.close();

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int a[], int b[]) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }

        });

        char addLine = '\n';

        for (int[] arr : points) {
            bw.append(arr[coordinatesX] + " " + arr[coordinatesY] + addLine);
        }
        bw.flush();
        bw.close();

    }

}
