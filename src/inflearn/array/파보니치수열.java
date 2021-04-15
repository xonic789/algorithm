package inflearn.array;

import java.util.Scanner;

public class 파보니치수열 {

    static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i=2; i<n; i++){
            answer[i] = answer[i-2]+answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : solution(n)){
            System.out.print(x + " ");
        }
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
