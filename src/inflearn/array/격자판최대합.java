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
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i=0; i<n; i++){
            sum1=sum2=0;
            for (int j=0; j<n; j++){
                sum1+=input[i][j];
                sum2+=input[j][i];
            }
            if (sum1>answer){
                answer=sum1;
            }
            if (sum2>answer){
                answer=sum2;
            }
        }
        sum1=sum2=0;
        for (int i=0; i<n; i++){
            sum1+=input[i][i];
            sum2+=input[i][n-i-1];
        }
        if (sum1>answer){
            answer=sum1;
        }
        if (sum2>answer){
            answer=sum2;
        }

        return answer;
    }
}
