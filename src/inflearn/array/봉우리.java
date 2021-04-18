package inflearn.array;

import java.util.Scanner;

public class 봉우리 {
    static int[] upDown = {-1,0,1,0};
    static int[] leftRight = {0,1,0,-1};

    static int solution(int n, int[][] input){
        int answer = 0;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                boolean temp = true;
                for (int k=0; k<4; k++){
                    int x = j+leftRight[k];
                    int y = i+upDown[k];
                    if(x>=0&&y>=0&&x<n&&y<n&&input[i][j]<=input[y][x]){
                        temp = false;
                        break;
                    }
                }
                if(temp){
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] input = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                input[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n,input));

    }
}
