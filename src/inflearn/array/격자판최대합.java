package inflearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class 격자판최대합 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                input[i][j] = sc.nextInt();
            }
        }
        int answer = solution(n,input);

        System.out.println(answer);
    }

    private static int solution(int n, int[][] input) {
        int answer = 0;
        int max = 0;
        int[] tmpArr = new int[n-1];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int temp = 5;
                max+=input[i][j];

                tmpArr[1][i]+=input[j][i];
                tmpArr[2][i]+=input[j][j];
                tmpArr[3][i]+=input[i][--temp];
            }
            for (int j=0; j<n; j++){

            }
        }
        for(int[] arr : tmpArr){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        return answer;
    }

    private static int getAnswer(int answer, int max) {
        if (max > answer) {
            answer = max;
        }
        return answer;
    }
}
