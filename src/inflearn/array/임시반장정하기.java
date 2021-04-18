package inflearn.array;

import java.util.Scanner;

public class 임시반장정하기 {

    static int solution(int n, int[][] input){
        int answer = 1;
        int temp = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            int cnt = 0;
            for (int j=0; j<n; j++){
                for (int k=0;k<5; k++){
                    if(input[i][k]==input[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>temp){
                temp = cnt;
                answer = i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][6];
        for(int i=0; i<n; i++){
            for (int j=0; j<5; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,input));
    }
}
