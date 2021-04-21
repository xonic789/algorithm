package inflearn.timeComplexity;

import java.util.Scanner;

public class 연속부분수열 {

    static int solution(int n, int m, int[] input){
        int answer = 0;
        int pointer = 0;
        int sum = 0;
        int i = 0;
        while (pointer<n){
            sum+=input[pointer++];
            if(sum==m){
                answer++;
                pointer=++i;
                sum=0;
            }else if(sum>m){
                pointer=++i;
                sum=0;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n];
        for (int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(extension(n,m,input));
    }

    static int extension(int n, int m, int[] input){
        int answer = 0;
        int lt=0;
        int sum=0;
        for (int rt=0; rt<n; rt++){
            sum+=input[rt];
            if(sum==m) answer++;
            while (sum>=m){
                sum-=input[lt++];
                if (sum==m){
                    answer++;
                }
            }
        }


        return answer;
    }
}
