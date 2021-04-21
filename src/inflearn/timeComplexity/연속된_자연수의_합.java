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

        System.out.println(math(sc.nextInt()));
    }

    static int extension(int n){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++) arr[i] = i+1;

        for (int rt=0; rt<m; rt++){
            sum+=arr[rt];
            if(sum==n) answer++;
            while (sum>=n){
                sum-=arr[lt++];
                if (sum==n) answer++;
            }
        }

        return answer;
    }

    static int math(int n){
        int answer = 0;
        int cnt = 1;
        n--;
        while (n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }


        return answer;
    }
}
