package inflearn.timeComplexity;

import java.util.Scanner;

public class 최대매출 {

    static int solution(int n, int k, int[] input){
        int answer = 0;
        for (int i=0; i<k; i++){
            answer+=input[i];
        }
        int temp = answer;
        for (int i=k; i<n; i++){
            temp = temp+input[i]-input[i-k];
            answer = Math.max(answer, temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,input));
    }
}
