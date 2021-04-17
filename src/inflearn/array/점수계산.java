package inflearn.array;

import java.util.Scanner;

public class 점수계산 {

    static int solution(int n,int[] input){
        int answer = 0;
        int temp= 0;
        for (int i=0; i<n; i++){
            if (input[i]==1){
                temp++;
                answer += temp;
            }
            if (input[i]==0){
                temp = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] input = new int[n];
        for (int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(solution(n,input));
    }
}
