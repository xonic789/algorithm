package inflearn.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수 {
    static boolean isPrime(int num){
        if(num == 1) return false;
        for (int i = 2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    static List<Integer> solution(int n, int[] input){
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<input.length; i++){
             int tmp = input[i];
             int res = 0;
             while (tmp>0){
                 int t = tmp % 10;
                 res = res * 10 + t;
                 tmp/=10;
             }
             if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
        }

        for(int x : solution(n,input)){
            System.out.print(x + " ");
        }
    }
}
