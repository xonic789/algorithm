package inflearn.array;

import java.util.Scanner;

public class 멘토링 {

    static int solution(int n, int m, int[][] input){
        int answer = 0;
        


        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] input = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,m,input));
    }

}
