package inflearn.array;

import java.util.Scanner;

public class 멘토링 {

    static int solution(int n, int m, int[][] input){
        int answer = 0;
        int[] students = new int[n];

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                int positionI = 0;
                int positionJ = 0;
                int cnt = 0;
                for (int k=0;  k<m; k++){
                    for (int s=0; s<n; s++){
                        if(input[k][s]==i){
                            positionI = s;
                        }
                        if (input[k][s]==j){
                            positionJ = s;
                        }
                    }
                    if (positionI>positionJ){
                        cnt++;
                    }
                }
                if (cnt == m){
                    answer++;
                }
            }

        }


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
