package inflearn.array;

import java.util.Scanner;

public class 보이는학생 {

    static int solution(int n, int[] input){
        int answer = 0;
        int max = 0;
        for (int i=0; i<n; i++){
            if (i == 0){
                max = input[i];
                answer++;
            }
            if (input[i]>max){
                max = input[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(solution(n,input));
    }
}
