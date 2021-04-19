package inflearn.timeComplexity;

import java.util.Scanner;

public class 연속된_자연수의_합 {

    static int solution(int n){
        int answer = 0;
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = i+1;
        }
        int pointer = 0;
        int i = 0;
        int sum = 0;
        while (pointer<n){
            sum+=arr[pointer++];
            if(pointer!=n&&sum==n){
                sum=0;
                pointer=++i;
                answer++;
            }else if(sum>n){
                pointer=++i;
                sum=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.nextInt()));
    }

}
