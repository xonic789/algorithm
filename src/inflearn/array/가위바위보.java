package inflearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class 가위바위보 {

    static char[] solution(int n,int[] a,int[] b){
        char[] answer = new char[a.length];
        for (int i=0; i<n; i++){
            int result = a[i] - b[i];
            if(result==0) {
                answer[i] = 'D';
            }
            if(result==-1){
                answer[i] = 'B';
            }
            if(result==1){
                answer[i] = 'A';
            }
            if(result==-2){
                answer[i] = 'A';
            }
            if (result==2){
                answer[i] = 'B';
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int i=0; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        for (char x : solution(n,a,b)){
            System.out.println(x);
        }
    }
}
