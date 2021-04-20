package inflearn.timeComplexity;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {

    static int solution(int n,int k,int[] input){
        int answer = 0;
        int temp = 0;
        int pointer = 0;
        int i = 0;
        while (pointer<n){
            answer+=input[pointer];
            if(k!=0&&input[pointer]==0){
                k--;
                answer++;
            }
            if(k==0) pointer++;
            if(k==0&&input[pointer]==0){
                pointer=++i;
                answer=0;
            } 
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
